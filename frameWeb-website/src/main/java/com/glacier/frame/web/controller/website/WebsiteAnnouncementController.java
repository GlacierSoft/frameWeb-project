/*
 * @(#)WebsiteAnnouncementController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
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
    
    //转到“网站公告”页面
  	@RequestMapping(value = "/announcement.htm")
  	public Object announcement(JqPager pager, @RequestParam int p){
  		ModelAndView mav = new ModelAndView("about_mgr/announcement");
  		mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, p));
  		return mav;
  	}
  	
  	//转到“网站公告”页面
  	@RequestMapping(value = "/announcementDetail.htm")
  	public Object announcementDetail(String webAnnId){
  		ModelAndView mav = new ModelAndView("about_mgr/announcementDetail");
  		mav.addObject("announcementData", announcementService.getAnnouncement(webAnnId));
  		return mav;
  	}
}
