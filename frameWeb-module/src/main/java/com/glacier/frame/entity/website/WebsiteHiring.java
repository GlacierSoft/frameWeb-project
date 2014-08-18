package com.glacier.frame.entity.website;

import java.util.Date;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class WebsiteHiring {
    private String webHiringId;

    @Length(min = 1, max = 25, message = "{WebsiteHiring.webHiringTheme.illegal}")
    private String webHiringTheme;

    private String webHiringStatus;

    private String accessory;

    @Max(value = 999, message = "{WebsiteHiring.webHiringNum.illegal}")
    private Integer webHiringNum;

    @Length(max = 255, message = "{WebsiteHiring.remark.illegal}")
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

    @Length(min = 1, message = "{WebsiteHiring.webHiringContent.illegal}")
    private String webHiringContent;

    public String getWebHiringId() {
        return webHiringId;
    }

    public void setWebHiringId(String webHiringId) {
        this.webHiringId = webHiringId;
    }

    public String getWebHiringTheme() {
        return webHiringTheme;
    }

    public void setWebHiringTheme(String webHiringTheme) {
        this.webHiringTheme = webHiringTheme;
    }

    public String getWebHiringStatus() {
        return webHiringStatus;
    }

    public void setWebHiringStatus(String webHiringStatus) {
        this.webHiringStatus = webHiringStatus;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getWebHiringNum() {
        return webHiringNum;
    }

    public void setWebHiringNum(Integer webHiringNum) {
        this.webHiringNum = webHiringNum;
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

    public String getWebHiringContent() {
        return webHiringContent;
    }

    public void setWebHiringContent(String webHiringContent) {
        this.webHiringContent = webHiringContent;
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
        WebsiteHiring other = (WebsiteHiring) that;
        return (this.getWebHiringId() == null ? other.getWebHiringId() == null : this.getWebHiringId().equals(other.getWebHiringId()))
            && (this.getWebHiringTheme() == null ? other.getWebHiringTheme() == null : this.getWebHiringTheme().equals(other.getWebHiringTheme()))
            && (this.getWebHiringStatus() == null ? other.getWebHiringStatus() == null : this.getWebHiringStatus().equals(other.getWebHiringStatus()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getWebHiringNum() == null ? other.getWebHiringNum() == null : this.getWebHiringNum().equals(other.getWebHiringNum()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWebHiringContent() == null ? other.getWebHiringContent() == null : this.getWebHiringContent().equals(other.getWebHiringContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebHiringId() == null) ? 0 : getWebHiringId().hashCode());
        result = prime * result + ((getWebHiringTheme() == null) ? 0 : getWebHiringTheme().hashCode());
        result = prime * result + ((getWebHiringStatus() == null) ? 0 : getWebHiringStatus().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getWebHiringNum() == null) ? 0 : getWebHiringNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWebHiringContent() == null) ? 0 : getWebHiringContent().hashCode());
        return result;
    }
}