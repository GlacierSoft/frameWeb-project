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
import com.glacier.frame.dao.website.WebsiteHiringMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteHiring;
import com.glacier.frame.entity.website.WebsiteHiringExample;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: WebsiteHiringService 
 * @Description: TODO(招聘管理业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-18下午2:02:14
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class WebsiteHiringService {

	@Autowired
	private WebsiteHiringMapper websiteHiringMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getWebsiteHiring 
	 * @Description: TODO(根据招聘管理Id获取招聘管理信息) 
	 * @param @param webHiringId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getWebsiteHiring(String webHiringId) {
    	WebsiteHiring websiteHiring = websiteHiringMapper.selectByPrimaryKey(webHiringId);
        return websiteHiring;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(表格获取所有招聘管理信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteHiringExample websiteHiringExample = new WebsiteHiringExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteHiringExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteHiringExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteHiringExample.setOrderByClause(pager.getOrderBy("temp_website_hiring_"));
        }
        List<WebsiteHiring>  websiteHirings = websiteHiringMapper.selectByExample(websiteHiringExample); // 查询所有招聘管理列表
        int total = websiteHiringMapper.countByExample(websiteHiringExample); // 查询总页数
        returnResult.setRows(websiteHirings);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAsWebsite 
     * @Description: TODO(前台展示页面获取所有招聘管理信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsWebsite(JqPager pager, int p) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteHiringExample websiteHiringExample = new WebsiteHiringExample();
        websiteHiringExample.createCriteria().andWebHiringStatusEqualTo("enable");//获取启用状态的招聘信息
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteHiringExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteHiringExample.setLimitEnd(pager.getRows());
        }
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteHiringExample.setOrderByClause(pager.getOrderBy("temp_website_hiring_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        websiteHiringExample.setLimitStart(startTemp);
        websiteHiringExample.setLimitEnd(5);
        List<WebsiteHiring>  websiteHirings = websiteHiringMapper.selectByExample(websiteHiringExample); // 查询所有招聘管理列表
        int total = websiteHiringMapper.countByExample(websiteHiringExample); // 查询总页数
        returnResult.setRows(websiteHirings);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: addWebsiteHiring 
     * @Description: TODO(新增招聘管理) 
     * @param @param websiteHiring
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "HiringList_add")
    public Object addWebsiteHiring(WebsiteHiring websiteHiring) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteHiringExample websiteHiringExample = new WebsiteHiringExample();
        int count = 0;
        // 防止招聘管理名称重复
        websiteHiringExample.createCriteria().andWebHiringThemeEqualTo(websiteHiring.getWebHiringTheme());
        count = websiteHiringMapper.countByExample(websiteHiringExample);// 查找相同名称的招聘管理数量
        if (count > 0) {
            returnResult.setMsg("招聘管理名称重复");
            return returnResult;
        }
        websiteHiring.setWebHiringId(RandomGUID.getRandomGUID());
        websiteHiring.setCreater(pricipalUser.getUserId());
        websiteHiring.setCreateTime(new Date());
        websiteHiring.setUpdater(pricipalUser.getUserId());
        websiteHiring.setUpdateTime(new Date());
        count = websiteHiringMapper.insert(websiteHiring);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + websiteHiring.getWebHiringTheme() + "] 招聘管理信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，招聘管理信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editWebsiteHiring 
     * @Description: TODO(修改招聘管理) 
     * @param @param websiteHiring
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "HiringList_edit")
    public Object editWebsiteHiring(WebsiteHiring websiteHiring) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteHiringExample websiteHiringExample = new WebsiteHiringExample();
        int count = 0;
        // 防止招聘管理名称重复
        websiteHiringExample.createCriteria().andWebHiringIdNotEqualTo(websiteHiring.getWebHiringId()).andWebHiringThemeEqualTo(websiteHiring.getWebHiringTheme());
        count = websiteHiringMapper.countByExample(websiteHiringExample);// 查找相同名称的招聘管理数量
        if (count > 0) {
            returnResult.setMsg("招聘管理名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        websiteHiring.setUpdater(pricipalUser.getUserId());
        websiteHiring.setUpdateTime(new Date());
        count = websiteHiringMapper.updateByPrimaryKeySelective(websiteHiring);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + websiteHiring.getWebHiringTheme() + "] 招聘管理信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，招聘管理信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delWebsiteHiring 
     * @Description: TODO(删除招聘管理) 
     * @param @param webHiringIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "HiringList_del")
    public Object delWebsiteHiring(List<String> webHiringIds, List<String> webHiringThemes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webHiringIds.size() > 0) {
        	WebsiteHiringExample websiteHiringExample = new WebsiteHiringExample();
        	websiteHiringExample.createCriteria().andWebHiringIdIn(webHiringIds);
            count = websiteHiringMapper.deleteByExample(websiteHiringExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webHiringThemes, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，招聘管理信息删除失败");
            }
        }
        return returnResult;
    }
}
