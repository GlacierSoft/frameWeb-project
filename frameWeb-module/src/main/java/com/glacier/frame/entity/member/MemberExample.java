package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("temp_member.member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("temp_member.member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("temp_member.member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("temp_member.member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("temp_member.member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("temp_member.member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("temp_member.member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("temp_member.member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("temp_member.member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("temp_member.member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("temp_member.member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("temp_member.member_password is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("temp_member.member_password is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("temp_member.member_password =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("temp_member.member_password <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("temp_member.member_password >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_password >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("temp_member.member_password <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_password <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("temp_member.member_password like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("temp_member.member_password not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("temp_member.member_password in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("temp_member.member_password not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("temp_member.member_password between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_password not between", value1, value2, "memberPassword");
            return (Criteria) this;
        }
        
        public Criteria andTradersPasswordIsNull() {
            addCriterion("temp_member.traders_password is null");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordIsNotNull() {
            addCriterion("temp_member.traders_password is not null");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordEqualTo(String value) {
            addCriterion("temp_member.traders_password =", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotEqualTo(String value) {
            addCriterion("temp_member.traders_password <>", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordGreaterThan(String value) {
            addCriterion("temp_member.traders_password >", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.traders_password >=", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordLessThan(String value) {
            addCriterion("temp_member.traders_password <", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordLessThanOrEqualTo(String value) {
            addCriterion("temp_member.traders_password <=", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordLike(String value) {
            addCriterion("temp_member.traders_password like", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotLike(String value) {
            addCriterion("temp_member.traders_password not like", value, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordIn(List<String> values) {
            addCriterion("temp_member.traders_password in", values, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotIn(List<String> values) {
            addCriterion("temp_member.traders_password not in", values, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordBetween(String value1, String value2) {
            addCriterion("temp_member.traders_password between", value1, value2, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersPasswordNotBetween(String value1, String value2) {
            addCriterion("temp_member.traders_password not between", value1, value2, "tradersPassword");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNull() {
            addCriterion("temp_member.member_real_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNotNull() {
            addCriterion("temp_member.member_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameEqualTo(String value) {
            addCriterion("temp_member.member_real_name =", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotEqualTo(String value) {
            addCriterion("temp_member.member_real_name <>", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThan(String value) {
            addCriterion("temp_member.member_real_name >", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_real_name >=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThan(String value) {
            addCriterion("temp_member.member_real_name <", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_real_name <=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLike(String value) {
            addCriterion("temp_member.member_real_name like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotLike(String value) {
            addCriterion("temp_member.member_real_name not like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIn(List<String> values) {
            addCriterion("temp_member.member_real_name in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotIn(List<String> values) {
            addCriterion("temp_member.member_real_name not in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameBetween(String value1, String value2) {
            addCriterion("temp_member.member_real_name between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_real_name not between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIsNull() {
            addCriterion("temp_member.member_photo is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIsNotNull() {
            addCriterion("temp_member.member_photo is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoEqualTo(String value) {
            addCriterion("temp_member.member_photo =", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotEqualTo(String value) {
            addCriterion("temp_member.member_photo <>", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoGreaterThan(String value) {
            addCriterion("temp_member.member_photo >", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_photo >=", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLessThan(String value) {
            addCriterion("temp_member.member_photo <", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_photo <=", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoLike(String value) {
            addCriterion("temp_member.member_photo like", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotLike(String value) {
            addCriterion("temp_member.member_photo not like", value, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoIn(List<String> values) {
            addCriterion("temp_member.member_photo in", values, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotIn(List<String> values) {
            addCriterion("temp_member.member_photo not in", values, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoBetween(String value1, String value2) {
            addCriterion("temp_member.member_photo between", value1, value2, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberPhotoNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_photo not between", value1, value2, "memberPhoto");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNull() {
            addCriterion("temp_member.member_age is null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNotNull() {
            addCriterion("temp_member.member_age is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeEqualTo(Integer value) {
            addCriterion("temp_member.member_age =", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotEqualTo(Integer value) {
            addCriterion("temp_member.member_age <>", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThan(Integer value) {
            addCriterion("temp_member.member_age >", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member.member_age >=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThan(Integer value) {
            addCriterion("temp_member.member_age <", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member.member_age <=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIn(List<Integer> values) {
            addCriterion("temp_member.member_age in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotIn(List<Integer> values) {
            addCriterion("temp_member.member_age not in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.member_age between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.member_age not between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("temp_member.mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("temp_member.mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("temp_member.mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("temp_member.mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("temp_member.mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("temp_member.mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_member.mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("temp_member.mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("temp_member.mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("temp_member.mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("temp_member.mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("temp_member.mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("temp_member.mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("temp_member.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("temp_member.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("temp_member.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("temp_member.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("temp_member.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("temp_member.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("temp_member.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("temp_member.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("temp_member.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("temp_member.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("temp_member.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("temp_member.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("temp_member.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("temp_member.marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("temp_member.marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("temp_member.marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("temp_member.marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("temp_member.marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("temp_member.marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_member.marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("temp_member.marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("temp_member.marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("temp_member.marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("temp_member.marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("temp_member.marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("temp_member.marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("temp_member.card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("temp_member.card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("temp_member.card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("temp_member.card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("temp_member.card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("temp_member.card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member.card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("temp_member.card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("temp_member.card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("temp_member.card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("temp_member.card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("temp_member.card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("temp_member.card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("temp_member.email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("temp_member.email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("temp_member.email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("temp_member.email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("temp_member.email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("temp_member.email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_member.email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("temp_member.email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("temp_member.email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("temp_member.email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("temp_member.email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("temp_member.email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("temp_member.email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNull() {
            addCriterion("temp_member.registration_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNotNull() {
            addCriterion("temp_member.registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeEqualTo(Date value) {
            addCriterion("temp_member.registration_time =", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotEqualTo(Date value) {
            addCriterion("temp_member.registration_time <>", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThan(Date value) {
            addCriterion("temp_member.registration_time >", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.registration_time >=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThan(Date value) {
            addCriterion("temp_member.registration_time <", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.registration_time <=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIn(List<Date> values) {
            addCriterion("temp_member.registration_time in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotIn(List<Date> values) {
            addCriterion("temp_member.registration_time not in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.registration_time between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.registration_time not between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIsNull() {
            addCriterion("temp_member.credit_integral is null");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIsNotNull() {
            addCriterion("temp_member.credit_integral is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralEqualTo(Float value) {
            addCriterion("temp_member.credit_integral =", value, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralNotEqualTo(Float value) {
            addCriterion("temp_member.credit_integral <>", value, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralGreaterThan(Float value) {
            addCriterion("temp_member.credit_integral >", value, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member.credit_integral >=", value, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralLessThan(Float value) {
            addCriterion("temp_member.credit_integral <", value, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralLessThanOrEqualTo(Float value) {
            addCriterion("temp_member.credit_integral <=", value, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIn(List<Float> values) {
            addCriterion("temp_member.credit_integral in", values, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralNotIn(List<Float> values) {
            addCriterion("temp_member.credit_integral not in", values, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralBetween(Float value1, Float value2) {
            addCriterion("temp_member.credit_integral between", value1, value2, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralNotBetween(Float value1, Float value2) {
            addCriterion("temp_member.credit_integral not between", value1, value2, "creditIntegral");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("temp_member.integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("temp_member.integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Float value) {
            addCriterion("temp_member.integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Float value) {
            addCriterion("temp_member.integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Float value) {
            addCriterion("temp_member.integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member.integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Float value) {
            addCriterion("temp_member.integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Float value) {
            addCriterion("temp_member.integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Float> values) {
            addCriterion("temp_member.integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Float> values) {
            addCriterion("temp_member.integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Float value1, Float value2) {
            addCriterion("temp_member.integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Float value1, Float value2) {
            addCriterion("temp_member.integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andCreditamountIsNull() {
            addCriterion("temp_member.creditAmount is null");
            return (Criteria) this;
        }

        public Criteria andCreditamountIsNotNull() {
            addCriterion("temp_member.creditAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditamountEqualTo(Float value) {
            addCriterion("temp_member.creditAmount =", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotEqualTo(Float value) {
            addCriterion("temp_member.creditAmount <>", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountGreaterThan(Float value) {
            addCriterion("temp_member.creditAmount >", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member.creditAmount >=", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountLessThan(Float value) {
            addCriterion("temp_member.creditAmount <", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountLessThanOrEqualTo(Float value) {
            addCriterion("temp_member.creditAmount <=", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountIn(List<Float> values) {
            addCriterion("temp_member.creditAmount in", values, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotIn(List<Float> values) {
            addCriterion("temp_member.creditAmount not in", values, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountBetween(Float value1, Float value2) {
            addCriterion("temp_member.creditAmount between", value1, value2, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotBetween(Float value1, Float value2) {
            addCriterion("temp_member.creditAmount not between", value1, value2, "creditamount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_member.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_member.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_member.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_member.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_member.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_member.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_member.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_member.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_member.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_member.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_member.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_member.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_member.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("temp_member.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("temp_member.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("temp_member.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("temp_member.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("temp_member.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("temp_member.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_member.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("temp_member.type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("temp_member.type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("temp_member.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("temp_member.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("temp_member.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("temp_member.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("temp_member.valid_time is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("temp_member.valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(Date value) {
            addCriterion("temp_member.valid_time =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(Date value) {
            addCriterion("temp_member.valid_time <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(Date value) {
            addCriterion("temp_member.valid_time >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.valid_time >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(Date value) {
            addCriterion("temp_member.valid_time <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.valid_time <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<Date> values) {
            addCriterion("temp_member.valid_time in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<Date> values) {
            addCriterion("temp_member.valid_time not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.valid_time between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.valid_time not between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("temp_member.expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("temp_member.expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("temp_member.expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("temp_member.expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("temp_member.expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("temp_member.expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("temp_member.expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("temp_member.expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_member.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_member.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_member.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_member.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_member.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_member.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_member.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_member.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_member.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_member.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_member.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_member.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_member.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNull() {
            addCriterion("temp_member.educational is null");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNotNull() {
            addCriterion("temp_member.educational is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalEqualTo(String value) {
            addCriterion("temp_member.educational =", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotEqualTo(String value) {
            addCriterion("temp_member.educational <>", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThan(String value) {
            addCriterion("temp_member.educational >", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.educational >=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThan(String value) {
            addCriterion("temp_member.educational <", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThanOrEqualTo(String value) {
            addCriterion("temp_member.educational <=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLike(String value) {
            addCriterion("temp_member.educational like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotLike(String value) {
            addCriterion("temp_member.educational not like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalIn(List<String> values) {
            addCriterion("temp_member.educational in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotIn(List<String> values) {
            addCriterion("temp_member.educational not in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalBetween(String value1, String value2) {
            addCriterion("temp_member.educational between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotBetween(String value1, String value2) {
            addCriterion("temp_member.educational not between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andPersonalDesIsNull() {
            addCriterion("temp_member.personal_des is null");
            return (Criteria) this;
        }

        public Criteria andPersonalDesIsNotNull() {
            addCriterion("temp_member.personal_des is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalDesEqualTo(String value) {
            addCriterion("temp_member.personal_des =", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesNotEqualTo(String value) {
            addCriterion("temp_member.personal_des <>", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesGreaterThan(String value) {
            addCriterion("temp_member.personal_des >", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.personal_des >=", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesLessThan(String value) {
            addCriterion("temp_member.personal_des <", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesLessThanOrEqualTo(String value) {
            addCriterion("temp_member.personal_des <=", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesLike(String value) {
            addCriterion("temp_member.personal_des like", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesNotLike(String value) {
            addCriterion("temp_member.personal_des not like", value, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesIn(List<String> values) {
            addCriterion("temp_member.personal_des in", values, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesNotIn(List<String> values) {
            addCriterion("temp_member.personal_des not in", values, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesBetween(String value1, String value2) {
            addCriterion("temp_member.personal_des between", value1, value2, "personalDes");
            return (Criteria) this;
        }

        public Criteria andPersonalDesNotBetween(String value1, String value2) {
            addCriterion("temp_member.personal_des not between", value1, value2, "personalDes");
            return (Criteria) this;
        }

        public Criteria andHometownIsNull() {
            addCriterion("temp_member.hometown is null");
            return (Criteria) this;
        }

        public Criteria andHometownIsNotNull() {
            addCriterion("temp_member.hometown is not null");
            return (Criteria) this;
        }

        public Criteria andHometownEqualTo(String value) {
            addCriterion("temp_member.hometown =", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotEqualTo(String value) {
            addCriterion("temp_member.hometown <>", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThan(String value) {
            addCriterion("temp_member.hometown >", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.hometown >=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThan(String value) {
            addCriterion("temp_member.hometown <", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThanOrEqualTo(String value) {
            addCriterion("temp_member.hometown <=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLike(String value) {
            addCriterion("temp_member.hometown like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotLike(String value) {
            addCriterion("temp_member.hometown not like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownIn(List<String> values) {
            addCriterion("temp_member.hometown in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotIn(List<String> values) {
            addCriterion("temp_member.hometown not in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownBetween(String value1, String value2) {
            addCriterion("temp_member.hometown between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotBetween(String value1, String value2) {
            addCriterion("temp_member.hometown not between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNull() {
            addCriterion("temp_member.live_address is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNotNull() {
            addCriterion("temp_member.live_address is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressEqualTo(String value) {
            addCriterion("temp_member.live_address =", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotEqualTo(String value) {
            addCriterion("temp_member.live_address <>", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThan(String value) {
            addCriterion("temp_member.live_address >", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.live_address >=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThan(String value) {
            addCriterion("temp_member.live_address <", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.live_address <=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLike(String value) {
            addCriterion("temp_member.live_address like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotLike(String value) {
            addCriterion("temp_member.live_address not like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIn(List<String> values) {
            addCriterion("temp_member.live_address in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotIn(List<String> values) {
            addCriterion("temp_member.live_address not in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressBetween(String value1, String value2) {
            addCriterion("temp_member.live_address between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member.live_address not between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("temp_member.home_phone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("temp_member.home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("temp_member.home_phone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("temp_member.home_phone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("temp_member.home_phone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.home_phone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("temp_member.home_phone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.home_phone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("temp_member.home_phone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("temp_member.home_phone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("temp_member.home_phone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("temp_member.home_phone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("temp_member.home_phone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.home_phone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactIsNull() {
            addCriterion("temp_member.first_contact is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactIsNotNull() {
            addCriterion("temp_member.first_contact is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactEqualTo(String value) {
            addCriterion("temp_member.first_contact =", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotEqualTo(String value) {
            addCriterion("temp_member.first_contact <>", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactGreaterThan(String value) {
            addCriterion("temp_member.first_contact >", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact >=", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactLessThan(String value) {
            addCriterion("temp_member.first_contact <", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact <=", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactLike(String value) {
            addCriterion("temp_member.first_contact like", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotLike(String value) {
            addCriterion("temp_member.first_contact not like", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactIn(List<String> values) {
            addCriterion("temp_member.first_contact in", values, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotIn(List<String> values) {
            addCriterion("temp_member.first_contact not in", values, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact between", value1, value2, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact not between", value1, value2, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationIsNull() {
            addCriterion("temp_member.first_contact_relation is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationIsNotNull() {
            addCriterion("temp_member.first_contact_relation is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation =", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation <>", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationGreaterThan(String value) {
            addCriterion("temp_member.first_contact_relation >", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation >=", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationLessThan(String value) {
            addCriterion("temp_member.first_contact_relation <", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation <=", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationLike(String value) {
            addCriterion("temp_member.first_contact_relation like", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotLike(String value) {
            addCriterion("temp_member.first_contact_relation not like", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationIn(List<String> values) {
            addCriterion("temp_member.first_contact_relation in", values, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotIn(List<String> values) {
            addCriterion("temp_member.first_contact_relation not in", values, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_relation between", value1, value2, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_relation not between", value1, value2, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIsNull() {
            addCriterion("temp_member.first_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIsNotNull() {
            addCriterion("temp_member.first_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone =", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone <>", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneGreaterThan(String value) {
            addCriterion("temp_member.first_contact_phone >", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone >=", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLessThan(String value) {
            addCriterion("temp_member.first_contact_phone <", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone <=", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLike(String value) {
            addCriterion("temp_member.first_contact_phone like", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotLike(String value) {
            addCriterion("temp_member.first_contact_phone not like", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIn(List<String> values) {
            addCriterion("temp_member.first_contact_phone in", values, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotIn(List<String> values) {
            addCriterion("temp_member.first_contact_phone not in", values, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_phone between", value1, value2, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_phone not between", value1, value2, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressIsNull() {
            addCriterion("temp_member.first_contact_address is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressIsNotNull() {
            addCriterion("temp_member.first_contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressEqualTo(String value) {
            addCriterion("temp_member.first_contact_address =", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotEqualTo(String value) {
            addCriterion("temp_member.first_contact_address <>", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressGreaterThan(String value) {
            addCriterion("temp_member.first_contact_address >", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_address >=", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressLessThan(String value) {
            addCriterion("temp_member.first_contact_address <", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_address <=", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressLike(String value) {
            addCriterion("temp_member.first_contact_address like", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotLike(String value) {
            addCriterion("temp_member.first_contact_address not like", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressIn(List<String> values) {
            addCriterion("temp_member.first_contact_address in", values, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotIn(List<String> values) {
            addCriterion("temp_member.first_contact_address not in", values, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_address between", value1, value2, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_address not between", value1, value2, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactIsNull() {
            addCriterion("temp_member.second_contact is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactIsNotNull() {
            addCriterion("temp_member.second_contact is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactEqualTo(String value) {
            addCriterion("temp_member.second_contact =", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotEqualTo(String value) {
            addCriterion("temp_member.second_contact <>", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactGreaterThan(String value) {
            addCriterion("temp_member.second_contact >", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact >=", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLessThan(String value) {
            addCriterion("temp_member.second_contact <", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact <=", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLike(String value) {
            addCriterion("temp_member.second_contact like", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotLike(String value) {
            addCriterion("temp_member.second_contact not like", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactIn(List<String> values) {
            addCriterion("temp_member.second_contact in", values, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotIn(List<String> values) {
            addCriterion("temp_member.second_contact not in", values, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact between", value1, value2, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact not between", value1, value2, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationIsNull() {
            addCriterion("temp_member.second_contact_relation is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationIsNotNull() {
            addCriterion("temp_member.second_contact_relation is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation =", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation <>", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationGreaterThan(String value) {
            addCriterion("temp_member.second_contact_relation >", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation >=", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationLessThan(String value) {
            addCriterion("temp_member.second_contact_relation <", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation <=", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationLike(String value) {
            addCriterion("temp_member.second_contact_relation like", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotLike(String value) {
            addCriterion("temp_member.second_contact_relation not like", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationIn(List<String> values) {
            addCriterion("temp_member.second_contact_relation in", values, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotIn(List<String> values) {
            addCriterion("temp_member.second_contact_relation not in", values, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_relation between", value1, value2, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_relation not between", value1, value2, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneIsNull() {
            addCriterion("temp_member.second_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneIsNotNull() {
            addCriterion("temp_member.second_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone =", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone <>", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneGreaterThan(String value) {
            addCriterion("temp_member.second_contact_phone >", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone >=", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneLessThan(String value) {
            addCriterion("temp_member.second_contact_phone <", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone <=", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneLike(String value) {
            addCriterion("temp_member.second_contact_phone like", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotLike(String value) {
            addCriterion("temp_member.second_contact_phone not like", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneIn(List<String> values) {
            addCriterion("temp_member.second_contact_phone in", values, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotIn(List<String> values) {
            addCriterion("temp_member.second_contact_phone not in", values, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_phone between", value1, value2, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_phone not between", value1, value2, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressIsNull() {
            addCriterion("temp_member.second_contact_address is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressIsNotNull() {
            addCriterion("temp_member.second_contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressEqualTo(String value) {
            addCriterion("temp_member.second_contact_address =", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotEqualTo(String value) {
            addCriterion("temp_member.second_contact_address <>", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressGreaterThan(String value) {
            addCriterion("temp_member.second_contact_address >", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_address >=", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressLessThan(String value) {
            addCriterion("temp_member.second_contact_address <", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_address <=", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressLike(String value) {
            addCriterion("temp_member.second_contact_address like", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotLike(String value) {
            addCriterion("temp_member.second_contact_address not like", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressIn(List<String> values) {
            addCriterion("temp_member.second_contact_address in", values, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotIn(List<String> values) {
            addCriterion("temp_member.second_contact_address not in", values, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_address between", value1, value2, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_address not between", value1, value2, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("temp_member.last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("temp_member.last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("temp_member.last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("temp_member.last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("temp_member.last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("temp_member.last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("temp_member.last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("temp_member.last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressIsNull() {
            addCriterion("temp_member.last_login_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressIsNotNull() {
            addCriterion("temp_member.last_login_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressEqualTo(String value) {
            addCriterion("temp_member.last_login_ip_address =", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotEqualTo(String value) {
            addCriterion("temp_member.last_login_ip_address <>", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressGreaterThan(String value) {
            addCriterion("temp_member.last_login_ip_address >", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.last_login_ip_address >=", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressLessThan(String value) {
            addCriterion("temp_member.last_login_ip_address <", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.last_login_ip_address <=", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressLike(String value) {
            addCriterion("temp_member.last_login_ip_address like", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotLike(String value) {
            addCriterion("temp_member.last_login_ip_address not like", value, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressIn(List<String> values) {
            addCriterion("temp_member.last_login_ip_address in", values, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotIn(List<String> values) {
            addCriterion("temp_member.last_login_ip_address not in", values, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressBetween(String value1, String value2) {
            addCriterion("temp_member.last_login_ip_address between", value1, value2, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member.last_login_ip_address not between", value1, value2, "lastLoginIpAddress");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("temp_member.login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("temp_member.login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("temp_member.login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("temp_member.login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("temp_member.login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member.login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("temp_member.login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member.login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("temp_member.login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("temp_member.login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_member.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_member.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_member.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_member.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_member.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_member.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_member.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_member.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_member.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_member.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_member.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_member.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_member.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}