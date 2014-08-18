/*
 * @(#)WebsiteNewsController.java
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
import com.glacier.frame.entity.website.WebsiteNews;
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
    
    // 进入新闻列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPnews() {
        ModelAndView mav = new ModelAndView("website_mgr/news_mgr/news");
        return mav;
    }
    
    // 进入新闻Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoNewsFormPnews(String webNewsId) {
        ModelAndView mav = new ModelAndView("website_mgr/news_mgr/news_form");
        if(StringUtils.isNotBlank(webNewsId)){
            mav.addObject("newsData", newsService.getNews(webNewsId));
        }
        return mav;
    }
    
    // 进入新闻Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoNewsDetailPage(String webNewsId) {
        ModelAndView mav = new ModelAndView("website_mgr/news_mgr/news_detail");
        if(StringUtils.isNotBlank(webNewsId)){
            mav.addObject("newsData", newsService.getNews(webNewsId));
        }
        return mav;
    }
    
    // 获取表格结构的所有新闻数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listNewsAsGridByMenuId(JqPager pnewsr) {
        return newsService.listAsGrid(pnewsr);
    }
    
    // 增加新闻
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addNews(@Valid WebsiteNews news, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return newsService.addNews(news);
    }
    
    // 修改新闻
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editNews(@Valid WebsiteNews news, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return newsService.editNews(news);
    }
    
    // 批量删除新闻
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delNews(@RequestParam List<String> webNewsIds,@RequestParam List<String> webNewsThemes) {
    	return newsService.delNews(webNewsIds, webNewsThemes);
    }
}
