/*
 * @(#)MemberAuthQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.member;
 
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.member.MemberAuth;
import com.glacier.frame.entity.member.MemberAuthExample.Criteria;

/**
 * @ClassName: MemberAuthQueryDTO 
 * @Description: TODO(会员认证的查询queryDTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-25下午2:44:53
 */
public class MemberAuthQueryDTO extends MemberAuth{
	
	private String auths;//认证状态
	
	private String authType;//认证类型
	
    public String getAuths() {
		return auths;
	}

	public void setAuths(String auths) {
		this.auths = auths;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public void setQueryCondition(Criteria queryCriteria){
	   	 if(null != this.getMemberName() && StringUtils.isNotBlank(this.getMemberName())){//会员名称Like查询
	            queryCriteria.andMemberNameLike("%" + this.getMemberName() + "%");
	        }
	   	 if(null != this.getMemberRealName() && StringUtils.isNotBlank(this.getMemberRealName())){//会员真实名称Like查询
	         queryCriteria.andmemberRealNameLike("%" + this.getMemberRealName() + "%");
	     }
	   	 if(null != auths && null != authType){
	   		 if(authType.equals("infoAuth")){
	   			queryCriteria.andInfoAuthEqualTo(auths.toString());
	   		 }else if(authType.equals("vipAuth")){
	   			queryCriteria.andVipAuthEqualTo(auths.toString());
	   		 }else if(authType.equals("emailAuth")){
	    		queryCriteria.andEmailAuthEqualTo(auths.toString());
	    	 }else if(authType.equals("mobileAuth")){
	    		queryCriteria.andMobileAuthEqualTo(auths.toString());
	    	 }else if(authType.equals("creditAuth")){
	    		queryCriteria.andCreditAuthEqualTo(auths.toString());
			 }else if(authType.equals("companyAuth")){
		   		queryCriteria.andCompanyAuthEqualTo(auths.toString());
	   		 }else if(authType.equals("realNameAuth")){
	    		queryCriteria.andRealNameAuthEqualTo(auths.toString());
	   		 }else if(authType.equals("idCardAuth")){
	    		queryCriteria.andIdCardAuthEqualTo(auths.toString());
	   		 }else if(authType.equals("workAuth")){
	   			 queryCriteria.andWorkAuthEqualTo(auths.toString());
	   		 }
	   	 } 
   }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   } 
}
