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
import com.glacier.frame.dto.query.member.MemberAuthQueryDTO;
import com.glacier.frame.entity.member.MemberAuthWithBLOBs;
import com.glacier.frame.service.member.MemberAuthService;
import com.glacier.frame.service.member.MemberService;

/*** 
 * @ClassName:  MemberAuthController
 * @Description: TODO(会员认证controler)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:09:52
 */
@Controller
@RequestMapping(value = "memberAuth")
public class MemberAuthController extends AbstractController{
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	@Autowired
	private MemberService memberService;
	
	// 进入会员认证列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("member_mgr/memberAuth_mgr/memberAuth");
        return mav;
    }
    
    // 进入会员认证审核Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoMemberFormPmember(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/memberAuth_mgr/memberAuth_form");
        if(StringUtils.isNotBlank(memberId)){
        	 mav.addObject("memberAuthData", memberAuthService.getMemberAuth(memberId));
        }
        return mav;
    }
    
    // 进入会员认证记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberAuthDetailPage(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/memberAuth_mgr/memberAuth_detail");
        if(StringUtils.isNotBlank(memberId)){
            mav.addObject("memberAuthData", memberAuthService.getMemberAuth(memberId));
        }
        return mav;
    }
    
    // 进入会员认证记录Detail信息页面
    @RequestMapping(value = "/intoAuthDetail.htm")
    private Object intoMemberAuthInfoDetailPage(String memberId,String auth) {
        ModelAndView mav = new ModelAndView("member_mgr/memberAuth_mgr/memberAuthDetail_form");
        if(StringUtils.isNotBlank(memberId)){
        	//mav.addObject("memberData", memberService.getMember(memberId));
            // mav.addObject("memberWorkData", memberService.getMemberWork(memberId));
            mav.addObject("memberAuthData", memberAuthService.getMemberAuth(memberId));
            mav.addObject("auth", auth);
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(MemberAuthQueryDTO memberAuthQueryDTO,JqPager pmember) {
        return memberAuthService.listAsGrid(memberAuthQueryDTO,pmember);
    }
    
    // 修改会员
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editMemberAuth(@Valid MemberAuthWithBLOBs memberAuthWithBLOBs,BindingResult bindingResult,String auth) {
    	if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return memberAuthService.editMemberAuth(memberAuthWithBLOBs,auth);
    }
}
