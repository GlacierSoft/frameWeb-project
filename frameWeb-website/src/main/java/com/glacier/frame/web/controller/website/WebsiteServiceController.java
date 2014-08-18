/*
 * @(#)WebsiteWebsiteServiceController.java
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
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return websiteServiceService.listAsGrid(pservicer);
    } 
}
