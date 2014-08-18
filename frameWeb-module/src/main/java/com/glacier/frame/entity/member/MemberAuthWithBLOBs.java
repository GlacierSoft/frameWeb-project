package com.glacier.frame.entity.member;

public class MemberAuthWithBLOBs extends MemberAuth {
    private String infoAccessory;

    private String vipAccessory;

    private String emailAccessory;

    private String mobileAccessory;

    private String creditAccessory;

    private String companyAccessory;

    private String realNameAccessory;

    private String idCardAccessory;

    private String workAccessory;

    public String getInfoAccessory() {
        return infoAccessory;
    }

    public void setInfoAccessory(String infoAccessory) {
        this.infoAccessory = infoAccessory;
    }

    public String getVipAccessory() {
        return vipAccessory;
    }

    public void setVipAccessory(String vipAccessory) {
        this.vipAccessory = vipAccessory;
    }

    public String getEmailAccessory() {
        return emailAccessory;
    }

    public void setEmailAccessory(String emailAccessory) {
        this.emailAccessory = emailAccessory;
    }

    public String getMobileAccessory() {
        return mobileAccessory;
    }

    public void setMobileAccessory(String mobileAccessory) {
        this.mobileAccessory = mobileAccessory;
    }

    public String getCreditAccessory() {
        return creditAccessory;
    }

    public void setCreditAccessory(String creditAccessory) {
        this.creditAccessory = creditAccessory;
    }

    public String getCompanyAccessory() {
        return companyAccessory;
    }

    public void setCompanyAccessory(String companyAccessory) {
        this.companyAccessory = companyAccessory;
    }

    public String getRealNameAccessory() {
        return realNameAccessory;
    }

    public void setRealNameAccessory(String realNameAccessory) {
        this.realNameAccessory = realNameAccessory;
    }

    public String getIdCardAccessory() {
        return idCardAccessory;
    }

    public void setIdCardAccessory(String idCardAccessory) {
        this.idCardAccessory = idCardAccessory;
    }

    public String getWorkAccessory() {
        return workAccessory;
    }

    public void setWorkAccessory(String workAccessory) {
        this.workAccessory = workAccessory;
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
        MemberAuthWithBLOBs other = (MemberAuthWithBLOBs) that;
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
            && (this.getWorkNum() == null ? other.getWorkNum() == null : this.getWorkNum().equals(other.getWorkNum()))
            && (this.getInfoAccessory() == null ? other.getInfoAccessory() == null : this.getInfoAccessory().equals(other.getInfoAccessory()))
            && (this.getVipAccessory() == null ? other.getVipAccessory() == null : this.getVipAccessory().equals(other.getVipAccessory()))
            && (this.getEmailAccessory() == null ? other.getEmailAccessory() == null : this.getEmailAccessory().equals(other.getEmailAccessory()))
            && (this.getMobileAccessory() == null ? other.getMobileAccessory() == null : this.getMobileAccessory().equals(other.getMobileAccessory()))
            && (this.getCreditAccessory() == null ? other.getCreditAccessory() == null : this.getCreditAccessory().equals(other.getCreditAccessory()))
            && (this.getCompanyAccessory() == null ? other.getCompanyAccessory() == null : this.getCompanyAccessory().equals(other.getCompanyAccessory()))
            && (this.getRealNameAccessory() == null ? other.getRealNameAccessory() == null : this.getRealNameAccessory().equals(other.getRealNameAccessory()))
            && (this.getIdCardAccessory() == null ? other.getIdCardAccessory() == null : this.getIdCardAccessory().equals(other.getIdCardAccessory()))
            && (this.getWorkAccessory() == null ? other.getWorkAccessory() == null : this.getWorkAccessory().equals(other.getWorkAccessory()));
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
        result = prime * result + ((getInfoAccessory() == null) ? 0 : getInfoAccessory().hashCode());
        result = prime * result + ((getVipAccessory() == null) ? 0 : getVipAccessory().hashCode());
        result = prime * result + ((getEmailAccessory() == null) ? 0 : getEmailAccessory().hashCode());
        result = prime * result + ((getMobileAccessory() == null) ? 0 : getMobileAccessory().hashCode());
        result = prime * result + ((getCreditAccessory() == null) ? 0 : getCreditAccessory().hashCode());
        result = prime * result + ((getCompanyAccessory() == null) ? 0 : getCompanyAccessory().hashCode());
        result = prime * result + ((getRealNameAccessory() == null) ? 0 : getRealNameAccessory().hashCode());
        result = prime * result + ((getIdCardAccessory() == null) ? 0 : getIdCardAccessory().hashCode());
        result = prime * result + ((getWorkAccessory() == null) ? 0 : getWorkAccessory().hashCode());
        return result;
    }
}