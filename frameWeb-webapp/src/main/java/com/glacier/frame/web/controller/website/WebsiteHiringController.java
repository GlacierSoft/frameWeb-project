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
import com.glacier.frame.entity.website.WebsiteHiring;
import com.glacier.frame.service.website.WebsiteHiringService;

/**
 * @ClassName: WebsiteHiringController 
 * @Description: TODO(招聘管理控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-18下午2:32:50
 */
@Controller
@RequestMapping(value = "hiring")
public class WebsiteHiringController extends AbstractController{

	@Autowired
	private WebsiteHiringService websiteHiringService;// 注入招聘管理业务Bean
	
	 // 进入招聘管理列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPhiring() {
        ModelAndView mav = new ModelAndView("website_mgr/hiring_mgr/hiring");
        return mav;
    }
    
    // 进入招聘管理Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoWebsiteHiringFormPhiring(String webHiringId) {
        ModelAndView mav = new ModelAndView("website_mgr/hiring_mgr/hiring_form");
        if(StringUtils.isNotBlank(webHiringId)){
            mav.addObject("hiringData", websiteHiringService.getWebsiteHiring(webHiringId));
        }
        return mav;
    }
    
    // 进入招聘管理Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWebsiteHiringDetailPage(String webHiringId) {
        ModelAndView mav = new ModelAndView("website_mgr/hiring_mgr/hiring_detail");
        if(StringUtils.isNotBlank(webHiringId)){
            mav.addObject("hiringData", websiteHiringService.getWebsiteHiring(webHiringId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager page) {
        return websiteHiringService.listAsGrid(page);
    }
    
    // 增加招聘管理
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addWebsiteHiring(@Valid WebsiteHiring hiring, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return websiteHiringService.addWebsiteHiring(hiring);
    }
    
    // 修改招聘管理
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editWebsiteHiring(@Valid WebsiteHiring hiring, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return websiteHiringService.editWebsiteHiring(hiring);
    }
    
    // 批量删除招聘管理
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delWebsiteHiring(@RequestParam List<String> webHiringIds,@RequestParam List<String> webHiringThemes) {
    	return websiteHiringService.delWebsiteHiring(webHiringIds, webHiringThemes);
    }
}
