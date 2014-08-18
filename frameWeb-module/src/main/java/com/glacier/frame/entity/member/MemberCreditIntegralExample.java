package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberCreditIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberCreditIntegralExample() {
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
        
        //扩展查询条件
        public Criteria andMemberRealNameLike(String value) {
            addCriterion("temp_member.member_real_name like", value, "memberRealName");
            return (Criteria) this;
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

        public Criteria andCreditIntegralIdIsNull() {
            addCriterion("temp_member_credit_integral.credit_integral_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdIsNotNull() {
            addCriterion("temp_member_credit_integral.credit_integral_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdEqualTo(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id =", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdNotEqualTo(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id <>", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdGreaterThan(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id >", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id >=", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdLessThan(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id <", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id <=", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdLike(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id like", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdNotLike(String value) {
            addCriterion("temp_member_credit_integral.credit_integral_id not like", value, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdIn(List<String> values) {
            addCriterion("temp_member_credit_integral.credit_integral_id in", values, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdNotIn(List<String> values) {
            addCriterion("temp_member_credit_integral.credit_integral_id not in", values, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.credit_integral_id between", value1, value2, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andCreditIntegralIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.credit_integral_id not between", value1, value2, "creditIntegralId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_credit_integral.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_credit_integral.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_credit_integral.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_credit_integral.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_credit_integral.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_credit_integral.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_credit_integral.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_credit_integral.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_credit_integral.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_credit_integral.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeIsNull() {
            addCriterion("temp_member_credit_integral.integral_type is null");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeIsNotNull() {
            addCriterion("temp_member_credit_integral.integral_type is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeEqualTo(String value) {
            addCriterion("temp_member_credit_integral.integral_type =", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeNotEqualTo(String value) {
            addCriterion("temp_member_credit_integral.integral_type <>", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeGreaterThan(String value) {
            addCriterion("temp_member_credit_integral.integral_type >", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.integral_type >=", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeLessThan(String value) {
            addCriterion("temp_member_credit_integral.integral_type <", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.integral_type <=", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeLike(String value) {
            addCriterion("temp_member_credit_integral.integral_type like", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeNotLike(String value) {
            addCriterion("temp_member_credit_integral.integral_type not like", value, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeIn(List<String> values) {
            addCriterion("temp_member_credit_integral.integral_type in", values, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeNotIn(List<String> values) {
            addCriterion("temp_member_credit_integral.integral_type not in", values, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.integral_type between", value1, value2, "integralType");
            return (Criteria) this;
        }

        public Criteria andIntegralTypeNotBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.integral_type not between", value1, value2, "integralType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("temp_member_credit_integral.change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("temp_member_credit_integral.change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("temp_member_credit_integral.change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("temp_member_credit_integral.change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("temp_member_credit_integral.change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("temp_member_credit_integral.change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("temp_member_credit_integral.change_type like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("temp_member_credit_integral.change_type not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("temp_member_credit_integral.change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("temp_member_credit_integral.change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeValueIsNull() {
            addCriterion("temp_member_credit_integral.change_value is null");
            return (Criteria) this;
        }

        public Criteria andChangeValueIsNotNull() {
            addCriterion("temp_member_credit_integral.change_value is not null");
            return (Criteria) this;
        }

        public Criteria andChangeValueEqualTo(Integer value) {
            addCriterion("temp_member_credit_integral.change_value =", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotEqualTo(Integer value) {
            addCriterion("temp_member_credit_integral.change_value <>", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueGreaterThan(Integer value) {
            addCriterion("temp_member_credit_integral.change_value >", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_credit_integral.change_value >=", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueLessThan(Integer value) {
            addCriterion("temp_member_credit_integral.change_value <", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_credit_integral.change_value <=", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueIn(List<Integer> values) {
            addCriterion("temp_member_credit_integral.change_value in", values, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotIn(List<Integer> values) {
            addCriterion("temp_member_credit_integral.change_value not in", values, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_credit_integral.change_value between", value1, value2, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_credit_integral.change_value not between", value1, value2, "changeValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_member_credit_integral.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_member_credit_integral.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_member_credit_integral.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_member_credit_integral.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_member_credit_integral.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_member_credit_integral.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_member_credit_integral.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_member_credit_integral.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_member_credit_integral.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_member_credit_integral.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_credit_integral.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_credit_integral.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_credit_integral.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_credit_integral.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_credit_integral.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_credit_integral.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_credit_integral.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_credit_integral.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_credit_integral.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_credit_integral.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member_credit_integral.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member_credit_integral.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member_credit_integral.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member_credit_integral.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member_credit_integral.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_credit_integral.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_credit_integral.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_credit_integral.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_credit_integral.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_credit_integral.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_credit_integral.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_credit_integral.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_credit_integral.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_credit_integral.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_credit_integral.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_credit_integral.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_credit_integral.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_credit_integral.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_credit_integral.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_credit_integral.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_credit_integral.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_credit_integral.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_credit_integral.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_credit_integral.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_credit_integral.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_credit_integral.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_credit_integral.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_credit_integral.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_credit_integral.update_time not between", value1, value2, "updateTime");
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