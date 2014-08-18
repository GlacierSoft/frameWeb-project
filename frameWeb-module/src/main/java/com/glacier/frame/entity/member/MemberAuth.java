package com.glacier.frame.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class MemberAuth {
    private String memberId;

    /**
     * 自定义字段
     */
    private String memberName;
    
    /**
     * 自定义字段
     */
    private String memberRealName;
    
    
    
    public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberRealName() {
		return memberRealName;
	}

	public void setMemberRealName(String memberRealName) {
		this.memberRealName = memberRealName;
	}

	private String infoName;

    private String infoAuth;

    private String infoAuditor;
    
    /**
     * 自定义字段
     */
    private String infoAuditorDisplay;

   // @Length(min = 1,max = 255, message = "{MemberAuth.infoRemark.illegal}")
    private String infoRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date infoTime;

    private Integer infoNum;

    private String vipName;

    private String vipAuth;

    private String vipAuditor;
    
    /**
     * 自定义字段
     */
    private String vipAuditorDisplay;

    //@Length(min = 1,max = 255, message = "{MemberAuth.vipRemark.illegal}")
    private String vipRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date vipTime;

    private Integer vipNum;

    private String emailName;

    private String emailAuth;

    private String emailAuditor;
    
    /**
     * 自定义字段
     */
    private String emailAuditorDisplay;
    
    //@Length(min = 1,max = 255, message = "{MemberAuth.emailRemark.illegal}")
    private String emailRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date emailTime;

    private Integer emailNum;

    private String mobileName;

    private String mobileAuth;

    private String mobileAuditor;
    
    /**
     * 自定义字段
     */
    private String mobileAuditorDisplay;

    //@Length(min = 1,max = 255, message = "{MemberAuth.mobileRemark.illegal}")
    private String mobileRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date mobileTime;

    private Integer mobileNum;

    private String creditName;

    private String creditAuth;

    private String creditAuditor;
    
    /**
     * 自定义字段
     */
    private String creditAuditorDisplay;

    //@Length(min = 1,max = 255, message = "{MemberAuth.creditRemark.illegal}")
    private String creditRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date creditTime;

    private Integer creditNum;

    private String companyName;

    private String companyAuth;

    private String companyAuditor;
    
    /**
     * 自定义字段
     */
    private String companyAuditorDisplay;

    //@Length(min = 1,max = 255, message = "{MemberAuth.companyRemark.illegal}")
    private String companyRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date companyTime;

    private Integer companyNum;

    private String realName;

    private String realNameAuth;

    private String realNameAuditor;
    
    /**
     * 自定义字段
     */
    private String realNameAuditorDisplay;

    //@Length(min = 1,max = 255, message = "{MemberAuth.realNameRemark.illegal}")
    private String realNameRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date realNameTime;

    private Integer realNameNum;

    private String idCardName;

    private String idCardAuth;

    private String idCardAuditor;
    
    /**
     * 自定义字段
     */
    private String idCardAuditorDisplay;

    //@Length(min = 1,max = 255, message = "{MemberAuth.idCardRemark.illegal}")
    private String idCardRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date idCardTime;

    private Integer idCardNum;

    private String workName;

    private String workAuth;

    private String workAuditor;
    
    /**
     * 自定义字段
     */
    private String workAuditorDisplay;

    //@Length(min = 1,max = 255, message = "{MemberAuth.workRemark.illegal}")
    private String workRemark;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date workTime;

    private Integer workNum;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoAuth() {
        return infoAuth;
    }

    public void setInfoAuth(String infoAuth) {
        this.infoAuth = infoAuth;
    }

    public String getInfoAuditor() {
        return infoAuditor;
    }

    public void setInfoAuditor(String infoAuditor) {
        this.infoAuditor = infoAuditor;
    }

    public String getInfoRemark() {
        return infoRemark;
    }

    public void setInfoRemark(String infoRemark) {
        this.infoRemark = infoRemark;
    }

    public Date getInfoTime() {
        return infoTime;
    }

    public void setInfoTime(Date infoTime) {
        this.infoTime = infoTime;
    }

    public Integer getInfoNum() {
        return infoNum;
    }

    public void setInfoNum(Integer infoNum) {
        this.infoNum = infoNum;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getVipAuth() {
        return vipAuth;
    }

    public void setVipAuth(String vipAuth) {
        this.vipAuth = vipAuth;
    }

    public String getVipAuditor() {
        return vipAuditor;
    }

    public void setVipAuditor(String vipAuditor) {
        this.vipAuditor = vipAuditor;
    }

    public String getVipRemark() {
        return vipRemark;
    }

    public void setVipRemark(String vipRemark) {
        this.vipRemark = vipRemark;
    }

    public Date getVipTime() {
        return vipTime;
    }

    public void setVipTime(Date vipTime) {
        this.vipTime = vipTime;
    }

    public Integer getVipNum() {
        return vipNum;
    }

    public void setVipNum(Integer vipNum) {
        this.vipNum = vipNum;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getEmailAuth() {
        return emailAuth;
    }

    public void setEmailAuth(String emailAuth) {
        this.emailAuth = emailAuth;
    }

    public String getEmailAuditor() {
        return emailAuditor;
    }

    public void setEmailAuditor(String emailAuditor) {
        this.emailAuditor = emailAuditor;
    }

    public String getEmailRemark() {
        return emailRemark;
    }

    public void setEmailRemark(String emailRemark) {
        this.emailRemark = emailRemark;
    }

    public Date getEmailTime() {
        return emailTime;
    }

    public void setEmailTime(Date emailTime) {
        this.emailTime = emailTime;
    }

    public Integer getEmailNum() {
        return emailNum;
    }

    public void setEmailNum(Integer emailNum) {
        this.emailNum = emailNum;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getMobileAuth() {
        return mobileAuth;
    }

    public void setMobileAuth(String mobileAuth) {
        this.mobileAuth = mobileAuth;
    }

    public String getMobileAuditor() {
        return mobileAuditor;
    }

    public void setMobileAuditor(String mobileAuditor) {
        this.mobileAuditor = mobileAuditor;
    }

    public String getMobileRemark() {
        return mobileRemark;
    }

    public void setMobileRemark(String mobileRemark) {
        this.mobileRemark = mobileRemark;
    }

    public Date getMobileTime() {
        return mobileTime;
    }

    public void setMobileTime(Date mobileTime) {
        this.mobileTime = mobileTime;
    }

    public Integer getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(Integer mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public String getCreditAuth() {
        return creditAuth;
    }

    public void setCreditAuth(String creditAuth) {
        this.creditAuth = creditAuth;
    }

    public String getCreditAuditor() {
        return creditAuditor;
    }

    public void setCreditAuditor(String creditAuditor) {
        this.creditAuditor = creditAuditor;
    }

    public String getCreditRemark() {
        return creditRemark;
    }

    public void setCreditRemark(String creditRemark) {
        this.creditRemark = creditRemark;
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Integer getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(Integer creditNum) {
        this.creditNum = creditNum;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAuth() {
        return companyAuth;
    }

    public void setCompanyAuth(String companyAuth) {
        this.companyAuth = companyAuth;
    }

    public String getCompanyAuditor() {
        return companyAuditor;
    }

    public void setCompanyAuditor(String companyAuditor) {
        this.companyAuditor = companyAuditor;
    }

    public String getCompanyRemark() {
        return companyRemark;
    }

    public void setCompanyRemark(String companyRemark) {
        this.companyRemark = companyRemark;
    }

    public Date getCompanyTime() {
        return companyTime;
    }

    public void setCompanyTime(Date companyTime) {
        this.companyTime = companyTime;
    }

    public Integer getCompanyNum() {
        return companyNum;
    }

    public void setCompanyNum(Integer companyNum) {
        this.companyNum = companyNum;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealNameAuth() {
        return realNameAuth;
    }

    public void setRealNameAuth(String realNameAuth) {
        this.realNameAuth = realNameAuth;
    }

    public String getRealNameAuditor() {
        return realNameAuditor;
    }

    public void setRealNameAuditor(String realNameAuditor) {
        this.realNameAuditor = realNameAuditor;
    }

    public String getRealNameRemark() {
        return realNameRemark;
    }

    public void setRealNameRemark(String realNameRemark) {
        this.realNameRemark = realNameRemark;
    }

    public Date getRealNameTime() {
        return realNameTime;
    }

    public void setRealNameTime(Date realNameTime) {
        this.realNameTime = realNameTime;
    }

    public Integer getRealNameNum() {
        return realNameNum;
    }

    public void setRealNameNum(Integer realNameNum) {
        this.realNameNum = realNameNum;
    }

    public String getIdCardName() {
        return idCardName;
    }

    public void setIdCardName(String idCardName) {
        this.idCardName = idCardName;
    }

    public String getIdCardAuth() {
        return idCardAuth;
    }

    public void setIdCardAuth(String idCardAuth) {
        this.idCardAuth = idCardAuth;
    }

    public String getIdCardAuditor() {
        return idCardAuditor;
    }

    public void setIdCardAuditor(String idCardAuditor) {
        this.idCardAuditor = idCardAuditor;
    }

    public String getIdCardRemark() {
        return idCardRemark;
    }

    public void setIdCardRemark(String idCardRemark) {
        this.idCardRemark = idCardRemark;
    }

    public Date getIdCardTime() {
        return idCardTime;
    }

    public void setIdCardTime(Date idCardTime) {
        this.idCardTime = idCardTime;
    }

    public Integer getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(Integer idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkAuth() {
        return workAuth;
    }

    public void setWorkAuth(String workAuth) {
        this.workAuth = workAuth;
    }

    public String getWorkAuditor() {
        return workAuditor;
    }

    public void setWorkAuditor(String workAuditor) {
        this.workAuditor = workAuditor;
    }

    public String getWorkRemark() {
        return workRemark;
    }

    public void setWorkRemark(String workRemark) {
        this.workRemark = workRemark;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Integer getWorkNum() {
        return workNum;
    }

    public void setWorkNum(Integer workNum) {
        this.workNum = workNum;
    }

    public String getInfoAuditorDisplay() {
		return infoAuditorDisplay;
	}

	public void setInfoAuditorDisplay(String infoAuditorDisplay) {
		this.infoAuditorDisplay = infoAuditorDisplay;
	}

	public String getVipAuditorDisplay() {
		return vipAuditorDisplay;
	}

	public void setVipAuditorDisplay(String vipAuditorDisplay) {
		this.vipAuditorDisplay = vipAuditorDisplay;
	}

	public String getEmailAuditorDisplay() {
		return emailAuditorDisplay;
	}

	public void setEmailAuditorDisplay(String emailAuditorDisplay) {
		this.emailAuditorDisplay = emailAuditorDisplay;
	}

	public String getMobileAuditorDisplay() {
		return mobileAuditorDisplay;
	}

	public void setMobileAuditorDisplay(String mobileAuditorDisplay) {
		this.mobileAuditorDisplay = mobileAuditorDisplay;
	}

	public String getCreditAuditorDisplay() {
		return creditAuditorDisplay;
	}

	public void setCreditAuditorDisplay(String creditAuditorDisplay) {
		this.creditAuditorDisplay = creditAuditorDisplay;
	}

	public String getCompanyAuditorDisplay() {
		return companyAuditorDisplay;
	}

	public void setCompanyAuditorDisplay(String companyAuditorDisplay) {
		this.companyAuditorDisplay = companyAuditorDisplay;
	}

	public String getRealNameAuditorDisplay() {
		return realNameAuditorDisplay;
	}

	public void setRealNameAuditorDisplay(String realNameAuditorDisplay) {
		this.realNameAuditorDisplay = realNameAuditorDisplay;
	}

	public String getIdCardAuditorDisplay() {
		return idCardAuditorDisplay;
	}

	public void setIdCardAuditorDisplay(String idCardAuditorDisplay) {
		this.idCardAuditorDisplay = idCardAuditorDisplay;
	}

	public String getWorkAuditorDisplay() {
		return workAuditorDisplay;
	}

	public void setWorkAuditorDisplay(String workAuditorDisplay) {
		this.workAuditorDisplay = workAuditorDisplay;
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
        MemberAuth other = (MemberAuth) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getInfoName() == null ? other.getInfoName() == null : this.getInfoName().equals(other.getInfoName()))
            && (this.getInfoAuth() == null ? other.getInfoAuth() == null : this.getInfoAuth().equals(other.getInfoAuth()))
            && (this.getInfoAuditor() == null ? other.getInfoAuditor() == null : this.getInfoAuditor().equals(other.getInfoAuditor()))
            && (this.getInfoRemark() == null ? other.getInfoRemark() == null : this.getInfoRemark().equals(other.getInfoRemark()))
            && (this.getInfoTime() == null ? other.getInfoTime() == null : this.getInfoTime().equals(other.getInfoTime()))
            && (this.getInfoNum() == null ? other.getInfoNum() == null : this.getInfoNum().equals(other.getInfoNum()))
            && (this.getVipName() == null ? other.getVipName() == null : this.getVipName().equals(other.getVipName()))
            && (this.getVipAuth() == null ? other.getVipAuth() == null : this.getVipAuth().equals(other.getVipAuth()))
            && (this.getVipAuditor() == null ? other.getVipAuditor() == null : this.getVipAuditor().equals(other.getVipAuditor()))
            && (this.getVipRemark() == null ? other.getVipRemark() == null : this.getVipRemark().equals(other.getVipRemark()))
            && (this.getVipTime() == null ? other.getVipTime() == null : this.getVipTime().equals(other.getVipTime()))
            && (this.getVipNum() == null ? other.getVipNum() == null : this.getVipNum().equals(other.getVipNum()))
            && (this.getEmailName() == null ? other.getEmailName() == null : this.getEmailName().equals(other.getEmailName()))
            && (this.getEmailAuth() == null ? other.getEmailAuth() == null : this.getEmailAuth().equals(other.getEmailAuth()))
            && (this.getEmailAuditor() == null ? other.getEmailAuditor() == null : this.getEmailAuditor().equals(other.getEmailAuditor()))
            && (this.getEmailRemark() == null ? other.getEmailRemark() == null : this.getEmailRemark().equals(other.getEmailRemark()))
            && (this.getEmailTime() == null ? other.getEmailTime() == null : this.getEmailTime().equals(other.getEmailTime()))
            && (this.getEmailNum() == null ? other.getEmailNum() == null : this.getEmailNum().equals(other.getEmailNum()))
            && (this.getMobileName() == null ? other.getMobileName() == null : this.getMobileName().equals(other.getMobileName()))
            && (this.getMobileAuth() == null ? other.getMobileAuth() == null : this.getMobileAuth().equals(other.getMobileAuth()))
            && (this.getMobileAuditor() == null ? other.getMobileAuditor() == null : this.getMobileAuditor().equals(other.getMobileAuditor()))
            && (this.getMobileRemark() == null ? other.getMobileRemark() == null : this.getMobileRemark().equals(other.getMobileRemark()))
            && (this.getMobileTime() == null ? other.getMobileTime() == null : this.getMobileTime().equals(other.getMobileTime()))
            && (this.getMobileNum() == null ? other.getMobileNum() == null : this.getMobileNum().equals(other.getMobileNum()))
            && (this.getCreditName() == null ? other.getCreditName() == null : this.getCreditName().equals(other.getCreditName()))
            && (this.getCreditAuth() == null ? other.getCreditAuth() == null : this.getCreditAuth().equals(other.getCreditAuth()))
            && (this.getCreditAuditor() == null ? other.getCreditAuditor() == null : this.getCreditAuditor().equals(other.getCreditAuditor()))
            && (this.getCreditRemark() == null ? other.getCreditRemark() == null : this.getCreditRemark().equals(other.getCreditRemark()))
            && (this.getCreditTime() == null ? other.getCreditTime() == null : this.getCreditTime().equals(other.getCreditTime()))
            && (this.getCreditNum() == null ? other.getCreditNum() == null : this.getCreditNum().equals(other.getCreditNum()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyAuth() == null ? other.getCompanyAuth() == null : this.getCompanyAuth().equals(other.getCompanyAuth()))
            && (this.getCompanyAuditor() == null ? other.getCompanyAuditor() == null : this.getCompanyAuditor().equals(other.getCompanyAuditor()))
            && (this.getCompanyRemark() == null ? other.getCompanyRemark() == null : this.getCompanyRemark().equals(other.getCompanyRemark()))
            && (this.getCompanyTime() == null ? other.getCompanyTime() == null : this.getCompanyTime().equals(other.getCompanyTime()))
            && (this.getCompanyNum() == null ? other.getCompanyNum() == null : this.getCompanyNum().equals(other.getCompanyNum()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getRealNameAuth() == null ? other.getRealNameAuth() == null : this.getRealNameAuth().equals(other.getRealNameAuth()))
            && (this.getRealNameAuditor() == null ? other.getRealNameAuditor() == null : this.getRealNameAuditor().equals(other.getRealNameAuditor()))
            && (this.getRealNameRemark() == null ? other.getRealNameRemark() == null : this.getRealNameRemark().equals(other.getRealNameRemark()))
            && (this.getRealNameTime() == null ? other.getRealNameTime() == null : this.getRealNameTime().equals(other.getRealNameTime()))
            && (this.getRealNameNum() == null ? other.getRealNameNum() == null : this.getRealNameNum().equals(other.getRealNameNum()))
            && (this.getIdCardName() == null ? other.getIdCardName() == null : this.getIdCardName().equals(other.getIdCardName()))
            && (this.getIdCardAuth() == null ? other.getIdCardAuth() == null : this.getIdCardAuth().equals(other.getIdCardAuth()))
            && (this.getIdCardAuditor() == null ? other.getIdCardAuditor() == null : this.getIdCardAuditor().equals(other.getIdCardAuditor()))
            && (this.getIdCardRemark() == null ? other.getIdCardRemark() == null : this.getIdCardRemark().equals(other.getIdCardRemark()))
            && (this.getIdCardTime() == null ? other.getIdCardTime() == null : this.getIdCardTime().equals(other.getIdCardTime()))
            && (this.getIdCardNum() == null ? other.getIdCardNum() == null : this.getIdCardNum().equals(other.getIdCardNum()))
            && (this.getWorkName() == null ? other.getWorkName() == null : this.getWorkName().equals(other.getWorkName()))
            && (this.getWorkAuth() == null ? other.getWorkAuth() == null : this.getWorkAuth().equals(other.getWorkAuth()))
            && (this.getWorkAuditor() == null ? other.getWorkAuditor() == null : this.getWorkAuditor().equals(other.getWorkAuditor()))
            && (this.getWorkRemark() == null ? other.getWorkRemark() == null : this.getWorkRemark().equals(other.getWorkRemark()))
            && (this.getWorkTime() == null ? other.getWorkTime() == null : this.getWorkTime().equals(other.getWorkTime()))
            && (this.getWorkNum() == null ? other.getWorkNum() == null : this.getWorkNum().equals(other.getWorkNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getInfoName() == null) ? 0 : getInfoName().hashCode());
        result = prime * result + ((getInfoAuth() == null) ? 0 : getInfoAuth().hashCode());
        result = prime * result + ((getInfoAuditor() == null) ? 0 : getInfoAuditor().hashCode());
        result = prime * result + ((getInfoRemark() == null) ? 0 : getInfoRemark().hashCode());
        result = prime * result + ((getInfoTime() == null) ? 0 : getInfoTime().hashCode());
        result = prime * result + ((getInfoNum() == null) ? 0 : getInfoNum().hashCode());
        result = prime * result + ((getVipName() == null) ? 0 : getVipName().hashCode());
        result = prime * result + ((getVipAuth() == null) ? 0 : getVipAuth().hashCode());
        result = prime * result + ((getVipAuditor() == null) ? 0 : getVipAuditor().hashCode());
        result = prime * result + ((getVipRemark() == null) ? 0 : getVipRemark().hashCode());
        result = prime * result + ((getVipTime() == null) ? 0 : getVipTime().hashCode());
        result = prime * result + ((getVipNum() == null) ? 0 : getVipNum().hashCode());
        result = prime * result + ((getEmailName() == null) ? 0 : getEmailName().hashCode());
        result = prime * result + ((getEmailAuth() == null) ? 0 : getEmailAuth().hashCode());
        result = prime * result + ((getEmailAuditor() == null) ? 0 : getEmailAuditor().hashCode());
        result = prime * result + ((getEmailRemark() == null) ? 0 : getEmailRemark().hashCode());
        result = prime * result + ((getEmailTime() == null) ? 0 : getEmailTime().hashCode());
        result = prime * result + ((getEmailNum() == null) ? 0 : getEmailNum().hashCode());
        result = prime * result + ((getMobileName() == null) ? 0 : getMobileName().hashCode());
        result = prime * result + ((getMobileAuth() == null) ? 0 : getMobileAuth().hashCode());
        result = prime * result + ((getMobileAuditor() == null) ? 0 : getMobileAuditor().hashCode());
        result = prime * result + ((getMobileRemark() == null) ? 0 : getMobileRemark().hashCode());
        result = prime * result + ((getMobileTime() == null) ? 0 : getMobileTime().hashCode());
        result = prime * result + ((getMobileNum() == null) ? 0 : getMobileNum().hashCode());
        result = prime * result + ((getCreditName() == null) ? 0 : getCreditName().hashCode());
        result = prime * result + ((getCreditAuth() == null) ? 0 : getCreditAuth().hashCode());
        result = prime * result + ((getCreditAuditor() == null) ? 0 : getCreditAuditor().hashCode());
        result = prime * result + ((getCreditRemark() == null) ? 0 : getCreditRemark().hashCode());
        result = prime * result + ((getCreditTime() == null) ? 0 : getCreditTime().hashCode());
        result = prime * result + ((getCreditNum() == null) ? 0 : getCreditNum().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyAuth() == null) ? 0 : getCompanyAuth().hashCode());
        result = prime * result + ((getCompanyAuditor() == null) ? 0 : getCompanyAuditor().hashCode());
        result = prime * result + ((getCompanyRemark() == null) ? 0 : getCompanyRemark().hashCode());
        result = prime * result + ((getCompanyTime() == null) ? 0 : getCompanyTime().hashCode());
        result = prime * result + ((getCompanyNum() == null) ? 0 : getCompanyNum().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getRealNameAuth() == null) ? 0 : getRealNameAuth().hashCode());
        result = prime * result + ((getRealNameAuditor() == null) ? 0 : getRealNameAuditor().hashCode());
        result = prime * result + ((getRealNameRemark() == null) ? 0 : getRealNameRemark().hashCode());
        result = prime * result + ((getRealNameTime() == null) ? 0 : getRealNameTime().hashCode());
        result = prime * result + ((getRealNameNum() == null) ? 0 : getRealNameNum().hashCode());
        result = prime * result + ((getIdCardName() == null) ? 0 : getIdCardName().hashCode());
        result = prime * result + ((getIdCardAuth() == null) ? 0 : getIdCardAuth().hashCode());
        result = prime * result + ((getIdCardAuditor() == null) ? 0 : getIdCardAuditor().hashCode());
        result = prime * result + ((getIdCardRemark() == null) ? 0 : getIdCardRemark().hashCode());
        result = prime * result + ((getIdCardTime() == null) ? 0 : getIdCardTime().hashCode());
        result = prime * result + ((getIdCardNum() == null) ? 0 : getIdCardNum().hashCode());
        result = prime * result + ((getWorkName() == null) ? 0 : getWorkName().hashCode());
        result = prime * result + ((getWorkAuth() == null) ? 0 : getWorkAuth().hashCode());
        result = prime * result + ((getWorkAuditor() == null) ? 0 : getWorkAuditor().hashCode());
        result = prime * result + ((getWorkRemark() == null) ? 0 : getWorkRemark().hashCode());
        result = prime * result + ((getWorkTime() == null) ? 0 : getWorkTime().hashCode());
        result = prime * result + ((getWorkNum() == null) ? 0 : getWorkNum().hashCode());
        return result;
    }
}