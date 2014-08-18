package com.glacier.frame.web.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.glacier.basic.exception.IncorrectCaptchaException;
import com.glacier.basic.util.IpUtil;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.compent.realm.CaptchaUsernamePasswordToken;
import com.glacier.frame.dto.query.member.MemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.member.Member;
import com.glacier.frame.service.member.MemberCreditIntegralService;
import com.glacier.frame.service.member.MemberMessageNoticeService;
import com.glacier.frame.service.member.MemberService;

public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {
	
    @Autowired
    private MemberMessageNoticeService memberMessageNoticeService;

    public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

    private String captchaParam = DEFAULT_CAPTCHA_PARAM;
    
    @Autowired
    private MemberCreditIntegralService memberCreditIntegralService;
    
    @Autowired
    private MemberService memberService;

    public String getCaptchaParam() {
        return captchaParam;
    }

    protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }

    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) { 
    	String username="";
    	//验证是否是邮箱登陆
    	String email=getUsername(request);
    	String reg = "[\\w]+@[\\w]+.[\\w]+"; 
		 //告知此字符串是否匹配给定的正则表达式。
		if(email.matches(reg)) { //匹配的是邮箱，那么进行邮箱登陆验证  
			Member mem=memberService.retrieveEmail(email);//通过该邮箱，看是否存在
			if(mem!=null){//说明数据库存在 
				//是否禁用了该会员
				if(mem.getStatus().equals("disable")){
					username="NO";//不让它登陆
				}else{ 
					username=mem.getMemberName();//取出用户名称，交给shiro去验证密码
				}
			}else{//否则的话，把他当成用户名登陆验证
				username = email;
			}
		}else {//否则按照用户名登陆验证   
			Member member=memberService.retrieveName(email);
			if(member!=null){
				//是否禁用了该会员
				if(member.getStatus().equals("disable")){
					username="NO";//不让它登陆
				}else{ 
					username=email;//取出用户名称，交给shiro去验证密码
				}
			} 
		} 
       String password = getPassword(request);
        String captcha = getCaptcha(request);
        boolean rememberMe = isRememberMe(request);
        String ip = IpUtil.getIpAddr((HttpServletRequest) request);
        String host = ip + IpUtil.getIpInfo(ip);
        char[] charPassword = null; 
        if (StringUtils.isNotBlank(password)) {
            charPassword = password.toCharArray();
        } 
        return new CaptchaUsernamePasswordToken(username, charPassword, rememberMe, host, captcha);
    }

    /**
     * 登录认证，失败会捕获相关异常信息
     */
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) createToken(request, response);
        try {
            doCaptchaValidate( (HttpServletRequest)request,token); 
            if(token.getUsername().equals("NO")){
            	 throw new DisabledAccountException("该用户被禁用，请联系客服！");
            } 
           Subject subject = getSubject(request, response);
            subject.login(token);
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            Member member = (Member) subject.getPrincipal(); 
            session.setAttribute("currentMember", member);
            session.setAttribute("currentMemberWork", memberService.getMemberWork(member.getMemberId()));
            int messageNoticCount = loginTotalMessageNotic(member.getMemberId()); 
            session.setAttribute("messageNoticCount", messageNoticCount); 
            memberService.updateIntegra(member.getMemberId());
            return onLoginSuccess(token, subject, request, response);
        } catch (AuthenticationException e) {
            return onLoginFailure(token, e, request, response);
        }
    }

    // 验证码校验
    protected void doCaptchaValidate(HttpServletRequest request, CaptchaUsernamePasswordToken token) {
        String captcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (StringUtils.isBlank(captcha) || !captcha.equalsIgnoreCase(token.getCaptcha())) {
            throw new IncorrectCaptchaException("验证码错误！");
        }
    }
     
    /**
     * @Title: loginTotalMessageNotic 
     * @Description: TODO(登录之后获取改会员的信息通知条数) 
     * @param  @return设定文件
     * @return int  返回类型
     * @throws 
     *
     */
    public int loginTotalMessageNotic(String memberId){
    	//设置查询DTO收信人的id
	     MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO = new MemberMessageNoticeQueryDTO();
	     memberMessageNoticeQueryDTO.setAddressee(memberId);
	     memberMessageNoticeQueryDTO.setLetterstatus("unread");
	     JqPager pager = new JqPager();
    	//获取信息通知列表
	     JqGridReturn returnResult = (JqGridReturn) memberMessageNoticeService.listAsGridWebsite(memberMessageNoticeQueryDTO, pager,1);
	     return returnResult.getTotal();
    }
}
