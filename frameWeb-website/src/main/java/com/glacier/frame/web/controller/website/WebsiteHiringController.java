package com.glacier.frame.web.controller.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
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
	
	//转到“招纳贤士”页面
	@RequestMapping(value = "/hiring.htm")
	public Object hiring(JqPager pager, @RequestParam int p){
		ModelAndView mav = new ModelAndView("about_mgr/hiring");
		mav.addObject("hiringDatas", websiteHiringService.listAsWebsite(pager, p));
		return mav;
	}
	
	//转到“招纳贤士”详细页面
	@RequestMapping(value = "/hiringDetail.htm")
	public Object hiringDetail(String webHiringId){
		ModelAndView mav = new ModelAndView("about_mgr/hiringDetail");
		mav.addObject("hiringData", websiteHiringService.getWebsiteHiring(webHiringId));
		return mav;
	}
}
