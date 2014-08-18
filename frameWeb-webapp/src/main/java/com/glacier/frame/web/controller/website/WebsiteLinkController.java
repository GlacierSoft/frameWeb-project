/*
 * @(#)WebsiteLinkController.java
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
import com.glacier.frame.entity.website.WebsiteLink;
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
    
    // 进入友情链接列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPlink() {
        ModelAndView mav = new ModelAndView("website_mgr/link_mgr/link");
        return mav;
    }
    
    // 进入友情链接Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoLinkFormPlink(String webLinkId) {
        ModelAndView mav = new ModelAndView("website_mgr/link_mgr/link_form");
        if(StringUtils.isNotBlank(webLinkId)){
            mav.addObject("linkData", linkService.getLink(webLinkId));
        }
        return mav;
    }
    
    // 进入友情链接Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoLinkDetailPage(String webLinkId) {
        ModelAndView mav = new ModelAndView("website_mgr/link_mgr/link_detail");
        if(StringUtils.isNotBlank(webLinkId)){
            mav.addObject("linkData", linkService.getLink(webLinkId));
        }
        return mav;
    }
    
    // 获取表格结构的所有友情链接数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listLinkAsGridByMenuId(JqPager plinkr) {
        return linkService.listAsGrid(plinkr);
    }
    
    // 增加友情链接
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addLink(@Valid WebsiteLink link, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return linkService.addLink(link);
    }
    
    // 修改友情链接
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editLink(@Valid WebsiteLink link, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return linkService.editLink(link);
    }
    
    // 批量删除友情链接
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delLink(@RequestParam List<String> webLinkIds,@RequestParam List<String> webLinkNames) {
    	return linkService.delLink(webLinkIds, webLinkNames);
    }
}
