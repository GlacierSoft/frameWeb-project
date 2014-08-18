package com.glacier.frame.entity.basicdatas;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class ParameterCredit {
    private String creditId;
    
    @Pattern(regexp = "^[\u0391-\uFFE5]{2,10}$", message = "{ParameterCredit.creditName.illegal}")
    private String creditName;

    @Max(value = 9999, message = "{ParameterCredit.creditBeginIntegral.illegal}")
    private Integer creditBeginIntegral;
    
    @Max(value = 9999, message = "{ParameterCredit.creditEndIntegral.illegal}")
    private Integer creditEndIntegral;

    private String creditPhoto;

    private String accessory;
    
    @Max(value = 99, message = "{ParameterCredit.creditNum.illegal}")
    private Integer creditNum;
    
    @Length(max = 255, message = "{ParameterCredit.remark.illegal}")
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

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public Integer getCreditBeginIntegral() {
        return creditBeginIntegral;
    }

    public void setCreditBeginIntegral(Integer creditBeginIntegral) {
        this.creditBeginIntegral = creditBeginIntegral;
    }

    public Integer getCreditEndIntegral() {
        return creditEndIntegral;
    }

    public void setCreditEndIntegral(Integer creditEndIntegral) {
        this.creditEndIntegral = creditEndIntegral;
    }

    public String getCreditPhoto() {
        return creditPhoto;
    }

    public void setCreditPhoto(String creditPhoto) {
        this.creditPhoto = creditPhoto;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(Integer creditNum) {
        this.creditNum = creditNum;
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
        ParameterCredit other = (ParameterCredit) that;
        return (this.getCreditId() == null ? other.getCreditId() == null : this.getCreditId().equals(other.getCreditId()))
            && (this.getCreditName() == null ? other.getCreditName() == null : this.getCreditName().equals(other.getCreditName()))
            && (this.getCreditBeginIntegral() == null ? other.getCreditBeginIntegral() == null : this.getCreditBeginIntegral().equals(other.getCreditBeginIntegral()))
            && (this.getCreditEndIntegral() == null ? other.getCreditEndIntegral() == null : this.getCreditEndIntegral().equals(other.getCreditEndIntegral()))
            && (this.getCreditPhoto() == null ? other.getCreditPhoto() == null : this.getCreditPhoto().equals(other.getCreditPhoto()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getCreditNum() == null ? other.getCreditNum() == null : this.getCreditNum().equals(other.getCreditNum()))
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
        result = prime * result + ((getCreditId() == null) ? 0 : getCreditId().hashCode());
        result = prime * result + ((getCreditName() == null) ? 0 : getCreditName().hashCode());
        result = prime * result + ((getCreditBeginIntegral() == null) ? 0 : getCreditBeginIntegral().hashCode());
        result = prime * result + ((getCreditEndIntegral() == null) ? 0 : getCreditEndIntegral().hashCode());
        result = prime * result + ((getCreditPhoto() == null) ? 0 : getCreditPhoto().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getCreditNum() == null) ? 0 : getCreditNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}