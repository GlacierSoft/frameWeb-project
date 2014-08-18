package com.glacier.frame.entity.member;


import org.hibernate.validator.constraints.Length;

public class MemberWork{
    private String memberId;

    @Length(min = 1, max = 10, message = "{MemberWork.unitName.illegal}")
    private String unitName;

    private String unitPhone;

    private String unitAdress;

    private Integer workAge;

    private Float salary;

    private String proofPerson;

    private String proofPhone;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitPhone() {
        return unitPhone;
    }

    public void setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone;
    }

    public String getUnitAdress() {
        return unitAdress;
    }

    public void setUnitAdress(String unitAdress) {
        this.unitAdress = unitAdress;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getProofPerson() {
        return proofPerson;
    }

    public void setProofPerson(String proofPerson) {
        this.proofPerson = proofPerson;
    }

    public String getProofPhone() {
        return proofPhone;
    }

    public void setProofPhone(String proofPhone) {
        this.proofPhone = proofPhone;
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
        MemberWork other = (MemberWork) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getUnitName() == null ? other.getUnitName() == null : this.getUnitName().equals(other.getUnitName()))
            && (this.getUnitPhone() == null ? other.getUnitPhone() == null : this.getUnitPhone().equals(other.getUnitPhone()))
            && (this.getUnitAdress() == null ? other.getUnitAdress() == null : this.getUnitAdress().equals(other.getUnitAdress()))
            && (this.getWorkAge() == null ? other.getWorkAge() == null : this.getWorkAge().equals(other.getWorkAge()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getProofPerson() == null ? other.getProofPerson() == null : this.getProofPerson().equals(other.getProofPerson()))
            && (this.getProofPhone() == null ? other.getProofPhone() == null : this.getProofPhone().equals(other.getProofPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getUnitName() == null) ? 0 : getUnitName().hashCode());
        result = prime * result + ((getUnitPhone() == null) ? 0 : getUnitPhone().hashCode());
        result = prime * result + ((getUnitAdress() == null) ? 0 : getUnitAdress().hashCode());
        result = prime * result + ((getWorkAge() == null) ? 0 : getWorkAge().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getProofPerson() == null) ? 0 : getProofPerson().hashCode());
        result = prime * result + ((getProofPhone() == null) ? 0 : getProofPhone().hashCode());
        return result;
    }
    public MemberWork(){
    	
    }
}