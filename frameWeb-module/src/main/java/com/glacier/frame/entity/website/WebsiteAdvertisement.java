package com.glacier.frame.entity.website;

import java.util.Date;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class WebsiteAdvertisement {
    private String webAdvId;

    @Length(min = 1, max = 50, message = "{WebsiteAdvertisement.webAdvTheme.illegal}")
    private String webAdvTheme;

    private String webAdvStatus;

    private Integer clicks;

    private String accessory;

    @Max(value = 999, message = "{WebsiteAdvertisement.webAdvNum.illegal}")
    private Integer webAdvNum;

    @Length(max = 255, message = "{WebsiteAdvertisement.remark.illegal}")
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

    @Length(min = 1, message = "{WebsiteAdvertisement.webAdvContent.illegal}")
    private String webAdvContent;

    public String getWebAdvId() {
        return webAdvId;
    }

    public void setWebAdvId(String webAdvId) {
        this.webAdvId = webAdvId;
    }

    public String getWebAdvTheme() {
        return webAdvTheme;
    }

    public void setWebAdvTheme(String webAdvTheme) {
        this.webAdvTheme = webAdvTheme;
    }

    public String getWebAdvStatus() {
        return webAdvStatus;
    }

    public void setWebAdvStatus(String webAdvStatus) {
        this.webAdvStatus = webAdvStatus;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getWebAdvNum() {
        return webAdvNum;
    }

    public void setWebAdvNum(Integer webAdvNum) {
        this.webAdvNum = webAdvNum;
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

    public String getWebAdvContent() {
        return webAdvContent;
    }

    public void setWebAdvContent(String webAdvContent) {
        this.webAdvContent = webAdvContent;
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
        WebsiteAdvertisement other = (WebsiteAdvertisement) that;
        return (this.getWebAdvId() == null ? other.getWebAdvId() == null : this.getWebAdvId().equals(other.getWebAdvId()))
            && (this.getWebAdvTheme() == null ? other.getWebAdvTheme() == null : this.getWebAdvTheme().equals(other.getWebAdvTheme()))
            && (this.getWebAdvStatus() == null ? other.getWebAdvStatus() == null : this.getWebAdvStatus().equals(other.getWebAdvStatus()))
            && (this.getClicks() == null ? other.getClicks() == null : this.getClicks().equals(other.getClicks()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getWebAdvNum() == null ? other.getWebAdvNum() == null : this.getWebAdvNum().equals(other.getWebAdvNum()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWebAdvContent() == null ? other.getWebAdvContent() == null : this.getWebAdvContent().equals(other.getWebAdvContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebAdvId() == null) ? 0 : getWebAdvId().hashCode());
        result = prime * result + ((getWebAdvTheme() == null) ? 0 : getWebAdvTheme().hashCode());
        result = prime * result + ((getWebAdvStatus() == null) ? 0 : getWebAdvStatus().hashCode());
        result = prime * result + ((getClicks() == null) ? 0 : getClicks().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getWebAdvNum() == null) ? 0 : getWebAdvNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWebAdvContent() == null) ? 0 : getWebAdvContent().hashCode());
        return result;
    }
}