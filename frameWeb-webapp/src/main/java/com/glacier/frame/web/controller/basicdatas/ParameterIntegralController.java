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
import com.glacier.frame.entity.basicdatas.ParameterIntegral;
import com.glacier.frame.service.basicdatas.ParameterIntegralService;

/**
 * @ClassName: ParameterIntegralController 
 * @Description: TODO(会员积分级别的控制类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-1-22下午3:55:03
 */
@Controller()
@RequestMapping(value="/integral")
public class ParameterIntegralController extends AbstractController{

	@Autowired
	private ParameterIntegralService parameterIntegralService;// 注入会员积分级别业务Bean
	
    // 进入会员积分级别业务列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integral_mgr/integral");
        return mav;
    }
    
    // 进入会员积分级别Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoIntegralFormPage(String integralId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integral_mgr/integral_form");
        if(StringUtils.isNotBlank(integralId)){
            mav.addObject("integralData", parameterIntegralService.getIntegral(integralId));
        }
        return mav;
    }
    
    // 进入会员积分级别Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoIntegralDetailPage(String integralId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integral_mgr/integral_detail");
        if(StringUtils.isNotBlank(integralId)){
            mav.addObject("integralData", parameterIntegralService.getIntegral(integralId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员积分级别数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listIntegralAsGridByMenuId(String menuId, JqPager pager) {
        return parameterIntegralService.listAsGrid(pager);
    }
    // 增加会员积分级别
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addIntegral(@Valid ParameterIntegral parameterIntegral, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterIntegralService.addParameterIntegral(parameterIntegral);
    }
    
    // 修改会员积分级别
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editIntegral(@Valid ParameterIntegral parameterIntegral, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterIntegralService.editParameterIntegral(parameterIntegral);
    }
    // 删除会员积分级别
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    private Object delIntegral(@RequestParam List<String> integralIds,@RequestParam List<String> integralNames) {
        return parameterIntegralService.delIntegral(integralIds, integralNames);
    }
}
