package com.glacier.frame.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class MemberMessageNotice {
    private String messageNoticeId;

    /**
     * 自定义字段
     */
    private String senderDisplay;
    
    private String sender;

    /**
     * 自定义字段
     */
    private String addresseeDisplay;
    
    private String addressee;

    private String title;

    private String content;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date sendtime;

    private String letterstatus;

    private String lettertype;

    private String remark;

    private String creater;

    /**
     * 自定义字段
     */
    private String createrDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    
    /**
     * 自定义字段
     */
    private String updaterDisplay;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getMessageNoticeId() {
        return messageNoticeId;
    }

    public void setMessageNoticeId(String messageNoticeId) {
        this.messageNoticeId = messageNoticeId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getLetterstatus() {
        return letterstatus;
    }

    public void setLetterstatus(String letterstatus) {
        this.letterstatus = letterstatus;
    }

    public String getLettertype() {
        return lettertype;
    }

    public void setLettertype(String lettertype) {
        this.lettertype = lettertype;
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
    
    public String getSenderDisplay() {
		return senderDisplay;
	}

	public void setSenderDisplay(String senderDisplay) {
		this.senderDisplay = senderDisplay;
	}

	public String getAddresseeDisplay() {
		return addresseeDisplay;
	}

	public void setAddresseeDisplay(String addresseeDisplay) {
		this.addresseeDisplay = addresseeDisplay;
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
        MemberMessageNotice other = (MemberMessageNotice) that;
        return (this.getMessageNoticeId() == null ? other.getMessageNoticeId() == null : this.getMessageNoticeId().equals(other.getMessageNoticeId()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getAddressee() == null ? other.getAddressee() == null : this.getAddressee().equals(other.getAddressee()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getLetterstatus() == null ? other.getLetterstatus() == null : this.getLetterstatus().equals(other.getLetterstatus()))
            && (this.getLettertype() == null ? other.getLettertype() == null : this.getLettertype().equals(other.getLettertype()))
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
        result = prime * result + ((getMessageNoticeId() == null) ? 0 : getMessageNoticeId().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getAddressee() == null) ? 0 : getAddressee().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getLetterstatus() == null) ? 0 : getLetterstatus().hashCode());
        result = prime * result + ((getLettertype() == null) ? 0 : getLettertype().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}