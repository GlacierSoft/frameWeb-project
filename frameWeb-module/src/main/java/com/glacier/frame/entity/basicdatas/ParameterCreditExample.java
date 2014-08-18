package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterCreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParameterCreditExample() {
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

        public Criteria andCreditIdIsNull() {
            addCriterion("temp_parameter_credit.credit_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditIdIsNotNull() {
            addCriterion("temp_parameter_credit.credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditIdEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_id =", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_id <>", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThan(String value) {
            addCriterion("temp_parameter_credit.credit_id >", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_id >=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThan(String value) {
            addCriterion("temp_parameter_credit.credit_id <", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_id <=", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdLike(String value) {
            addCriterion("temp_parameter_credit.credit_id like", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotLike(String value) {
            addCriterion("temp_parameter_credit.credit_id not like", value, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdIn(List<String> values) {
            addCriterion("temp_parameter_credit.credit_id in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotIn(List<String> values) {
            addCriterion("temp_parameter_credit.credit_id not in", values, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.credit_id between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.credit_id not between", value1, value2, "creditId");
            return (Criteria) this;
        }

        public Criteria andCreditNameIsNull() {
            addCriterion("temp_parameter_credit.credit_name is null");
            return (Criteria) this;
        }

        public Criteria andCreditNameIsNotNull() {
            addCriterion("temp_parameter_credit.credit_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNameEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_name =", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_name <>", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameGreaterThan(String value) {
            addCriterion("temp_parameter_credit.credit_name >", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_name >=", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameLessThan(String value) {
            addCriterion("temp_parameter_credit.credit_name <", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_name <=", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameLike(String value) {
            addCriterion("temp_parameter_credit.credit_name like", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotLike(String value) {
            addCriterion("temp_parameter_credit.credit_name not like", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameIn(List<String> values) {
            addCriterion("temp_parameter_credit.credit_name in", values, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotIn(List<String> values) {
            addCriterion("temp_parameter_credit.credit_name not in", values, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.credit_name between", value1, value2, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.credit_name not between", value1, value2, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralIsNull() {
            addCriterion("temp_parameter_credit.credit_begin_integral is null");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralIsNotNull() {
            addCriterion("temp_parameter_credit.credit_begin_integral is not null");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_begin_integral =", value, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralNotEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_begin_integral <>", value, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralGreaterThan(Integer value) {
            addCriterion("temp_parameter_credit.credit_begin_integral >", value, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_begin_integral >=", value, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralLessThan(Integer value) {
            addCriterion("temp_parameter_credit.credit_begin_integral <", value, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_begin_integral <=", value, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralIn(List<Integer> values) {
            addCriterion("temp_parameter_credit.credit_begin_integral in", values, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralNotIn(List<Integer> values) {
            addCriterion("temp_parameter_credit.credit_begin_integral not in", values, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_credit.credit_begin_integral between", value1, value2, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditBeginIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_credit.credit_begin_integral not between", value1, value2, "creditBeginIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralIsNull() {
            addCriterion("temp_parameter_credit.credit_end_integral is null");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralIsNotNull() {
            addCriterion("temp_parameter_credit.credit_end_integral is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_end_integral =", value, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralNotEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_end_integral <>", value, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralGreaterThan(Integer value) {
            addCriterion("temp_parameter_credit.credit_end_integral >", value, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_end_integral >=", value, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralLessThan(Integer value) {
            addCriterion("temp_parameter_credit.credit_end_integral <", value, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_end_integral <=", value, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralIn(List<Integer> values) {
            addCriterion("temp_parameter_credit.credit_end_integral in", values, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralNotIn(List<Integer> values) {
            addCriterion("temp_parameter_credit.credit_end_integral not in", values, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_credit.credit_end_integral between", value1, value2, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditEndIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_credit.credit_end_integral not between", value1, value2, "creditEndIntegral");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoIsNull() {
            addCriterion("temp_parameter_credit.credit_photo is null");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoIsNotNull() {
            addCriterion("temp_parameter_credit.credit_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_photo =", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoNotEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_photo <>", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoGreaterThan(String value) {
            addCriterion("temp_parameter_credit.credit_photo >", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_photo >=", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoLessThan(String value) {
            addCriterion("temp_parameter_credit.credit_photo <", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.credit_photo <=", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoLike(String value) {
            addCriterion("temp_parameter_credit.credit_photo like", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoNotLike(String value) {
            addCriterion("temp_parameter_credit.credit_photo not like", value, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoIn(List<String> values) {
            addCriterion("temp_parameter_credit.credit_photo in", values, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoNotIn(List<String> values) {
            addCriterion("temp_parameter_credit.credit_photo not in", values, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.credit_photo between", value1, value2, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andCreditPhotoNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.credit_photo not between", value1, value2, "creditPhoto");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_parameter_credit.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_parameter_credit.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_parameter_credit.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_parameter_credit.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_parameter_credit.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_parameter_credit.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_parameter_credit.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_parameter_credit.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_parameter_credit.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_parameter_credit.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andCreditNumIsNull() {
            addCriterion("temp_parameter_credit.credit_num is null");
            return (Criteria) this;
        }

        public Criteria andCreditNumIsNotNull() {
            addCriterion("temp_parameter_credit.credit_num is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNumEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_num =", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_num <>", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumGreaterThan(Integer value) {
            addCriterion("temp_parameter_credit.credit_num >", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_num >=", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumLessThan(Integer value) {
            addCriterion("temp_parameter_credit.credit_num <", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_credit.credit_num <=", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumIn(List<Integer> values) {
            addCriterion("temp_parameter_credit.credit_num in", values, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotIn(List<Integer> values) {
            addCriterion("temp_parameter_credit.credit_num not in", values, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_credit.credit_num between", value1, value2, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_credit.credit_num not between", value1, value2, "creditNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_parameter_credit.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_parameter_credit.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_parameter_credit.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_parameter_credit.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_parameter_credit.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_parameter_credit.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_parameter_credit.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_parameter_credit.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_parameter_credit.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_parameter_credit.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_parameter_credit.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_parameter_credit.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_parameter_credit.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_parameter_credit.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_parameter_credit.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_parameter_credit.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_parameter_credit.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_parameter_credit.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_parameter_credit.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_parameter_credit.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_parameter_credit.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_parameter_credit.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_credit.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_credit.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_credit.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_credit.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_parameter_credit.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_credit.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_credit.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_credit.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_credit.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_credit.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_parameter_credit.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_parameter_credit.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_parameter_credit.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_parameter_credit.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_parameter_credit.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_parameter_credit.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_credit.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_parameter_credit.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_parameter_credit.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_parameter_credit.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_parameter_credit.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_credit.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_parameter_credit.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_parameter_credit.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_credit.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_credit.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_credit.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_credit.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_parameter_credit.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_credit.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_credit.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_credit.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_credit.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_credit.update_time not between", value1, value2, "updateTime");
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