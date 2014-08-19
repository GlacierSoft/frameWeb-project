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
import com.glacier.frame.service.website.WebsiteLinkService;

/** 
 * @ClassName: WebsiteLinkController 
 * @Description: TODO(友情链接的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/link")
public class WebsiteLinkController extends AbstractController{

    @Autowired
    private WebsiteLinkService linkService;// 注入友情链接业务Bean 
    // 获取表格结构的所有友情链接数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listLinkAsGridByMenuId(JqPager plinkr) {
        return linkService.listAsGrid(plinkr);
    } 
}