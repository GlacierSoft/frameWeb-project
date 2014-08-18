/*
 * @(#)WebsiteAnnouncementService.java
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
import com.glacier.frame.dao.website.WebsiteAnnouncementMapper;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.website.WebsiteAnnouncement;
import com.glacier.frame.entity.website.WebsiteAnnouncementExample;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: WebsiteAnnouncementService 
 * @Description: TODO(公告业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteAnnouncementService {

	@Autowired
    private WebsiteAnnouncementMapper announcementMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getAnnouncement 
	 * @Description: TODO(根据公告Id获取公告信息) 
	 * @param @param webAnnId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    @Transactional(readOnly = false)
    public Object getAnnouncement(String webAnnId) {
    	WebsiteAnnouncement websiteAnnouncement = announcementMapper.selectByPrimaryKey(webAnnId); 
        websiteAnnouncement.setClicks(websiteAnnouncement.getClicks()+1);
    	announcementMapper.updateByPrimaryKeySelective(websiteAnnouncement);
    	return websiteAnnouncement;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有公告信息) 
     * @param @param pannouncementr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        WebsiteAnnouncementExample websiteAnnouncementExample = new WebsiteAnnouncementExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteAnnouncementExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteAnnouncementExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteAnnouncementExample.setOrderByClause(pager.getOrderBy("temp_website_announcement_"));
        }
        List<WebsiteAnnouncement>  websiteAnnouncements = announcementMapper.selectByExample(websiteAnnouncementExample); // 查询所有公告列表
        int total = announcementMapper.countByExample(websiteAnnouncementExample); // 查询总页数
        returnResult.setRows(websiteAnnouncements);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: listAsWebsite 
     * @Description: TODO(前台展示网站公告信息) 
     * @param @param pager
     * @param @param p
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsWebsite(JqPager pager, int p) {
    	JqGridReturn returnResult = new JqGridReturn();
        WebsiteAnnouncementExample websiteAnnouncementExample = new WebsiteAnnouncementExample();
        websiteAnnouncementExample.createCriteria().andWebAnnStatusEqualTo("enable");
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteAnnouncementExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteAnnouncementExample.setLimitEnd(pager.getRows());
        }
        pager.setSort("webAnnNum");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteAnnouncementExample.setOrderByClause(pager.getOrderBy("temp_website_announcement_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        websiteAnnouncementExample.setLimitStart(startTemp);
        websiteAnnouncementExample.setLimitEnd(10);
        List<WebsiteAnnouncement>  websiteAnnouncements = announcementMapper.selectByExample(websiteAnnouncementExample); // 查询所有公告列表
        int total = announcementMapper.countByExample(websiteAnnouncementExample); // 查询总页数
        returnResult.setRows(websiteAnnouncements);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: addAnnouncement 
     * @Description: TODO(新增公告) 
     * @param @param announcement
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AnnouncementList_add")
    public Object addAnnouncement(WebsiteAnnouncement announcement) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteAnnouncementExample announcementExample = new WebsiteAnnouncementExample();
        int count = 0;
        // 防止公告主题重复
        announcementExample.createCriteria().andWebAnnThemeEqualTo(announcement.getWebAnnTheme());
        count = announcementMapper.countByExample(announcementExample);// 查找相同主题的公告数量
        if (count > 0) {
            returnResult.setMsg("公告主题重复");
            return returnResult;
        }
        announcement.setWebAnnId(RandomGUID.getRandomGUID());
        announcement.setClicks(0);
        announcement.setCreater(pricipalUser.getUserId());
        announcement.setCreateTime(new Date());
        announcement.setUpdater(pricipalUser.getUserId());
        announcement.setUpdateTime(new Date());
        count = announcementMapper.insert(announcement);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + announcement.getWebAnnTheme() + "] 公告信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，公告信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editAnnouncement 
     * @Description: TODO(修改公告) 
     * @param @param announcement
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AnnouncementList_edit")
    public Object editAnnouncement(WebsiteAnnouncement announcement) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteAnnouncementExample announcementExample = new WebsiteAnnouncementExample();
        int count = 0;
        // 防止公告主题重复
        announcementExample.createCriteria().andWebAnnIdNotEqualTo(announcement.getWebAnnId()).andWebAnnThemeEqualTo(announcement.getWebAnnTheme());
        count = announcementMapper.countByExample(announcementExample);// 查找相同主题的公告数量
        if (count > 0) {
            returnResult.setMsg("公告主题重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        announcement.setUpdater(pricipalUser.getUserId());
        announcement.setUpdateTime(new Date());
        count = announcementMapper.updateByPrimaryKeySelective(announcement);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + announcement.getWebAnnTheme() + "] 公告信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，公告信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delAnnouncement 
     * @Description: TODO(删除公告) 
     * @param @param webAnnIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AnnouncementList_del")
    public Object delAnnouncement(List<String> webAnnIds, List<String> webAnnThemes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (webAnnIds.size() > 0) {
        	WebsiteAnnouncementExample announcementExample = new WebsiteAnnouncementExample();
        	announcementExample.createCriteria().andWebAnnIdIn(webAnnIds);
            count = announcementMapper.deleteByExample(announcementExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webAnnThemes, ",") + " ]公告");
            } else {
                returnResult.setMsg("发生未知错误，公告信息删除失败");
            }
        }
        return returnResult;
    }
}
