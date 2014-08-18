/*
 * @(#)WebsiteNewsController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.website; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.service.website.WebsiteNewsService;

/** 
 * @ClassName: WebsiteNewsController 
 * @Description: TODO(新闻的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/news")
public class WebsiteNewsController extends AbstractController{

    @Autowired
    private WebsiteNewsService newsService;// 注入新闻业务Bean
    
    //转到“网站新闻”页面
  	@RequestMapping(value = "/news.htm")
  	public Object hiring(JqPager pager, @RequestParam int p){
  		ModelAndView mav = new ModelAndView("about_mgr/news");
  		mav.addObject("newsDatas", newsService.listAsWebsite(pager, p));
  		return mav;
  	}
  	
  	//转到“网站新闻”详细页面
  	@RequestMapping(value = "/newsDetail.htm")
  	public Object newsDetail(String webNewsId){
  		ModelAndView mav = new ModelAndView("about_mgr/newsDetail");
  		mav.addObject("newsData", newsService.getNews(webNewsId));
  		return mav;
  	}
  	
    // 进入新闻列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPnews() {
        ModelAndView mav = new ModelAndView("website_mgr/news_mgr/news");
        return mav;
    }
     
    
    // 获取表格结构的所有新闻数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listNewsAsGridByMenuId(JqPager pnewsr) {
        return newsService.listAsGrid(pnewsr);
    } 
}
