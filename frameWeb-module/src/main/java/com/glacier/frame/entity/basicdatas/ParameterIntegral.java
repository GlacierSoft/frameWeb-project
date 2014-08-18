package com.glacier.frame.entity.basicdatas;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class ParameterIntegral {
    private String integralId;
    
    @Pattern(regexp = "^[\u0391-\uFFE5]{2,10}$", message = "{ParameterIntegral.integralName.illegal}")
    private String integralName;

    @Max(value = 9999, message = "{ParameterIntegral.integralBegin.illegal}")
    private Integer integralBegin;

    @Max(value = 9999, message = "{ParameterIntegral.integralEnd.illegal}")
    private Integer integralEnd;

    private String integralPhoto;
    
    @Max(value = 99, message = "{ParameterCredit.creditNum.illegal}")
    private Integer integralNum;
    
    @Length(max = 255, message = "{ParameterIntegral.remark.illegal}")
    private String remark;

    private String creater;
    
    /**
     * 自定义字段
     */
    private String createrDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date createTime;

    private String updater;
    
    /**
     * 自定义字段
     */
    private String updaterDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;

    public String getIntegralId() {
        return integralId;
    }

    public void setIntegralId(String integralId) {
        this.integralId = integralId;
    }

    public String getIntegralName() {
        return integralName;
    }

    public void setIntegralName(String integralName) {
        this.integralName = integralName;
    }

    public Integer getIntegralBegin() {
        return integralBegin;
    }

    public void setIntegralBegin(Integer integralBegin) {
        this.integralBegin = integralBegin;
    }

    public Integer getIntegralEnd() {
        return integralEnd;
    }

    public void setIntegralEnd(Integer integralEnd) {
        this.integralEnd = integralEnd;
    }

    public String getIntegralPhoto() {
        return integralPhoto;
    }

    public void setIntegralPhoto(String integralPhoto) {
        this.integralPhoto = integralPhoto;
    }

    public Integer getIntegralNum() {
        return integralNum;
    }

    public void setIntegralNum(Integer integralNum) {
        this.integralNum = integralNum;
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
        ParameterIntegral other = (ParameterIntegral) that;
        return (this.getIntegralId() == null ? other.getIntegralId() == null : this.getIntegralId().equals(other.getIntegralId()))
            && (this.getIntegralName() == null ? other.getIntegralName() == null : this.getIntegralName().equals(other.getIntegralName()))
            && (this.getIntegralBegin() == null ? other.getIntegralBegin() == null : this.getIntegralBegin().equals(other.getIntegralBegin()))
            && (this.getIntegralEnd() == null ? other.getIntegralEnd() == null : this.getIntegralEnd().equals(other.getIntegralEnd()))
            && (this.getIntegralPhoto() == null ? other.getIntegralPhoto() == null : this.getIntegralPhoto().equals(other.getIntegralPhoto()))
            && (this.getIntegralNum() == null ? other.getIntegralNum() == null : this.getIntegralNum().equals(other.getIntegralNum()))
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
        result = prime * result + ((getIntegralId() == null) ? 0 : getIntegralId().hashCode());
        result = prime * result + ((getIntegralName() == null) ? 0 : getIntegralName().hashCode());
        result = prime * result + ((getIntegralBegin() == null) ? 0 : getIntegralBegin().hashCode());
        result = prime * result + ((getIntegralEnd() == null) ? 0 : getIntegralEnd().hashCode());
        result = prime * result + ((getIntegralPhoto() == null) ? 0 : getIntegralPhoto().hashCode());
        result = prime * result + ((getIntegralNum() == null) ? 0 : getIntegralNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}