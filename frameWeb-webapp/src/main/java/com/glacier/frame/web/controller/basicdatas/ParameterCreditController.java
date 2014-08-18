package com.glacier.frame.web.controller.basicdatas;

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
import com.glacier.frame.entity.basicdatas.ParameterCredit;
import com.glacier.frame.service.basicdatas.ParameterCreditService;

/** 
 * @ClassName: ParameterCreditController 
 * @Description: TODO(会员信用等级的控制类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-1-22上午9:33:19
 */
@Controller()
@RequestMapping(value="/credit")
public class ParameterCreditController extends AbstractController{

	@Autowired
	private ParameterCreditService parameterCreditService;// 注入会员信用等级业务Bean
	
    // 进入会员等级业务列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/credit_mgr/credit");
        return mav;
    }
    
    // 进入会员等级Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoCreditFormPage(String creditId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/credit_mgr/credit_form");
        if(StringUtils.isNotBlank(creditId)){
            mav.addObject("creditData", parameterCreditService.getCredit(creditId));
        }
        return mav;
    }
    
    // 进入会员等级Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoCreditDetailPage(String creditId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/credit_mgr/credit_detail");
        if(StringUtils.isNotBlank(creditId)){
            mav.addObject("creditData", parameterCreditService.getCredit(creditId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员信用等级数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listCreditAsGridByMenuId(String menuId, JqPager pager) {
        return parameterCreditService.listAsGrid(pager);
    }
    // 增加会员信用等级
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    //private Object addCredit(@Valid ParameterCredit parameterCredit, BindingResult bindingResult,@RequestParam(value = "photo", required = false)MultipartFile photo, HttpServletRequest req) {
    private Object addCredit(@Valid ParameterCredit parameterCredit, BindingResult bindingResult) {	
    	if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
       /* if(photo.isEmpty()) {
        	System.out.println("没有传值进来");
        }else{
        	System.out.println(photo.getContentType()+","+photo.getName()+","+photo.getOriginalFilename());
    		String realpath = req.getSession().getServletContext().getRealPath("resources/uploadfile/");
    		System.out.println(realpath);
    		try {
    			FileUtils.copyInputStreamToFile(photo.getInputStream(), new File(realpath+"/"+photo.getOriginalFilename()));
    			String realpathtotle = photo.getOriginalFilename();
    			parameterCredit.setCreditPhoto(realpathtotle);
    		} catch (IOException e) {
    			e.printStackTrace();
    		} 
        };*/
        return parameterCreditService.addParameterCredit(parameterCredit);
    }
    
    // 修改会员信用等级
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editCredit(@Valid ParameterCredit parameterCredit, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterCreditService.editParameterCredit(parameterCredit);
    }
    
    // 删除会员信用等级
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    private Object delCredit(@RequestParam List<String> creditIds,@RequestParam List<String> creditNames) {
        return parameterCreditService.delCredit(creditIds, creditNames);
    }
}
