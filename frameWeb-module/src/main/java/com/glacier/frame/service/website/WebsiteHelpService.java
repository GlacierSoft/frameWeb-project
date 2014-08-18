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
import com.glacier.frame.dao.website.WebsiteHelpMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteHelp;
import com.glacier.frame.entity.website.WebsiteHelpExample;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: WebsiteHelpService 
 * @Description: TODO(帮助中心业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-18上午9:10:31
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class WebsiteHelpService {

	@Autowired
	private WebsiteHelpMapper websiteHelpMapper;
	
	/**
	 * @Title: getWebsiteHelp 
	 * @Description: TODO(根据帮助中心Id获取帮助中心信息) 
	 * @param @param webHelpId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getWebsiteHelp(String webHelpId) {
    	WebsiteHelp websiteHelp = websiteHelpMapper.selectByPrimaryKey(webHelpId);
        return websiteHelp;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有帮助中心信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteHelpExample websiteHelpExample = new WebsiteHelpExample();;
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteHelpExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteHelpExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteHelpExample.setOrderByClause(pager.getOrderBy("temp_website_help_"));
        }
        List<WebsiteHelp>  websiteHelps = websiteHelpMapper.selectByExample(websiteHelpExample); // 查询所有帮助中心列表
        int total = websiteHelpMapper.countByExample(websiteHelpExample); // 查询总页数
        returnResult.setRows(websiteHelps);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addWebsiteHelp 
     * @Description: TODO(新增帮助中心) 
     * @param @param websiteHelp
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "HelpList_add")
    public Object addWebsiteHelp(WebsiteHelp websiteHelp) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteHelpExample websiteHelpExample = new WebsiteHelpExample();
        int count = 0;
        // 防止帮助中心名称重复
        websiteHelpExample.createCriteria().andWebHelpThemeEqualTo(websiteHelp.getWebHelpTheme());
        count = websiteHelpMapper.countByExample(websiteHelpExample);// 查找相同名称的帮助中心数量
        if (count > 0) {
            returnResult.setMsg("帮助中心名称重复");
            return returnResult;
        }
        websiteHelp.setWebHelpId(RandomGUID.getRandomGUID());
        websiteHelp.setCreater(pricipalUser.getUserId());
        websiteHelp.setCreateTime(new Date());
        websiteHelp.setUpdater(pricipalUser.getUserId());
        websiteHelp.setUpdateTime(new Date());
        count = websiteHelpMapper.insert(websiteHelp);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + websiteHelp.getWebHelpTheme() + "] 帮助中心信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，帮助中心信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editWebsiteHelp 
     * @Description: TODO(修改帮助中心) 
     * @param @param websiteHelp
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "HelpList_edit")
    public Object editWebsiteHelp(WebsiteHelp websiteHelp) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteHelpExample websiteHelpExample = new WebsiteHelpExample();
        int count = 0;
        // 防止帮助中心名称重复
        websiteHelpExample.createCriteria().andWebHelpIdNotEqualTo(websiteHelp.getWebHelpId()).andWebHelpThemeEqualTo(websiteHelp.getWebHelpTheme());
        count = websiteHelpMapper.countByExample(websiteHelpExample);// 查找相同名称的帮助中心数量
        if (count > 0) {
            returnResult.setMsg("帮助中心名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        websiteHelp.setUpdater(pricipalUser.getUserId());
        websiteHelp.setUpdateTime(new Date());
        count = websiteHelpMapper.updateByPrimaryKeySelective(websiteHelp);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + websiteHelp.getWebHelpTheme() + "] 帮助中心信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，帮助中心信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delWebsiteHelp 
     * @Description: TODO(删除帮助中心) 
     * @param @param webHelpIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "HelpList_del")
    public Object delWebsiteHelp(List<String> webHelpIds, List<String> webHelpThemes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webHelpIds.size() > 0) {
        	WebsiteHelpExample websiteHelpExample = new WebsiteHelpExample();
        	websiteHelpExample.createCriteria().andWebHelpIdIn(webHelpIds);
            count = websiteHelpMapper.deleteByExample(websiteHelpExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webHelpThemes, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，帮助中心信息删除失败");
            }
        }
        return returnResult;
    }
}
