package com.glacier.frame.web.controller.member;

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
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.dto.query.member.MemberIntegralQueryDTO;
import com.glacier.frame.entity.member.MemberIntegral;
import com.glacier.frame.service.member.MemberIntegralService;

/*** 
 * @ClassName:  MemberIntegralController
 * @Description: TODO(会员积分记录的控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:08:07
 */
@Controller
@RequestMapping(value = "/memberIntegral")
public class MemberIntegralController extends AbstractController{

    @Autowired
    private MemberIntegralService integralService;// 注入会员积分记录业务Bean
    
    // 进入会员积分记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPintegral() {
        ModelAndView mav = new ModelAndView("member_mgr/integral_mgr/integral");
        return mav;
    }
    
    // 进入会员积分记录Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoIntegralFormPintegral(String memberIntegralId) {
        ModelAndView mav = new ModelAndView("member_mgr/integral_mgr/integral_form");
        if(StringUtils.isNotBlank(memberIntegralId)){
            mav.addObject("integralData", integralService.getIntegral(memberIntegralId));
        }
        return mav;
    }
    
    // 进入会员积分记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoIntegralDetailPage(String memberIntegralId) {
        ModelAndView mav = new ModelAndView("member_mgr/integral_mgr/integral_detail");
        if(StringUtils.isNotBlank(memberIntegralId)){
            mav.addObject("integralData", integralService.getIntegral(memberIntegralId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员积分记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listIntegralAsGridByMenuId(MemberIntegralQueryDTO  memberIntegralQueryDTO, JqPager pintegralr) {
        return integralService.listAsGrid(memberIntegralQueryDTO, pintegralr);
    }
    
    // 增加会员积分记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addIntegral(@Valid MemberIntegral integral, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return integralService.addIntegral(integral);
    }
}
