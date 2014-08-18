package com.glacier.frame.web.controller.member;

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
import com.glacier.frame.dto.query.member.MemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.member.MemberMessageNotice;
import com.glacier.frame.service.member.MemberMessageNoticeService;
 
/*** 
 * @ClassName:  MemberMessageNoticeController
 * @Description: TODO(消息通知的Controoler)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:07:35
 */
@Controller
@RequestMapping(value = "/messageNotice")
public class MemberMessageNoticeController extends AbstractController{
	
	@Autowired
	private MemberMessageNoticeService memberMessageNoticeService;// 注入消息通知业务Bean

	// 进入消息通知列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmessageNotice() {
        ModelAndView mav = new ModelAndView("member_mgr/messageNotice_mgr/messageNotice");
        return mav;
    }
    
    // 进入消息通知Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoMessageNoticeForm(String messageNoticeId) {
        ModelAndView mav = new ModelAndView("member_mgr/messageNotice_mgr/messageNotice_form");
        if(StringUtils.isNotBlank(messageNoticeId)){
            mav.addObject("messageNoticeData", memberMessageNoticeService.getMemberMessageNotice(messageNoticeId));
        }
        return mav;
    }
    
    // 进入消息通知Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMessageNoticeDetailPage(String messageNoticeId) {
        ModelAndView mav = new ModelAndView("member_mgr/messageNotice_mgr/messageNotice_detail");
        if(StringUtils.isNotBlank(messageNoticeId)){
            mav.addObject("messageNoticeData", memberMessageNoticeService.getMemberMessageNotice(messageNoticeId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO,JqPager pservicer) {
        return memberMessageNoticeService.listAsGrid(memberMessageNoticeQueryDTO,pservicer);
    }
    
    // 增加消息通知
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addMemberMessageNotice(@Valid MemberMessageNotice messageNotice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return memberMessageNoticeService.addMemberMessageNotice(messageNotice);
    }
    
    // 修改消息通知
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editMemberMessageNotice(@Valid MemberMessageNotice messageNotice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return memberMessageNoticeService.editMemberMessageNotice(messageNotice);
    }
    
    // 批量删除消息通知
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMemberMessageNotice(@RequestParam List<String> messageNoticeIds,@RequestParam List<String> titles) {
    	return memberMessageNoticeService.delMemberMessageNotice(messageNoticeIds, titles);
    }
}
