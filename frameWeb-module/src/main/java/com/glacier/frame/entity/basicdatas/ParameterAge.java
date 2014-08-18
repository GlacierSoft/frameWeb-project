package com.glacier.frame.entity.basicdatas;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class ParameterAge {
    private String ageId;

    @Pattern(regexp = "^[\u0391-\uFFE5]{2,10}$", message = "{ParameterAge.ageName.illegal}")
    private String ageName;

    @Max(value = 99, message = "{ParameterAge.ageBegin.illegal}")
    private Integer ageBegin;

    @Max(value = 99, message = "{ParameterAge.ageEnd.illegal}")
    private Integer ageEnd;

    private String accessory;

    @Max(value = 99, message = "{ParameterAge.ageNum.illegal}")
    private Integer ageNum;

    @Length(max = 255, message = "{ParameterAge.remark.illegal}")
    private String remark;

    private String creater;
    
    /**
     * 自定义字段，显示创建人真实名字
     */
    private String createrDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date createTime;

    private String updater;
    
    /**
     * 自定义字段，显示更新人的真实名字
     */
    private String updaterDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;

    public String getAgeId() {
        return ageId;
    }

    public void setAgeId(String ageId) {
        this.ageId = ageId;
    }

    public String getAgeName() {
        return ageName;
    }

    public void setAgeName(String ageName) {
        this.ageName = ageName;
    }

    public Integer getAgeBegin() {
        return ageBegin;
    }

    public void setAgeBegin(Integer ageBegin) {
        this.ageBegin = ageBegin;
    }

    public Integer getAgeEnd() {
        return ageEnd;
    }

    public void setAgeEnd(Integer ageEnd) {
        this.ageEnd = ageEnd;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getAgeNum() {
        return ageNum;
    }

    public void setAgeNum(Integer ageNum) {
        this.ageNum = ageNum;
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
        ParameterAge other = (ParameterAge) that;
        return (this.getAgeId() == null ? other.getAgeId() == null : this.getAgeId().equals(other.getAgeId()))
            && (this.getAgeName() == null ? other.getAgeName() == null : this.getAgeName().equals(other.getAgeName()))
            && (this.getAgeBegin() == null ? other.getAgeBegin() == null : this.getAgeBegin().equals(other.getAgeBegin()))
            && (this.getAgeEnd() == null ? other.getAgeEnd() == null : this.getAgeEnd().equals(other.getAgeEnd()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getAgeNum() == null ? other.getAgeNum() == null : this.getAgeNum().equals(other.getAgeNum()))
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
        result = prime * result + ((getAgeId() == null) ? 0 : getAgeId().hashCode());
        result = prime * result + ((getAgeName() == null) ? 0 : getAgeName().hashCode());
        result = prime * result + ((getAgeBegin() == null) ? 0 : getAgeBegin().hashCode());
        result = prime * result + ((getAgeEnd() == null) ? 0 : getAgeEnd().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getAgeNum() == null) ? 0 : getAgeNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}