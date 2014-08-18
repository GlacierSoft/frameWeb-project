package com.glacier.frame.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class MemberSecretSecurity {
    private String secretSecurityId;
    
    /**
     * 自定义字段，显示密保问题描述
     */
    private String questionDes;

    private String questionId;
    
    /**
     * 自定义字段，显示会员真实名字
     */
    private String memberRealName;

    private String memberId;

    private String answer;

    private String remark;

    /**
     * 自定义字段
     */
    private String createrDisplay;
    
    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date createTime;

    /**
     * 自定义字段
     */
    private String updaterDisplay;
    
    private String updater;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;

    public String getSecretSecurityId() {
        return secretSecurityId;
    }

    public void setSecretSecurityId(String secretSecurityId) {
        this.secretSecurityId = secretSecurityId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getQuestionDes() {
		return questionDes;
	}

	public void setQuestionDes(String questionDes) {
		this.questionDes = questionDes;
	}

	public String getMemberRealName() {
		return memberRealName;
	}

	public void setMemberRealName(String memberRealName) {
		this.memberRealName = memberRealName;
	}

	public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getUpdaterDisplay() {
		return updaterDisplay;
	}

	public void setUpdaterDisplay(String updaterDisplay) {
		this.updaterDisplay = updaterDisplay;
	}

	@Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MemberSecretSecurity other = (MemberSecretSecurity) that;
        return (this.getSecretSecurityId() == null ? other.getSecretSecurityId() == null : this.getSecretSecurityId().equals(other.getSecretSecurityId()))
            && (this.getQuestionId() == null ? other.getQuestionId() == null : this.getQuestionId().equals(other.getQuestionId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecretSecurityId() == null) ? 0 : getSecretSecurityId().hashCode());
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}