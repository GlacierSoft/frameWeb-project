package com.glacier.frame.web.controller.website;

import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.website.WebsiteNav;
import com.glacier.frame.service.website.WebsiteNavService;

/**
 * @ClassName: WebsiteNavController 
 * @Description: TODO(导航控制器) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-11上午10:19:52
 */
@Controller
@RequestMapping(value="/nav")
public class WebsiteNavController extends AbstractController{

	@Autowired
	private  WebsiteNavService websiteNavService;//注入导航业务类
	
	// 进入导航列表展示页面
	@RequestMapping(value="/index.htm")
	private Object intoIndexPnav(){
		ModelAndView mav = new ModelAndView("website_mgr/nav_mgr/nav");
		return mav;
	}
	
	// 获取菜单下的树结构的所有菜单数据
	@RequestMapping(value="list.json",method=RequestMethod.POST)
	@ResponseBody
	private Object listWebsiteNavsTreeByWebsiteNavId(){
		return websiteNavService.listAsTree();
	}
	
	// 进入导航Form表单页面
	@RequestMapping(value="/intoForm.htm")
	@ResponseBody
	private Object intowebsiteNavFormPnav(String webNavId){
		ModelAndView  mav = new ModelAndView("website_mgr/nav_mgr/nav_form");
		mav.addObject("allWebsiteNavTreeNodeData",websiteNavService.getAllTreeNavNode(true, ""));
		if(StringUtils.isNotBlank(webNavId)){
			mav.addObject("websiteNavData", websiteNavService.getNav(webNavId));
		}
		return mav;
	}
	
	// 进入导航Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoNavDetailPage(String webNavId) {
        ModelAndView mav = new ModelAndView("website_mgr/nav_mgr/nav_detail");
        if(StringUtils.isNotBlank(webNavId)){
            mav.addObject("websiteNavData", websiteNavService.getNav(webNavId));
        }
        return mav;
    }
	
	// 增加导航
	@RequestMapping(value="/add.json",method=RequestMethod.POST)
	@ResponseBody
	private Object addNav(@Valid WebsiteNav nav,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return returnErrorBindingResult(bindingResult);
		}
		return websiteNavService.addNav(nav);
	}
	
	// 修改导航
	@RequestMapping(value="/edit.json",method=RequestMethod.POST)
	@ResponseBody
	private Object editNav(@Valid WebsiteNav nav,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return returnErrorBindingResult(bindingResult);
		}
		return websiteNavService.editNav(nav);
	}
	
	// 删除导航
	@RequestMapping(value="/del.json",method=RequestMethod.POST)
	@ResponseBody
	private Object delNav(String webNavId){
		return websiteNavService.delNav(webNavId);
	}
}
