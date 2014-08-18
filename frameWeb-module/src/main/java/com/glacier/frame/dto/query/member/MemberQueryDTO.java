/*
 * @(#)MemberQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.member;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.member.Member;
import com.glacier.frame.entity.member.MemberExample.Criteria;

/**
 * @ClassName: MemberQueryDTO 
 * @Description: TODO(会员查询DTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-22下午5:03:42
 */
public class MemberQueryDTO extends Member{
	private Date createStartTime;

    private Date createEndTime;
    
    private Date lastStartLoginTime;
    
    private Date lastEndLoginTime;
    
    private String loginStartCount;
    
    private String loginEndCount;
    

    public Date getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    public Date getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }
    
    public Date getLastStartLoginTime() {
		return lastStartLoginTime;
	}

	public void setLastStartLoginTime(Date lastStartLoginTime) {
		this.lastStartLoginTime = lastStartLoginTime;
	}

	public Date getLastEndLoginTime() {
		return lastEndLoginTime;
	}

	public void setLastEndLoginTime(Date lastEndLoginTime) {
		this.lastEndLoginTime = lastEndLoginTime;
	}

   public String getLoginStartCount() {
		return loginStartCount;
	}

	public void setLoginStartCount(String loginStartCount) {
		this.loginStartCount = loginStartCount;
	}

	public String getLoginEndCount() {
		return loginEndCount;
	}

	public void setLoginEndCount(String loginEndCount) {
		this.loginEndCount = loginEndCount;
	}

	public void setQueryCondition(Criteria queryCriteria, String q){
    if(null != q && StringUtils.isNotBlank(q)){//会员名称Like查询
            queryCriteria.andMemberNameLike("%" + q + "%");
        }
   	 if(null != this.getMemberName() && StringUtils.isNotBlank(this.getMemberName())){//会员名称Like查询
            queryCriteria.andMemberNameLike("%" + this.getMemberName() + "%");
        }
   	 if(null != this.getMemberRealName() && StringUtils.isNotBlank(this.getMemberRealName())){//会员真实名称Like查询
            queryCriteria.andMemberRealNameLike("%" + this.getMemberRealName() + "%");
        }
   	 if(null != this.getStatus()){//状态Enum查询
        queryCriteria.andStatusEqualTo(this.getStatus().toString());
   	 	}
	 if(null != this.getType()){//类型Enum查询
	        queryCriteria.andTypeEqualTo(this.getType().toString());
	   	}
     if(null != createStartTime && null != createEndTime){//创建时间段查询
           queryCriteria.andRegistrationTimeBetween(createStartTime, createEndTime); 
     }else{
          if(null != createStartTime){
              queryCriteria.andRegistrationTimeGreaterThanOrEqualTo(createStartTime);
          }
          if(null != createEndTime){
              queryCriteria.andRegistrationTimeLessThanOrEqualTo(createEndTime);
          } 
       }
     
     if(null!=lastStartLoginTime&&null!=lastEndLoginTime){//创建时间段查询
    	 queryCriteria.andLastLoginTimeBetween(lastStartLoginTime, lastEndLoginTime); 
      }else{
    	 if(null != lastStartLoginTime){
              queryCriteria.andLastLoginTimeGreaterThanOrEqualTo(lastStartLoginTime);
          }
          if(null != lastEndLoginTime){
              queryCriteria.andLastLoginTimeLessThanOrEqualTo(lastEndLoginTime);
          }
     }
     
     if(null!=loginStartCount&&null!=loginEndCount){
    	 queryCriteria.andLoginCountBetween(Integer.parseInt(loginStartCount), Integer.parseInt(loginEndCount)); 
     }else{
    	 if(null!=loginStartCount)
    		 queryCriteria.andLoginCountGreaterThanOrEqualTo(Integer.parseInt(loginStartCount));
    	 if(null!=loginEndCount)
    		 queryCriteria.andLoginCountLessThanOrEqualTo(Integer.parseInt(loginEndCount));
     } 
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   } 
}
