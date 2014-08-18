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
import com.glacier.frame.entity.website.WebsiteHelp;
import com.glacier.frame.service.website.WebsiteHelpService;

/**
 * @ClassName: WebsiteHelpController 
 * @Description: TODO(帮助中心的控制类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-18上午10:06:42
 */
@Controller
@RequestMapping(value = "/help")
public class WebsiteHelpController extends AbstractController{
	
	@Autowired
	private WebsiteHelpService websiteHelpService;// 注入帮助中心业务Bean

	// 进入帮助中心列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPhelp() {
        ModelAndView mav = new ModelAndView("website_mgr/help_mgr/help");
        return mav;
    }
    
    // 进入帮助中心Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoWebsiteHelpFormPhelp(String webHelpId) {
        ModelAndView mav = new ModelAndView("website_mgr/help_mgr/help_form");
        if(StringUtils.isNotBlank(webHelpId)){
            mav.addObject("helpData", websiteHelpService.getWebsiteHelp(webHelpId));
        }
        return mav;
    }
    
    // 进入帮助中心Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWebsiteHelpDetailPage(String webHelpId) {
        ModelAndView mav = new ModelAndView("website_mgr/help_mgr/help_detail");
        if(StringUtils.isNotBlank(webHelpId)){
            mav.addObject("helpData", websiteHelpService.getWebsiteHelp(webHelpId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return websiteHelpService.listAsGrid(pservicer);
    }
    
    // 增加帮助中心
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addWebsiteHelp(@Valid WebsiteHelp help, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return websiteHelpService.addWebsiteHelp(help);
    }
    
    // 修改帮助中心
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editWebsiteHelp(@Valid WebsiteHelp help, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return websiteHelpService.editWebsiteHelp(help);
    }
    
    // 批量删除帮助中心
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delWebsiteHelp(@RequestParam List<String> webHelpIds,@RequestParam List<String> webHelpThemes) {
    	return websiteHelpService.delWebsiteHelp(webHelpIds, webHelpThemes);
    }
}
