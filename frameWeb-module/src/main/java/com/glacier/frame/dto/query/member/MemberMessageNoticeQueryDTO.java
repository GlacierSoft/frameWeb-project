/*
 * @(#)MemberMessageNoticeQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.member;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.member.MemberMessageNotice;
import com.glacier.frame.entity.member.MemberMessageNoticeExample.Criteria;

/**
 * @ClassName: MemberMessageNoticeQueryDTO 
 * @Description: TODO(信息通知查询DTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-10上午11:22:32
 */
public class MemberMessageNoticeQueryDTO extends MemberMessageNotice{
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
   	 if(null != this.getTitle() && StringUtils.isNotBlank(this.getTitle())){//信息标题Like查询
            queryCriteria.andTitleLike("%" + this.getTitle() + "%");
        }
   	 if(null != this.getAddressee() && StringUtils.isNotBlank(this.getAddressee())){//收信人id查询
            queryCriteria.andAddresseeEqualTo(this.getAddressee().toString());
        }
   	 if(null != this.getLetterstatus()){//信件状态Enum查询
        queryCriteria.andLetterstatusEqualTo(this.getLetterstatus().toString());
   	 	}
     if(null != createStartTime && null != createEndTime){//创建时间段查询
           queryCriteria.andSendtimeBetween(createStartTime, createEndTime); 
     }else{
          if(null != createStartTime){
              queryCriteria.andSendtimeGreaterThanOrEqualTo(createStartTime);
          }
          if(null != createEndTime){
              queryCriteria.andSendtimeLessThanOrEqualTo(createEndTime);
          }
           
       }
   }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }


}
