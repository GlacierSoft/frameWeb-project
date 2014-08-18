package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteHiringExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteHiringExample() {
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

        public Criteria andWebHiringIdIsNull() {
            addCriterion("temp_website_hiring.web_hiring_id is null");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdIsNotNull() {
            addCriterion("temp_website_hiring.web_hiring_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_id =", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdNotEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_id <>", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdGreaterThan(String value) {
            addCriterion("temp_website_hiring.web_hiring_id >", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_id >=", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdLessThan(String value) {
            addCriterion("temp_website_hiring.web_hiring_id <", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_id <=", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdLike(String value) {
            addCriterion("temp_website_hiring.web_hiring_id like", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdNotLike(String value) {
            addCriterion("temp_website_hiring.web_hiring_id not like", value, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdIn(List<String> values) {
            addCriterion("temp_website_hiring.web_hiring_id in", values, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdNotIn(List<String> values) {
            addCriterion("temp_website_hiring.web_hiring_id not in", values, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.web_hiring_id between", value1, value2, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.web_hiring_id not between", value1, value2, "webHiringId");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeIsNull() {
            addCriterion("temp_website_hiring.web_hiring_theme is null");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeIsNotNull() {
            addCriterion("temp_website_hiring.web_hiring_theme is not null");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme =", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeNotEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme <>", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeGreaterThan(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme >", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme >=", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeLessThan(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme <", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeLessThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme <=", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeLike(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme like", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeNotLike(String value) {
            addCriterion("temp_website_hiring.web_hiring_theme not like", value, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeIn(List<String> values) {
            addCriterion("temp_website_hiring.web_hiring_theme in", values, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeNotIn(List<String> values) {
            addCriterion("temp_website_hiring.web_hiring_theme not in", values, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.web_hiring_theme between", value1, value2, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringThemeNotBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.web_hiring_theme not between", value1, value2, "webHiringTheme");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusIsNull() {
            addCriterion("temp_website_hiring.web_hiring_status is null");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusIsNotNull() {
            addCriterion("temp_website_hiring.web_hiring_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_status =", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusNotEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_status <>", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusGreaterThan(String value) {
            addCriterion("temp_website_hiring.web_hiring_status >", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_status >=", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusLessThan(String value) {
            addCriterion("temp_website_hiring.web_hiring_status <", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.web_hiring_status <=", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusLike(String value) {
            addCriterion("temp_website_hiring.web_hiring_status like", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusNotLike(String value) {
            addCriterion("temp_website_hiring.web_hiring_status not like", value, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusIn(List<String> values) {
            addCriterion("temp_website_hiring.web_hiring_status in", values, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusNotIn(List<String> values) {
            addCriterion("temp_website_hiring.web_hiring_status not in", values, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.web_hiring_status between", value1, value2, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andWebHiringStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.web_hiring_status not between", value1, value2, "webHiringStatus");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_website_hiring.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_website_hiring.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_website_hiring.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_website_hiring.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_website_hiring.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_website_hiring.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_website_hiring.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_website_hiring.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_website_hiring.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_website_hiring.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumIsNull() {
            addCriterion("temp_website_hiring.web_hiring_num is null");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumIsNotNull() {
            addCriterion("temp_website_hiring.web_hiring_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumEqualTo(Integer value) {
            addCriterion("temp_website_hiring.web_hiring_num =", value, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumNotEqualTo(Integer value) {
            addCriterion("temp_website_hiring.web_hiring_num <>", value, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumGreaterThan(Integer value) {
            addCriterion("temp_website_hiring.web_hiring_num >", value, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_hiring.web_hiring_num >=", value, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumLessThan(Integer value) {
            addCriterion("temp_website_hiring.web_hiring_num <", value, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_hiring.web_hiring_num <=", value, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumIn(List<Integer> values) {
            addCriterion("temp_website_hiring.web_hiring_num in", values, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumNotIn(List<Integer> values) {
            addCriterion("temp_website_hiring.web_hiring_num not in", values, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_hiring.web_hiring_num between", value1, value2, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andWebHiringNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_hiring.web_hiring_num not between", value1, value2, "webHiringNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_hiring.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_hiring.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_hiring.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_hiring.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_hiring.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_hiring.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_hiring.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_hiring.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_hiring.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_hiring.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_hiring.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_hiring.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_hiring.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_hiring.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_hiring.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_hiring.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_hiring.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_hiring.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_hiring.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_hiring.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_hiring.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_hiring.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_hiring.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_hiring.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_hiring.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_hiring.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_hiring.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_hiring.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_hiring.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_hiring.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_hiring.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_hiring.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_hiring.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_hiring.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_hiring.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_hiring.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_hiring.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_hiring.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_hiring.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_hiring.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_hiring.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_hiring.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_hiring.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_hiring.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_hiring.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_hiring.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_hiring.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_hiring.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_hiring.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_hiring.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_hiring.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_hiring.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_hiring.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_hiring.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_hiring.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_hiring.update_time not between", value1, value2, "updateTime");
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