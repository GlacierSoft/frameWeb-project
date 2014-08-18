package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterAgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParameterAgeExample() {
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

        public Criteria andAgeIdIsNull() {
            addCriterion("temp_parameter_age.age_id is null");
            return (Criteria) this;
        }

        public Criteria andAgeIdIsNotNull() {
            addCriterion("temp_parameter_age.age_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgeIdEqualTo(String value) {
            addCriterion("temp_parameter_age.age_id =", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotEqualTo(String value) {
            addCriterion("temp_parameter_age.age_id <>", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdGreaterThan(String value) {
            addCriterion("temp_parameter_age.age_id >", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.age_id >=", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdLessThan(String value) {
            addCriterion("temp_parameter_age.age_id <", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.age_id <=", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdLike(String value) {
            addCriterion("temp_parameter_age.age_id like", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotLike(String value) {
            addCriterion("temp_parameter_age.age_id not like", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdIn(List<String> values) {
            addCriterion("temp_parameter_age.age_id in", values, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotIn(List<String> values) {
            addCriterion("temp_parameter_age.age_id not in", values, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.age_id between", value1, value2, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.age_id not between", value1, value2, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeNameIsNull() {
            addCriterion("temp_parameter_age.age_name is null");
            return (Criteria) this;
        }

        public Criteria andAgeNameIsNotNull() {
            addCriterion("temp_parameter_age.age_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgeNameEqualTo(String value) {
            addCriterion("temp_parameter_age.age_name =", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotEqualTo(String value) {
            addCriterion("temp_parameter_age.age_name <>", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameGreaterThan(String value) {
            addCriterion("temp_parameter_age.age_name >", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.age_name >=", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameLessThan(String value) {
            addCriterion("temp_parameter_age.age_name <", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.age_name <=", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameLike(String value) {
            addCriterion("temp_parameter_age.age_name like", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotLike(String value) {
            addCriterion("temp_parameter_age.age_name not like", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameIn(List<String> values) {
            addCriterion("temp_parameter_age.age_name in", values, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotIn(List<String> values) {
            addCriterion("temp_parameter_age.age_name not in", values, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.age_name between", value1, value2, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.age_name not between", value1, value2, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeBeginIsNull() {
            addCriterion("temp_parameter_age.age_begin is null");
            return (Criteria) this;
        }

        public Criteria andAgeBeginIsNotNull() {
            addCriterion("temp_parameter_age.age_begin is not null");
            return (Criteria) this;
        }

        public Criteria andAgeBeginEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_begin =", value, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginNotEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_begin <>", value, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginGreaterThan(Integer value) {
            addCriterion("temp_parameter_age.age_begin >", value, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_begin >=", value, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginLessThan(Integer value) {
            addCriterion("temp_parameter_age.age_begin <", value, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_begin <=", value, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginIn(List<Integer> values) {
            addCriterion("temp_parameter_age.age_begin in", values, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginNotIn(List<Integer> values) {
            addCriterion("temp_parameter_age.age_begin not in", values, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_age.age_begin between", value1, value2, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeBeginNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_age.age_begin not between", value1, value2, "ageBegin");
            return (Criteria) this;
        }

        public Criteria andAgeEndIsNull() {
            addCriterion("temp_parameter_age.age_end is null");
            return (Criteria) this;
        }

        public Criteria andAgeEndIsNotNull() {
            addCriterion("temp_parameter_age.age_end is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEndEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_end =", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndNotEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_end <>", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndGreaterThan(Integer value) {
            addCriterion("temp_parameter_age.age_end >", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_end >=", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndLessThan(Integer value) {
            addCriterion("temp_parameter_age.age_end <", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_end <=", value, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndIn(List<Integer> values) {
            addCriterion("temp_parameter_age.age_end in", values, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndNotIn(List<Integer> values) {
            addCriterion("temp_parameter_age.age_end not in", values, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_age.age_end between", value1, value2, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAgeEndNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_age.age_end not between", value1, value2, "ageEnd");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_parameter_age.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_parameter_age.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_parameter_age.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_parameter_age.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_parameter_age.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_parameter_age.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_parameter_age.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_parameter_age.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_parameter_age.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_parameter_age.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAgeNumIsNull() {
            addCriterion("temp_parameter_age.age_num is null");
            return (Criteria) this;
        }

        public Criteria andAgeNumIsNotNull() {
            addCriterion("temp_parameter_age.age_num is not null");
            return (Criteria) this;
        }

        public Criteria andAgeNumEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_num =", value, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumNotEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_num <>", value, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumGreaterThan(Integer value) {
            addCriterion("temp_parameter_age.age_num >", value, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_num >=", value, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumLessThan(Integer value) {
            addCriterion("temp_parameter_age.age_num <", value, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_age.age_num <=", value, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumIn(List<Integer> values) {
            addCriterion("temp_parameter_age.age_num in", values, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumNotIn(List<Integer> values) {
            addCriterion("temp_parameter_age.age_num not in", values, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_age.age_num between", value1, value2, "ageNum");
            return (Criteria) this;
        }

        public Criteria andAgeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_age.age_num not between", value1, value2, "ageNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_parameter_age.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_parameter_age.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_parameter_age.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_parameter_age.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_parameter_age.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_parameter_age.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_parameter_age.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_parameter_age.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_parameter_age.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_parameter_age.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_parameter_age.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_parameter_age.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_parameter_age.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_parameter_age.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_parameter_age.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_parameter_age.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_parameter_age.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_parameter_age.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_parameter_age.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_parameter_age.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_parameter_age.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_parameter_age.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_age.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_age.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_age.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_age.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_parameter_age.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_age.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_age.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_age.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_age.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_age.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_parameter_age.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_parameter_age.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_parameter_age.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_parameter_age.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_parameter_age.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_parameter_age.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_age.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_parameter_age.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_parameter_age.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_parameter_age.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_parameter_age.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_age.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_parameter_age.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_parameter_age.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_age.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_age.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_age.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_age.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_parameter_age.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_age.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_age.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_age.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_age.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_age.update_time not between", value1, value2, "updateTime");
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