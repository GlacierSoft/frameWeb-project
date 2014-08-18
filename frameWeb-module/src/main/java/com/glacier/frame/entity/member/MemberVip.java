package com.glacier.frame.entity.member;

import java.util.Date;

public class MemberVip {
    private String vipId;

    private String memberId;

    private String vipLevel;

    private Integer vipIntegral;

    private Date vipStart;

    private Date vipEnd;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getVipIntegral() {
        return vipIntegral;
    }

    public void setVipIntegral(Integer vipIntegral) {
        this.vipIntegral = vipIntegral;
    }

    public Date getVipStart() {
        return vipStart;
    }

    public void setVipStart(Date vipStart) {
        this.vipStart = vipStart;
    }

    public Date getVipEnd() {
        return vipEnd;
    }

    public void setVipEnd(Date vipEnd) {
        this.vipEnd = vipEnd;
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
        MemberVip other = (MemberVip) that;
        return (this.getVipId() == null ? other.getVipId() == null : this.getVipId().equals(other.getVipId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getVipLevel() == null ? other.getVipLevel() == null : this.getVipLevel().equals(other.getVipLevel()))
            && (this.getVipIntegral() == null ? other.getVipIntegral() == null : this.getVipIntegral().equals(other.getVipIntegral()))
            && (this.getVipStart() == null ? other.getVipStart() == null : this.getVipStart().equals(other.getVipStart()))
            && (this.getVipEnd() == null ? other.getVipEnd() == null : this.getVipEnd().equals(other.getVipEnd()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVipId() == null) ? 0 : getVipId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getVipLevel() == null) ? 0 : getVipLevel().hashCode());
        result = prime * result + ((getVipIntegral() == null) ? 0 : getVipIntegral().hashCode());
        result = prime * result + ((getVipStart() == null) ? 0 : getVipStart().hashCode());
        result = prime * result + ((getVipEnd() == null) ? 0 : getVipEnd().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}