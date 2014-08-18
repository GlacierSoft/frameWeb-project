package com.glacier.frame.web.filter;

import java.io.IOException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

public class MyAccessControlFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		System.out.println("access allowed");
		saveRequest(request);
		boolean flag = isLoginRequest(request,response);
		System.out.println("啊鹅鹅鹅饿          "+flag);
		if(flag){
			System.out.println("是是是是是是是");
			 saveRequestAndRedirectToLogin(request,response);
		}
		//saveRequestAndRedirectToLogin(request,response);
       // return true;
		//return false;
        if(SecurityUtils.getSubject().isAuthenticated()) { 
        	String successUrl = WebUtils.getSavedRequest(request).getRequestUrl();
        	WebUtils.redirectToSavedRequest(request, response, successUrl);  
            return true;//已经登录过  
        }else {//保存当前地址并重定向到登录界面  
            saveRequestAndRedirectToLogin(request, response);  
            saveRequest(request);
            return false;  
        }  
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		 System.out.println("访问拒绝也不自己处理，继续拦截器链的执行");
		// saveRequest(request);
		 //saveRequestAndRedirectToLogin(request,response);
	    //return true;
		 String url = WebUtils.getSavedRequest(request).getRequestUrl();
		 String url2 = WebUtils.getSavedRequest(request).getRequestURI();
		 String getQueryString = WebUtils.getSavedRequest(request).getQueryString();
	    	//SavedRequest savedRequest = WebUtils.getSavedRequest(request);
	    	
	    	//System.out.println("1:"+savedRequest.getRequestURI());
		 
		 String requestURI = getPathWithinApplication(request);  
		 HttpServletRequest res = (HttpServletRequest) request;
		 HttpSession session = res.getSession();
		 
		 session.setAttribute("MyRequestURI", requestURI);
	    	System.out.println("2:"+url);
	    	System.out.println("3:"+url2);
	    	System.out.println("4:"+getQueryString);
	    	System.out.println("5:"+requestURI);
	    	 saveRequestAndRedirectToLogin(request, response);  
	            saveRequest(request);
		return false;
	}
	
	@Override
	protected void saveRequest(ServletRequest request) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaa的说法费啊我法尔范");
		super.saveRequest(request);
	}
	@Override
	protected void saveRequestAndRedirectToLogin(ServletRequest request,
			ServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		super.saveRequestAndRedirectToLogin(request, response);
	}
	@Override
	protected boolean isLoginRequest(ServletRequest request,
			ServletResponse response) {
		// TODO Auto-generated method stub
		return super.isLoginRequest(request, response);
	}
}
