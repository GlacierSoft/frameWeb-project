package com.glacier.frame.entity.website;

import java.util.Date;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class WebsiteNews {
    private String webNewsId;

    @Length(min = 1, max = 50, message = "{WebsiteNews.webNewsTheme.illegal}")
    private String webNewsTheme;

    private String webNewsStatus;

    @Max(value = 999, message = "{WebsiteNews.webNewsNum.illegal}")
    private Integer webNewsNum;

    private String accessory;

    @Length(max = 255, message = "{WebsiteNews.remark.illegal}")
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

    @Length(min = 1, message = "{WebsiteNews.webNewsContent.illegal}")
    private String webNewsContent;

    public String getWebNewsId() {
        return webNewsId;
    }

    public void setWebNewsId(String webNewsId) {
        this.webNewsId = webNewsId;
    }

    public String getWebNewsTheme() {
        return webNewsTheme;
    }

    public void setWebNewsTheme(String webNewsTheme) {
        this.webNewsTheme = webNewsTheme;
    }

    public String getWebNewsStatus() {
        return webNewsStatus;
    }

    public void setWebNewsStatus(String webNewsStatus) {
        this.webNewsStatus = webNewsStatus;
    }

    public Integer getWebNewsNum() {
        return webNewsNum;
    }

    public void setWebNewsNum(Integer webNewsNum) {
        this.webNewsNum = webNewsNum;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
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

    public String getWebNewsContent() {
        return webNewsContent;
    }

    public void setWebNewsContent(String webNewsContent) {
        this.webNewsContent = webNewsContent;
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
        WebsiteNews other = (WebsiteNews) that;
        return (this.getWebNewsId() == null ? other.getWebNewsId() == null : this.getWebNewsId().equals(other.getWebNewsId()))
            && (this.getWebNewsTheme() == null ? other.getWebNewsTheme() == null : this.getWebNewsTheme().equals(other.getWebNewsTheme()))
            && (this.getWebNewsStatus() == null ? other.getWebNewsStatus() == null : this.getWebNewsStatus().equals(other.getWebNewsStatus()))
            && (this.getWebNewsNum() == null ? other.getWebNewsNum() == null : this.getWebNewsNum().equals(other.getWebNewsNum()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWebNewsContent() == null ? other.getWebNewsContent() == null : this.getWebNewsContent().equals(other.getWebNewsContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebNewsId() == null) ? 0 : getWebNewsId().hashCode());
        result = prime * result + ((getWebNewsTheme() == null) ? 0 : getWebNewsTheme().hashCode());
        result = prime * result + ((getWebNewsStatus() == null) ? 0 : getWebNewsStatus().hashCode());
        result = prime * result + ((getWebNewsNum() == null) ? 0 : getWebNewsNum().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWebNewsContent() == null) ? 0 : getWebNewsContent().hashCode());
        return result;
    }
}