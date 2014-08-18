/*
 * @(#)WebsiteLinkService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
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
import com.glacier.frame.dao.website.WebsiteLinkMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteLink;
import com.glacier.frame.entity.website.WebsiteLinkExample;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: WebsiteLinkService 
 * @Description: TODO(友情链接业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteLinkService {

	@Autowired
    private WebsiteLinkMapper linkMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getLink 
	 * @Description: TODO(根据友情链接Id获取友情链接信息) 
	 * @param @param webLinkId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getLink(String webLinkId) {
    	WebsiteLink websiteLink = linkMapper.selectByPrimaryKey(webLinkId);
        return websiteLink;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有友情链接信息) 
     * @param @param plinkr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager plinkr) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteLinkExample websiteLinkExample = new WebsiteLinkExample();
        if (null != plinkr.getPage() && null != plinkr.getRows()) {// 设置排序信息
        	websiteLinkExample.setLimitStart((plinkr.getPage() - 1) * plinkr.getRows());
        	websiteLinkExample.setLimitEnd(plinkr.getRows());
        }
        if (StringUtils.isNotBlank(plinkr.getSort()) && StringUtils.isNotBlank(plinkr.getOrder())) {// 设置排序信息
        	websiteLinkExample.setOrderByClause(plinkr.getOrderBy("temp_website_link_"));
        }
        List<WebsiteLink>  websiteLinks = linkMapper.selectByExample(websiteLinkExample); // 查询所有友情链接列表
        int total = linkMapper.countByExample(websiteLinkExample); // 查询总页数
        returnResult.setRows(websiteLinks);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addLink 
     * @Description: TODO(新增友情链接) 
     * @param @param link
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "LinkList_add")
    public Object addLink(WebsiteLink link) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteLinkExample linkExample = new WebsiteLinkExample();
        int count = 0;
        // 防止友情链接主题重复
        linkExample.createCriteria().andWebLinkNameEqualTo(link.getWebLinkName());
        count = linkMapper.countByExample(linkExample);// 查找相同主题的友情链接数量
        if (count > 0) {
            returnResult.setMsg("友情链接主题重复");
            return returnResult;
        }
        link.setWebLinkId(RandomGUID.getRandomGUID());
        link.setCreater(pricipalUser.getUserId());
        link.setCreateTime(new Date());
        link.setUpdater(pricipalUser.getUserId());
        link.setUpdateTime(new Date());
        count = linkMapper.insert(link);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + link.getWebLinkName() + "] 友情链接信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，友情链接信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editLink 
     * @Description: TODO(修改友情链接) 
     * @param @param link
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "LinkList_edit")
    public Object editLink(WebsiteLink link) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteLinkExample linkExample = new WebsiteLinkExample();
        int count = 0;
        // 防止友情链接主题重复
        linkExample.createCriteria().andWebLinkIdNotEqualTo(link.getWebLinkId()).andWebLinkNameEqualTo(link.getWebLinkName());
        count = linkMapper.countByExample(linkExample);// 查找相同主题的友情链接数量
        if (count > 0) {
            returnResult.setMsg("友情链接主题重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        link.setUpdater(pricipalUser.getUserId());
        link.setUpdateTime(new Date());
        count = linkMapper.updateByPrimaryKeySelective(link);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + link.getWebLinkName() + "] 友情链接信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，友情链接信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delLink 
     * @Description: TODO(删除友情链接) 
     * @param @param webLinkIds
     * @param @param linkNames
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "LinkList_del")
    public Object delLink(List<String> webLinkIds, List<String> webLinkNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webLinkIds.size() > 0) {
        	WebsiteLinkExample linkExample = new WebsiteLinkExample();
        	linkExample.createCriteria().andWebLinkIdIn(webLinkIds);
            count = linkMapper.deleteByExample(linkExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webLinkNames, ",") + " ]友情链接");
            } else {
                returnResult.setMsg("发生未知错误，友情链接信息删除失败");
            }
        }
        return returnResult;
    }
}
