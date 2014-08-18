package com.glacier.frame.service.website;

import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dao.website.WebsiteServiceMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteService;
import com.glacier.frame.entity.website.WebsiteServiceExample;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: WebsiteServiceService 
 * @Description: TODO(客服服务业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-15下午1:27:21
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class WebsiteServiceService {

	@Autowired
	private WebsiteServiceMapper websiteServiceMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getWebsiteService 
	 * @Description: TODO(根据客服Id获取客服信息) 
	 * @param @param webServiceId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getWebsiteService(String webServiceId) {
    	WebsiteService websiteService = websiteServiceMapper.selectByPrimaryKey(webServiceId);
        return websiteService;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有客服信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteServiceExample websiteServiceExample = new WebsiteServiceExample();;
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteServiceExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteServiceExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteServiceExample.setOrderByClause(pager.getOrderBy("temp_website_service_"));
        }
        List<WebsiteService>  websiteServices = websiteServiceMapper.selectByExample(websiteServiceExample); // 查询所有客服列表
        int total = websiteServiceMapper.countByExample(websiteServiceExample); // 查询总页数
        returnResult.setRows(websiteServices);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addWebsiteService 
     * @Description: TODO(新增客服) 
     * @param @param websiteService
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ServiceList_add")
    public Object addWebsiteService(WebsiteService websiteService) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteServiceExample websiteServiceExample = new WebsiteServiceExample();
        int count = 0;
        // 防止客服名称重复
        websiteServiceExample.createCriteria().andWebServiceNameEqualTo(websiteService.getWebServiceName());
        count = websiteServiceMapper.countByExample(websiteServiceExample);// 查找相同名称的客服数量
        if (count > 0) {
            returnResult.setMsg("客服名称重复");
            return returnResult;
        }
        websiteService.setWebServiceId(RandomGUID.getRandomGUID());
        websiteService.setCreater(pricipalUser.getUserId());
        websiteService.setCreateTime(new Date());
        websiteService.setUpdater(pricipalUser.getUserId());
        websiteService.setUpdateTime(new Date());
        count = websiteServiceMapper.insert(websiteService);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + websiteService.getWebServiceName() + "] 客服信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客服信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editWebsiteService 
     * @Description: TODO(修改客服) 
     * @param @param websiteService
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ServiceList_edit")
    public Object editWebsiteService(WebsiteService websiteService) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteServiceExample websiteServiceExample = new WebsiteServiceExample();
        int count = 0;
        // 防止客服名称重复
        websiteServiceExample.createCriteria().andWebServiceIdNotEqualTo(websiteService.getWebServiceId()).andWebServiceNameEqualTo(websiteService.getWebServiceName());
        count = websiteServiceMapper.countByExample(websiteServiceExample);// 查找相同名称的客服数量
        if (count > 0) {
            returnResult.setMsg("客服名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        websiteService.setUpdater(pricipalUser.getUserId());
        websiteService.setUpdateTime(new Date());
        count = websiteServiceMapper.updateByPrimaryKeySelective(websiteService);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + websiteService.getWebServiceName() + "] 客服信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，客服信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delWebsiteService 
     * @Description: TODO(删除客服) 
     * @param @param webServiceIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ServiceList_del")
    public Object delWebsiteService(List<String> webServiceIds, List<String> webServiceNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webServiceIds.size() > 0) {
        	WebsiteServiceExample websiteServiceExample = new WebsiteServiceExample();
        	websiteServiceExample.createCriteria().andWebServiceIdIn(webServiceIds);
            count = websiteServiceMapper.deleteByExample(websiteServiceExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webServiceNames, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，客服信息删除失败");
            }
        }
        return returnResult;
    }
}
