package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParameterIntegralExample() {
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

        public Criteria andIntegralIdIsNull() {
            addCriterion("temp_parameter_integral.integral_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdIsNotNull() {
            addCriterion("temp_parameter_integral.integral_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_id =", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_id <>", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdGreaterThan(String value) {
            addCriterion("temp_parameter_integral.integral_id >", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_id >=", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLessThan(String value) {
            addCriterion("temp_parameter_integral.integral_id <", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_id <=", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLike(String value) {
            addCriterion("temp_parameter_integral.integral_id like", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotLike(String value) {
            addCriterion("temp_parameter_integral.integral_id not like", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdIn(List<String> values) {
            addCriterion("temp_parameter_integral.integral_id in", values, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotIn(List<String> values) {
            addCriterion("temp_parameter_integral.integral_id not in", values, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.integral_id between", value1, value2, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.integral_id not between", value1, value2, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralNameIsNull() {
            addCriterion("temp_parameter_integral.integral_name is null");
            return (Criteria) this;
        }

        public Criteria andIntegralNameIsNotNull() {
            addCriterion("temp_parameter_integral.integral_name is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralNameEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_name =", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameNotEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_name <>", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameGreaterThan(String value) {
            addCriterion("temp_parameter_integral.integral_name >", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_name >=", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameLessThan(String value) {
            addCriterion("temp_parameter_integral.integral_name <", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_name <=", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameLike(String value) {
            addCriterion("temp_parameter_integral.integral_name like", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameNotLike(String value) {
            addCriterion("temp_parameter_integral.integral_name not like", value, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameIn(List<String> values) {
            addCriterion("temp_parameter_integral.integral_name in", values, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameNotIn(List<String> values) {
            addCriterion("temp_parameter_integral.integral_name not in", values, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.integral_name between", value1, value2, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralNameNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.integral_name not between", value1, value2, "integralName");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginIsNull() {
            addCriterion("temp_parameter_integral.integral_begin is null");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginIsNotNull() {
            addCriterion("temp_parameter_integral.integral_begin is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_begin =", value, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginNotEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_begin <>", value, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginGreaterThan(Integer value) {
            addCriterion("temp_parameter_integral.integral_begin >", value, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_begin >=", value, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginLessThan(Integer value) {
            addCriterion("temp_parameter_integral.integral_begin <", value, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_begin <=", value, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginIn(List<Integer> values) {
            addCriterion("temp_parameter_integral.integral_begin in", values, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginNotIn(List<Integer> values) {
            addCriterion("temp_parameter_integral.integral_begin not in", values, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_integral.integral_begin between", value1, value2, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralBeginNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_integral.integral_begin not between", value1, value2, "integralBegin");
            return (Criteria) this;
        }

        public Criteria andIntegralEndIsNull() {
            addCriterion("temp_parameter_integral.integral_end is null");
            return (Criteria) this;
        }

        public Criteria andIntegralEndIsNotNull() {
            addCriterion("temp_parameter_integral.integral_end is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEndEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_end =", value, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndNotEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_end <>", value, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndGreaterThan(Integer value) {
            addCriterion("temp_parameter_integral.integral_end >", value, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_end >=", value, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndLessThan(Integer value) {
            addCriterion("temp_parameter_integral.integral_end <", value, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_end <=", value, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndIn(List<Integer> values) {
            addCriterion("temp_parameter_integral.integral_end in", values, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndNotIn(List<Integer> values) {
            addCriterion("temp_parameter_integral.integral_end not in", values, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_integral.integral_end between", value1, value2, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralEndNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_integral.integral_end not between", value1, value2, "integralEnd");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoIsNull() {
            addCriterion("temp_parameter_integral.integral_photo is null");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoIsNotNull() {
            addCriterion("temp_parameter_integral.integral_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_photo =", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoNotEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_photo <>", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoGreaterThan(String value) {
            addCriterion("temp_parameter_integral.integral_photo >", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_photo >=", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoLessThan(String value) {
            addCriterion("temp_parameter_integral.integral_photo <", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.integral_photo <=", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoLike(String value) {
            addCriterion("temp_parameter_integral.integral_photo like", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoNotLike(String value) {
            addCriterion("temp_parameter_integral.integral_photo not like", value, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoIn(List<String> values) {
            addCriterion("temp_parameter_integral.integral_photo in", values, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoNotIn(List<String> values) {
            addCriterion("temp_parameter_integral.integral_photo not in", values, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.integral_photo between", value1, value2, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralPhotoNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.integral_photo not between", value1, value2, "integralPhoto");
            return (Criteria) this;
        }

        public Criteria andIntegralNumIsNull() {
            addCriterion("temp_parameter_integral.integral_num is null");
            return (Criteria) this;
        }

        public Criteria andIntegralNumIsNotNull() {
            addCriterion("temp_parameter_integral.integral_num is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralNumEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_num =", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumNotEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_num <>", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumGreaterThan(Integer value) {
            addCriterion("temp_parameter_integral.integral_num >", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_num >=", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumLessThan(Integer value) {
            addCriterion("temp_parameter_integral.integral_num <", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_integral.integral_num <=", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumIn(List<Integer> values) {
            addCriterion("temp_parameter_integral.integral_num in", values, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumNotIn(List<Integer> values) {
            addCriterion("temp_parameter_integral.integral_num not in", values, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_integral.integral_num between", value1, value2, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_integral.integral_num not between", value1, value2, "integralNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_parameter_integral.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_parameter_integral.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_parameter_integral.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_parameter_integral.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_parameter_integral.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_parameter_integral.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_parameter_integral.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_parameter_integral.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_parameter_integral.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_parameter_integral.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_parameter_integral.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_parameter_integral.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_parameter_integral.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_parameter_integral.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_parameter_integral.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_parameter_integral.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_parameter_integral.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_parameter_integral.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_parameter_integral.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_parameter_integral.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_parameter_integral.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_parameter_integral.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_integral.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_integral.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_integral.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_integral.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_parameter_integral.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_integral.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_integral.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_integral.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_integral.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_integral.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_parameter_integral.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_parameter_integral.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_parameter_integral.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_parameter_integral.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_parameter_integral.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_parameter_integral.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_integral.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_parameter_integral.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_parameter_integral.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_parameter_integral.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_parameter_integral.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_integral.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_parameter_integral.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_parameter_integral.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_integral.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_integral.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_integral.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_integral.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_parameter_integral.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_integral.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_integral.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_integral.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_integral.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_integral.update_time not between", value1, value2, "updateTime");
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