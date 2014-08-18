package com.glacier.frame.entity.website;

import java.util.Date;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class WebsiteService {
    private String webServiceId;

    @Length(min = 1, max = 25, message = "{WebsiteHelp.webHelpTheme.illegal}")
    private String webServiceName;

    private String webServiceQq;

    private String webServicePhoto;

    private String webServiceStatus;

    private String accessory;
    
    @Max(value = 999, message = "{WebsiteService.webServiceNum.illegal}")
    private Integer webServiceNum;

    @Length(max = 255, message = "{WebsiteService.remark.illegal}")
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

    public String getWebServiceId() {
        return webServiceId;
    }

    public void setWebServiceId(String webServiceId) {
        this.webServiceId = webServiceId;
    }

    public String getWebServiceName() {
        return webServiceName;
    }

    public void setWebServiceName(String webServiceName) {
        this.webServiceName = webServiceName;
    }

    public String getWebServiceQq() {
        return webServiceQq;
    }

    public void setWebServiceQq(String webServiceQq) {
        this.webServiceQq = webServiceQq;
    }

    public String getWebServicePhoto() {
        return webServicePhoto;
    }

    public void setWebServicePhoto(String webServicePhoto) {
        this.webServicePhoto = webServicePhoto;
    }

    public String getWebServiceStatus() {
        return webServiceStatus;
    }

    public void setWebServiceStatus(String webServiceStatus) {
        this.webServiceStatus = webServiceStatus;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getWebServiceNum() {
        return webServiceNum;
    }

    public void setWebServiceNum(Integer webServiceNum) {
        this.webServiceNum = webServiceNum;
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
        WebsiteService other = (WebsiteService) that;
        return (this.getWebServiceId() == null ? other.getWebServiceId() == null : this.getWebServiceId().equals(other.getWebServiceId()))
            && (this.getWebServiceName() == null ? other.getWebServiceName() == null : this.getWebServiceName().equals(other.getWebServiceName()))
            && (this.getWebServiceQq() == null ? other.getWebServiceQq() == null : this.getWebServiceQq().equals(other.getWebServiceQq()))
            && (this.getWebServicePhoto() == null ? other.getWebServicePhoto() == null : this.getWebServicePhoto().equals(other.getWebServicePhoto()))
            && (this.getWebServiceStatus() == null ? other.getWebServiceStatus() == null : this.getWebServiceStatus().equals(other.getWebServiceStatus()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getWebServiceNum() == null ? other.getWebServiceNum() == null : this.getWebServiceNum().equals(other.getWebServiceNum()))
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
        result = prime * result + ((getWebServiceId() == null) ? 0 : getWebServiceId().hashCode());
        result = prime * result + ((getWebServiceName() == null) ? 0 : getWebServiceName().hashCode());
        result = prime * result + ((getWebServiceQq() == null) ? 0 : getWebServiceQq().hashCode());
        result = prime * result + ((getWebServicePhoto() == null) ? 0 : getWebServicePhoto().hashCode());
        result = prime * result + ((getWebServiceStatus() == null) ? 0 : getWebServiceStatus().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getWebServiceNum() == null) ? 0 : getWebServiceNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}