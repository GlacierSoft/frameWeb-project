/*
 * @(#)WebsiteAnnouncementController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.website;

import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.entity.website.WebsiteAnnouncement;
import com.glacier.frame.service.website.WebsiteAnnouncementService;

/** 
 * @ClassName: WebsiteAnnouncementController 
 * @Description: TODO(公告的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/announcement")
public class WebsiteAnnouncementController extends AbstractController{

    @Autowired
    private WebsiteAnnouncementService announcementService;// 注入公告业务Bean
    
    // 进入公告列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPannouncement() {
        ModelAndView mav = new ModelAndView("website_mgr/announcement_mgr/announcement");
        return mav;
    }
    
    // 进入公告Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoAnnouncementFormPannouncement(String webAnnId) {
        ModelAndView mav = new ModelAndView("website_mgr/announcement_mgr/announcement_form");
        if(StringUtils.isNotBlank(webAnnId)){
            mav.addObject("announcementData", announcementService.getAnnouncement(webAnnId));
        }
        return mav;
    }
    
    // 进入公告Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoAnnouncementDetailPage(String webAnnId) {
        ModelAndView mav = new ModelAndView("website_mgr/announcement_mgr/announcement_detail");
        if(StringUtils.isNotBlank(webAnnId)){
            mav.addObject("announcementData", announcementService.getAnnouncement(webAnnId));
        }
        return mav;
    }
    
    // 获取表格结构的所有公告数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listAnnouncementAsGridByMenuId(JqPager pager) {
        return announcementService.listAsGrid(pager);
    }
    
    // 增加公告
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAnnouncement(@Valid WebsiteAnnouncement announcement, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return announcementService.addAnnouncement(announcement);
    }
    
    // 修改公告
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editAnnouncement(@Valid WebsiteAnnouncement announcement, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return announcementService.editAnnouncement(announcement);
    }
    
    // 批量删除公告
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delAnn(@RequestParam List<String> webAnnIds,@RequestParam List<String> webAnnThemes) {
    	return announcementService.delAnnouncement(webAnnIds, webAnnThemes);
    }
}
