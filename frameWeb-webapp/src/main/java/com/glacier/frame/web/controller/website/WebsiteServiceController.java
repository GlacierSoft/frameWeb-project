/*
 * @(#)WebsiteWebsiteServiceController.java
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
import com.glacier.frame.entity.website.WebsiteService;
import com.glacier.frame.service.website.WebsiteServiceService;

/**
 * @ClassName: WebsiteServiceController 
 * @Description: TODO(客服类的控制器) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-15下午2:03:16
 */
@Controller
@RequestMapping(value = "/service")
public class WebsiteServiceController extends AbstractController{

    @Autowired
    private WebsiteServiceService websiteServiceService;// 注入客服业务Bean
    
    // 进入客服列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPservice() {
        ModelAndView mav = new ModelAndView("website_mgr/service_mgr/service");
        return mav;
    }
    
    // 进入客服Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoWebsiteServiceFormPservice(String webServiceId) {
        ModelAndView mav = new ModelAndView("website_mgr/service_mgr/service_form");
        if(StringUtils.isNotBlank(webServiceId)){
            mav.addObject("serviceData", websiteServiceService.getWebsiteService(webServiceId));
        }
        return mav;
    }
    
    // 进入客服Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWebsiteServiceDetailPage(String webServiceId) {
        ModelAndView mav = new ModelAndView("website_mgr/service_mgr/service_detail");
        if(StringUtils.isNotBlank(webServiceId)){
            mav.addObject("serviceData", websiteServiceService.getWebsiteService(webServiceId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return websiteServiceService.listAsGrid(pservicer);
    }
    
    // 增加客服
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addWebsiteService(@Valid WebsiteService service, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return websiteServiceService.addWebsiteService(service);
    }
    
    // 修改客服
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editWebsiteService(@Valid WebsiteService service, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return websiteServiceService.editWebsiteService(service);
    }
    
    // 批量删除客服
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delWebsiteService(@RequestParam List<String> webServiceIds,@RequestParam List<String> webServiceNames) {
    	return websiteServiceService.delWebsiteService(webServiceIds, webServiceNames);
    }
}
