package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteHelpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteHelpExample() {
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

        public Criteria andWebHelpIdIsNull() {
            addCriterion("temp_website_help.web_help_id is null");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdIsNotNull() {
            addCriterion("temp_website_help.web_help_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdEqualTo(String value) {
            addCriterion("temp_website_help.web_help_id =", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdNotEqualTo(String value) {
            addCriterion("temp_website_help.web_help_id <>", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdGreaterThan(String value) {
            addCriterion("temp_website_help.web_help_id >", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_id >=", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdLessThan(String value) {
            addCriterion("temp_website_help.web_help_id <", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_id <=", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdLike(String value) {
            addCriterion("temp_website_help.web_help_id like", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdNotLike(String value) {
            addCriterion("temp_website_help.web_help_id not like", value, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdIn(List<String> values) {
            addCriterion("temp_website_help.web_help_id in", values, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdNotIn(List<String> values) {
            addCriterion("temp_website_help.web_help_id not in", values, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_id between", value1, value2, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_id not between", value1, value2, "webHelpId");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeIsNull() {
            addCriterion("temp_website_help.web_help_theme is null");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeIsNotNull() {
            addCriterion("temp_website_help.web_help_theme is not null");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeEqualTo(String value) {
            addCriterion("temp_website_help.web_help_theme =", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeNotEqualTo(String value) {
            addCriterion("temp_website_help.web_help_theme <>", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeGreaterThan(String value) {
            addCriterion("temp_website_help.web_help_theme >", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_theme >=", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeLessThan(String value) {
            addCriterion("temp_website_help.web_help_theme <", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_theme <=", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeLike(String value) {
            addCriterion("temp_website_help.web_help_theme like", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeNotLike(String value) {
            addCriterion("temp_website_help.web_help_theme not like", value, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeIn(List<String> values) {
            addCriterion("temp_website_help.web_help_theme in", values, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeNotIn(List<String> values) {
            addCriterion("temp_website_help.web_help_theme not in", values, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_theme between", value1, value2, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpThemeNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_theme not between", value1, value2, "webHelpTheme");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeIsNull() {
            addCriterion("temp_website_help.web_help_type is null");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeIsNotNull() {
            addCriterion("temp_website_help.web_help_type is not null");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeEqualTo(String value) {
            addCriterion("temp_website_help.web_help_type =", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeNotEqualTo(String value) {
            addCriterion("temp_website_help.web_help_type <>", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeGreaterThan(String value) {
            addCriterion("temp_website_help.web_help_type >", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_type >=", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeLessThan(String value) {
            addCriterion("temp_website_help.web_help_type <", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_type <=", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeLike(String value) {
            addCriterion("temp_website_help.web_help_type like", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeNotLike(String value) {
            addCriterion("temp_website_help.web_help_type not like", value, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeIn(List<String> values) {
            addCriterion("temp_website_help.web_help_type in", values, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeNotIn(List<String> values) {
            addCriterion("temp_website_help.web_help_type not in", values, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_type between", value1, value2, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpTypeNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_type not between", value1, value2, "webHelpType");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusIsNull() {
            addCriterion("temp_website_help.web_help_status is null");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusIsNotNull() {
            addCriterion("temp_website_help.web_help_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusEqualTo(String value) {
            addCriterion("temp_website_help.web_help_status =", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusNotEqualTo(String value) {
            addCriterion("temp_website_help.web_help_status <>", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusGreaterThan(String value) {
            addCriterion("temp_website_help.web_help_status >", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_status >=", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusLessThan(String value) {
            addCriterion("temp_website_help.web_help_status <", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.web_help_status <=", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusLike(String value) {
            addCriterion("temp_website_help.web_help_status like", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusNotLike(String value) {
            addCriterion("temp_website_help.web_help_status not like", value, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusIn(List<String> values) {
            addCriterion("temp_website_help.web_help_status in", values, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusNotIn(List<String> values) {
            addCriterion("temp_website_help.web_help_status not in", values, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_status between", value1, value2, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andWebHelpStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.web_help_status not between", value1, value2, "webHelpStatus");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_website_help.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_website_help.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_website_help.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_website_help.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_website_help.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_website_help.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_website_help.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_website_help.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_website_help.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_website_help.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_website_help.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andWebClaNumIsNull() {
            addCriterion("temp_website_help.web_cla_num is null");
            return (Criteria) this;
        }

        public Criteria andWebClaNumIsNotNull() {
            addCriterion("temp_website_help.web_cla_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebClaNumEqualTo(Integer value) {
            addCriterion("temp_website_help.web_cla_num =", value, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumNotEqualTo(Integer value) {
            addCriterion("temp_website_help.web_cla_num <>", value, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumGreaterThan(Integer value) {
            addCriterion("temp_website_help.web_cla_num >", value, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_help.web_cla_num >=", value, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumLessThan(Integer value) {
            addCriterion("temp_website_help.web_cla_num <", value, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_help.web_cla_num <=", value, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumIn(List<Integer> values) {
            addCriterion("temp_website_help.web_cla_num in", values, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumNotIn(List<Integer> values) {
            addCriterion("temp_website_help.web_cla_num not in", values, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_help.web_cla_num between", value1, value2, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andWebClaNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_help.web_cla_num not between", value1, value2, "webClaNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_help.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_help.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_help.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_help.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_help.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_help.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_help.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_help.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_help.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_help.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_help.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_help.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_help.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_help.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_help.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_help.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_help.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_help.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_help.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_help.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_help.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_help.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_help.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_help.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_help.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_help.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_help.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_help.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_help.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_help.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_help.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_help.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_help.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_help.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_help.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_help.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_help.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_help.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_help.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_help.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_help.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_help.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_help.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_help.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_help.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_help.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_help.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_help.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_help.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_help.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_help.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_help.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_help.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_help.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_help.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_help.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_help.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_help.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_help.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_help.update_time not between", value1, value2, "updateTime");
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