/*
 * @(#)MemberSecretQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.dto.query.member;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.member.MemberSecretSecurity;
import com.glacier.frame.entity.member.MemberSecretSecurityExample.Criteria;

/**
 * @ClassName: MemberSecretQueryDTO
 * @Description: TODO(密保问题条件查询DTO)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-6-19 下午3:46:50
 */
public class MemberSecretQueryDTO extends MemberSecretSecurity {
	private Date createStartTime;// 统计开始时间

	private Date createEndTime;// 统计结束时间

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

	public void setQueryCondition(Criteria queryCriteria) {
		if (null != this.getMemberRealName()&& StringUtils.isNotBlank(this.getMemberRealName())) {// 会员名称Like查询
		   	queryCriteria.andMemberRealNameLike("%" + this.getMemberRealName()+ "%");
        }
		if (null != createStartTime && null != createEndTime) {// 创建时间段查询
			queryCriteria.andCreateTimeBetween(createStartTime, createEndTime);
		} else {
			if (null != createStartTime) {
				queryCriteria.andCreateTimeGreaterThanOrEqualTo(createStartTime);
			}
			if (null != createEndTime) {
				queryCriteria.andCreateTimeGreaterThanOrEqualTo(createEndTime);
			}

		}
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
