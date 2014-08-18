/*
 * @(#)WebsiteAdvertisementController.java
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
import com.glacier.frame.entity.website.WebsiteAdvertisement;
import com.glacier.frame.service.website.WebsiteAdvertisementService;

/** 
 * @ClassName: WebsiteAdvertisementController 
 * @Description: TODO(广告的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/advertisement")
public class WebsiteAdvertisementController extends AbstractController{

    @Autowired
    private WebsiteAdvertisementService advertisementService;// 注入广告业务Bean
    
    // 进入广告列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPadvertisement() {
        ModelAndView mav = new ModelAndView("website_mgr/advertisement_mgr/advertisement");
        return mav;
    }
    
    // 进入广告Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoAdvertisementFormPadvertisement(String webAdvId) {
        ModelAndView mav = new ModelAndView("website_mgr/advertisement_mgr/advertisement_form");
        if(StringUtils.isNotBlank(webAdvId)){
            mav.addObject("advertisementData", advertisementService.getAdvertisement(webAdvId));
        }
        return mav;
    }
    
    // 进入广告Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoAdvertisementDetailPage(String webAdvId) {
        ModelAndView mav = new ModelAndView("website_mgr/advertisement_mgr/advertisement_detail");
        if(StringUtils.isNotBlank(webAdvId)){
            mav.addObject("advertisementData", advertisementService.getAdvertisement(webAdvId));
        }
        return mav;
    }
    
    // 获取表格结构的所有广告数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listAdvertisementAsGridByMenuId(JqPager padvertisementr) {
        return advertisementService.listAsGrid(padvertisementr);
    }
    
    // 增加广告
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAdvertisement(@Valid WebsiteAdvertisement advertisement, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return advertisementService.addAdvertisement(advertisement);
    }
    
    // 修改广告
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editAdvertisement(@Valid WebsiteAdvertisement advertisement, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return advertisementService.editAdvertisement(advertisement);
    }
    
    // 批量删除广告
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delAdv(@RequestParam List<String> webAdvIds,@RequestParam List<String> webAdvThemes) {
    	return advertisementService.delAdvertisement(webAdvIds, webAdvThemes);
    }
}
