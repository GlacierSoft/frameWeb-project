package com.glacier.frame.entity.website;

import java.util.Date;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

import com.alibaba.fastjson.annotation.JSONField;

public class WebsiteNav {
    private String webNavId;

    private String webNavPid;
    
    /**
     * 自定义字段
     */
    private String webNavPname;
    
	public String getWebNavPname() {
		return webNavPname;
	}

	public void setWebNavPname(String webNavPname) {
		this.webNavPname = webNavPname;
	}
	
	@Length(min = 1, max = 25, message = "{WebsiteNav.webNavName.illegal}")
	private String webNavName;

    private String webNavUrl;

    private String webNavStatus;

    @Max(value = 999, message = "{WebsiteNav.webNavNum.illegal}")
    private Integer webNavNum;

    @Length(max = 255, message = "{WebsiteNav.remark.illegal}")
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

    public String getWebNavId() {
        return webNavId;
    }

    public void setWebNavId(String webNavId) {
        this.webNavId = webNavId;
    }

    public String getWebNavPid() {
        return webNavPid;
    }

    public void setWebNavPid(String webNavPid) {
        this.webNavPid = webNavPid;
    }

    public String getWebNavName() {
        return webNavName;
    }

    public void setWebNavName(String webNavName) {
        this.webNavName = webNavName;
    }

    public String getWebNavUrl() {
        return webNavUrl;
    }

    public void setWebNavUrl(String webNavUrl) {
        this.webNavUrl = webNavUrl;
    }

    public String getWebNavStatus() {
        return webNavStatus;
    }

    public void setWebNavStatus(String webNavStatus) {
        this.webNavStatus = webNavStatus;
    }

    public Integer getWebNavNum() {
        return webNavNum;
    }

    public void setWebNavNum(Integer webNavNum) {
        this.webNavNum = webNavNum;
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
        WebsiteNav other = (WebsiteNav) that;
        return (this.getWebNavId() == null ? other.getWebNavId() == null : this.getWebNavId().equals(other.getWebNavId()))
            && (this.getWebNavPid() == null ? other.getWebNavPid() == null : this.getWebNavPid().equals(other.getWebNavPid()))
            && (this.getWebNavName() == null ? other.getWebNavName() == null : this.getWebNavName().equals(other.getWebNavName()))
            && (this.getWebNavUrl() == null ? other.getWebNavUrl() == null : this.getWebNavUrl().equals(other.getWebNavUrl()))
            && (this.getWebNavStatus() == null ? other.getWebNavStatus() == null : this.getWebNavStatus().equals(other.getWebNavStatus()))
            && (this.getWebNavNum() == null ? other.getWebNavNum() == null : this.getWebNavNum().equals(other.getWebNavNum()))
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
        result = prime * result + ((getWebNavId() == null) ? 0 : getWebNavId().hashCode());
        result = prime * result + ((getWebNavPid() == null) ? 0 : getWebNavPid().hashCode());
        result = prime * result + ((getWebNavName() == null) ? 0 : getWebNavName().hashCode());
        result = prime * result + ((getWebNavUrl() == null) ? 0 : getWebNavUrl().hashCode());
        result = prime * result + ((getWebNavStatus() == null) ? 0 : getWebNavStatus().hashCode());
        result = prime * result + ((getWebNavNum() == null) ? 0 : getWebNavNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}