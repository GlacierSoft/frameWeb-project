package com.glacier.frame.web.controller.member;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.dto.query.member.MemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.member.Member;
import com.glacier.frame.entity.member.MemberMessageNotice;
import com.glacier.frame.service.member.MemberMessageNoticeService;

/**
 * @ClassName: MemberMessageNoticeController 
 * @Description: TODO(消息通知的Controoler) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-9下午1:22:23
 */
@Controller
@RequestMapping(value = "/messageNotice")
public class MemberMessageNoticeController extends AbstractController{
	
	@Autowired
	private MemberMessageNoticeService memberMessageNoticeService;// 注入消息通知业务Bean
	
	/**
	 * @Title: intoMessageNotice 
	 * @Description: TODO(跳转到信息通知页面，同时加载列表) 
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value ="/intoMessageNotice.htm")
	private Object intoMessageNotice(JqPager pager,int p,String delete,String letterstatus,String unread,String read,String messageNoticeIds,HttpServletRequest request,HttpSession session){
		 ModelAndView mav = new ModelAndView("member_mgr/memberMessageNotice");
		 String[] messageNoticeIdArrays = null;
		 Subject pricipalSubject = SecurityUtils.getSubject();
	     Member pricipalMember = (Member) pricipalSubject.getPrincipal();
	     //设置查询DTO收信人的id
	     MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO = new MemberMessageNoticeQueryDTO();
	     memberMessageNoticeQueryDTO.setAddressee(pricipalMember.getMemberId());
	     //为点击查看未读信息设置条件
	     if(letterstatus != null && !"".equals(letterstatus)){
	    	 memberMessageNoticeQueryDTO.setLetterstatus(letterstatus);
	     }
	     //将传过来的id转为数组
	     if(messageNoticeIds != null && !"".equals(messageNoticeIds)){
	    	 messageNoticeIdArrays = messageNoticeIds.split(",");
	     }
	     //将选中的信息删除
	     if(delete != null && !delete.equals("")){
	    	 List<String> messageNoticeIdLists = Arrays.asList(messageNoticeIdArrays);
	    	 memberMessageNoticeService.delMessageNoticeWebsit(messageNoticeIdLists);
	     }
	     //将选中的信息信件状态改为未读
	     if(unread != null && !unread.equals("")){
	    	 for(String messageNoticeId :messageNoticeIdArrays){
		    	 MemberMessageNotice memberMessageNotice = (MemberMessageNotice) memberMessageNoticeService.getMemberMessageNotice(messageNoticeId);
		    	 if((memberMessageNotice.getLetterstatus()).equals("unread")){
		    		 continue;
		    	 }else if((memberMessageNotice.getLetterstatus()).equals("read")){
		    		 memberMessageNotice.setLetterstatus("unread");
			    	 memberMessageNoticeService.editMessageNoticeWebsit(memberMessageNotice);
		    	 }
		     }
	     }
	     //将选中的信息信件状态改为已读
	     if(read != null && !read.equals("")){
	    	 for(String messageNoticeId :messageNoticeIdArrays){
		    	 MemberMessageNotice memberMessageNotice = (MemberMessageNotice) memberMessageNoticeService.getMemberMessageNotice(messageNoticeId);
		    	 if((memberMessageNotice.getLetterstatus()).equals("read")){
		    		 continue;
		    	 }else if((memberMessageNotice.getLetterstatus()).equals("unread")){
		    		 memberMessageNotice.setLetterstatus("read");
			    	 memberMessageNoticeService.editMessageNoticeWebsit(memberMessageNotice);
		    	 }
		     }
	     }
	     //获取信息通知列表
	     JqGridReturn returnResult = (JqGridReturn) memberMessageNoticeService.listAsGridWebsite(memberMessageNoticeQueryDTO, pager,p);
	     request.setAttribute("messageNoticeDatas", returnResult);
	     //获取会员信息通知条数
	     loginTotalMessageNotic(pricipalMember.getMemberId(),session);
	     return mav;
	}
	// 前台查看消息通知Detail信息页面
    @RequestMapping(value = "/messageNoticeDetail.json")
    @ResponseBody
    private Object messageNoticeDetail(String messageNoticeId,HttpSession session) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        
    	MemberMessageNotice memberMessageNotice = (MemberMessageNotice) memberMessageNoticeService.getMemberMessageNotice(messageNoticeId);
    	memberMessageNotice.setLetterstatus("read");
    	memberMessageNoticeService.editMessageNoticeWebsit(memberMessageNotice);
    	//获取会员信息通知条数
    	loginTotalMessageNotic(pricipalMember.getMemberId(),session);
        return memberMessageNoticeService.getMemberMessageNotice(messageNoticeId);
    }
    /**
     * @Title: loginTotalMessageNotic 
     * @Description: TODO(重新获取改会员的信息通知条数) 
     * @param  @param memberId
     * @param  @return设定文件
     * @throws 
     *
     */
    public void loginTotalMessageNotic(String memberId,HttpSession session){
    	//设置查询DTO收信人的id
	     MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO = new MemberMessageNoticeQueryDTO();
	     memberMessageNoticeQueryDTO.setAddressee(memberId);
	     memberMessageNoticeQueryDTO.setLetterstatus("unread");
	     JqPager pager = new JqPager();
    	//获取信息通知列表
	     JqGridReturn returnResult = (JqGridReturn) memberMessageNoticeService.listAsGridWebsite(memberMessageNoticeQueryDTO, pager,1);
	     int messageNoticCount = returnResult.getTotal();
	     session.removeAttribute("messageNoticCount");
	     session.setAttribute("messageNoticCount", messageNoticCount);
    }

}
