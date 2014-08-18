package com.glacier.frame.entity.website;

import java.util.Date;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class WebsiteAnnouncement {
    private String webAnnId;

    @Length(min = 1, max = 50, message = "{WebsiteAnnouncement.webAnnTheme.illegal}")
    private String webAnnTheme;

    private String webAnnStatus;

    private Integer clicks;

    private String accessory;

    @Max(value = 999, message = "{WebsiteAnnouncement.webAnnNum.illegal}")
    private Integer webAnnNum;

    @Length(max = 255, message = "{WebsiteAnnouncement.remark.illegal}")
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

    @Length(min = 1, message = "{WebsiteAnnouncement.webAnnContent.illegal}")
    private String webAnnContent;

    public String getWebAnnId() {
        return webAnnId;
    }

    public void setWebAnnId(String webAnnId) {
        this.webAnnId = webAnnId;
    }

    public String getWebAnnTheme() {
        return webAnnTheme;
    }

    public void setWebAnnTheme(String webAnnTheme) {
        this.webAnnTheme = webAnnTheme;
    }

    public String getWebAnnStatus() {
        return webAnnStatus;
    }

    public void setWebAnnStatus(String webAnnStatus) {
        this.webAnnStatus = webAnnStatus;
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

    public Integer getWebAnnNum() {
        return webAnnNum;
    }

    public void setWebAnnNum(Integer webAnnNum) {
        this.webAnnNum = webAnnNum;
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

    public String getWebAnnContent() {
        return webAnnContent;
    }

    public void setWebAnnContent(String webAnnContent) {
        this.webAnnContent = webAnnContent;
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
        WebsiteAnnouncement other = (WebsiteAnnouncement) that;
        return (this.getWebAnnId() == null ? other.getWebAnnId() == null : this.getWebAnnId().equals(other.getWebAnnId()))
            && (this.getWebAnnTheme() == null ? other.getWebAnnTheme() == null : this.getWebAnnTheme().equals(other.getWebAnnTheme()))
            && (this.getWebAnnStatus() == null ? other.getWebAnnStatus() == null : this.getWebAnnStatus().equals(other.getWebAnnStatus()))
            && (this.getClicks() == null ? other.getClicks() == null : this.getClicks().equals(other.getClicks()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getWebAnnNum() == null ? other.getWebAnnNum() == null : this.getWebAnnNum().equals(other.getWebAnnNum()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWebAnnContent() == null ? other.getWebAnnContent() == null : this.getWebAnnContent().equals(other.getWebAnnContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebAnnId() == null) ? 0 : getWebAnnId().hashCode());
        result = prime * result + ((getWebAnnTheme() == null) ? 0 : getWebAnnTheme().hashCode());
        result = prime * result + ((getWebAnnStatus() == null) ? 0 : getWebAnnStatus().hashCode());
        result = prime * result + ((getClicks() == null) ? 0 : getClicks().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getWebAnnNum() == null) ? 0 : getWebAnnNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWebAnnContent() == null) ? 0 : getWebAnnContent().hashCode());
        return result;
    }
}