/*
 * @(#)WebsiteLinkController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.website; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.frame.service.website.WebsiteNavService;

/** 
 * @ClassName: WebsiteLinkController 
 * @Description: TODO(网站导航的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/nav")
public class WebsiteNavController extends AbstractController{

    @Autowired
    private WebsiteNavService navService;// 注入网站导航业务Bean 
    // 根据网站导航ID取出子项信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object getSubitemWebNav(String webNavId) {
        return navService.getSubitemWebNav(webNavId);
    } 
    
    @RequestMapping(value = "/levelWebNav.json")
    @ResponseBody
    private Object getOneLevelWebNav(String webNavId) {
        return navService.getOneLevelWebNav();
    } 
}



