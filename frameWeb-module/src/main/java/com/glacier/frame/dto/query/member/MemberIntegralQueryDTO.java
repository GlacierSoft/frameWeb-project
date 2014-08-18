/*
 * @(#)MemberIntegralQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.member;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.member.MemberIntegralExample.Criteria;
import com.glacier.frame.entity.member.MemberIntegral;

/** 
 * @ClassName: MemberIntegralQueryDTO 
 * @Description: TODO(会员积分查询QueryDTO) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-2-25 下午2:27:54  
 */
public class MemberIntegralQueryDTO extends MemberIntegral{
	
	private Date createStartTime;

    private Date createEndTime;

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
    
    public void setQueryCondition(Criteria queryCriteria){
   	if(null != this.getMemberRealName() && StringUtils.isNotBlank(this.getMemberRealName())){//会员真实名称Like查询
        queryCriteria.andMemberRealNameLike("%" + this.getMemberRealName() + "%");
    }
   	 if(null != this.getType()){//根据积分类型查询
        queryCriteria.andTypeEqualTo(this.getType().toString());
   	 	}
   	 if(null != this.getChangeType()){//根据改变类型查询
        queryCriteria.andChangeTypeEqualTo(this.getChangeType().toString());
   	 	}
     if(null != createStartTime && null != createEndTime){//创建时间段查询
           queryCriteria.andCreateTimeBetween(createStartTime, createEndTime); 
     }else{
          if(null != createStartTime){
              queryCriteria.andCreateTimeGreaterThanOrEqualTo(createStartTime);
          }
          if(null != createEndTime){
              queryCriteria.andCreateTimeLessThanOrEqualTo(createEndTime);
          }
           
       }
   }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }

}
