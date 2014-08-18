package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteAdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteAdvertisementExample() {
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

        public Criteria andWebAdvIdIsNull() {
            addCriterion("temp_website_advertisement.web_adv_id is null");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdIsNotNull() {
            addCriterion("temp_website_advertisement.web_adv_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_id =", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdNotEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_id <>", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdGreaterThan(String value) {
            addCriterion("temp_website_advertisement.web_adv_id >", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_id >=", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdLessThan(String value) {
            addCriterion("temp_website_advertisement.web_adv_id <", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_id <=", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdLike(String value) {
            addCriterion("temp_website_advertisement.web_adv_id like", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdNotLike(String value) {
            addCriterion("temp_website_advertisement.web_adv_id not like", value, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdIn(List<String> values) {
            addCriterion("temp_website_advertisement.web_adv_id in", values, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdNotIn(List<String> values) {
            addCriterion("temp_website_advertisement.web_adv_id not in", values, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.web_adv_id between", value1, value2, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.web_adv_id not between", value1, value2, "webAdvId");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeIsNull() {
            addCriterion("temp_website_advertisement.web_adv_theme is null");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeIsNotNull() {
            addCriterion("temp_website_advertisement.web_adv_theme is not null");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme =", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeNotEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme <>", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeGreaterThan(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme >", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme >=", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeLessThan(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme <", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeLessThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme <=", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeLike(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme like", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeNotLike(String value) {
            addCriterion("temp_website_advertisement.web_adv_theme not like", value, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeIn(List<String> values) {
            addCriterion("temp_website_advertisement.web_adv_theme in", values, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeNotIn(List<String> values) {
            addCriterion("temp_website_advertisement.web_adv_theme not in", values, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.web_adv_theme between", value1, value2, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvThemeNotBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.web_adv_theme not between", value1, value2, "webAdvTheme");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusIsNull() {
            addCriterion("temp_website_advertisement.web_adv_status is null");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusIsNotNull() {
            addCriterion("temp_website_advertisement.web_adv_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_status =", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusNotEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_status <>", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusGreaterThan(String value) {
            addCriterion("temp_website_advertisement.web_adv_status >", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_status >=", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusLessThan(String value) {
            addCriterion("temp_website_advertisement.web_adv_status <", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.web_adv_status <=", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusLike(String value) {
            addCriterion("temp_website_advertisement.web_adv_status like", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusNotLike(String value) {
            addCriterion("temp_website_advertisement.web_adv_status not like", value, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusIn(List<String> values) {
            addCriterion("temp_website_advertisement.web_adv_status in", values, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusNotIn(List<String> values) {
            addCriterion("temp_website_advertisement.web_adv_status not in", values, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.web_adv_status between", value1, value2, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andWebAdvStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.web_adv_status not between", value1, value2, "webAdvStatus");
            return (Criteria) this;
        }

        public Criteria andClicksIsNull() {
            addCriterion("temp_website_advertisement.clicks is null");
            return (Criteria) this;
        }

        public Criteria andClicksIsNotNull() {
            addCriterion("temp_website_advertisement.clicks is not null");
            return (Criteria) this;
        }

        public Criteria andClicksEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.clicks =", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.clicks <>", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThan(Integer value) {
            addCriterion("temp_website_advertisement.clicks >", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.clicks >=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThan(Integer value) {
            addCriterion("temp_website_advertisement.clicks <", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.clicks <=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksIn(List<Integer> values) {
            addCriterion("temp_website_advertisement.clicks in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotIn(List<Integer> values) {
            addCriterion("temp_website_advertisement.clicks not in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_advertisement.clicks between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_advertisement.clicks not between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_website_advertisement.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_website_advertisement.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_website_advertisement.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_website_advertisement.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_website_advertisement.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_website_advertisement.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_website_advertisement.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_website_advertisement.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_website_advertisement.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_website_advertisement.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumIsNull() {
            addCriterion("temp_website_advertisement.web_adv_num is null");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumIsNotNull() {
            addCriterion("temp_website_advertisement.web_adv_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.web_adv_num =", value, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumNotEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.web_adv_num <>", value, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumGreaterThan(Integer value) {
            addCriterion("temp_website_advertisement.web_adv_num >", value, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.web_adv_num >=", value, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumLessThan(Integer value) {
            addCriterion("temp_website_advertisement.web_adv_num <", value, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_advertisement.web_adv_num <=", value, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumIn(List<Integer> values) {
            addCriterion("temp_website_advertisement.web_adv_num in", values, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumNotIn(List<Integer> values) {
            addCriterion("temp_website_advertisement.web_adv_num not in", values, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_advertisement.web_adv_num between", value1, value2, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andWebAdvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_advertisement.web_adv_num not between", value1, value2, "webAdvNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_advertisement.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_advertisement.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_advertisement.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_advertisement.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_advertisement.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_advertisement.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_advertisement.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_advertisement.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_advertisement.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_advertisement.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_advertisement.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_advertisement.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_advertisement.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_advertisement.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_advertisement.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_advertisement.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_advertisement.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_advertisement.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_advertisement.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_advertisement.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_advertisement.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_advertisement.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_advertisement.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_advertisement.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_advertisement.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_advertisement.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_advertisement.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_advertisement.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_advertisement.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_advertisement.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_advertisement.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_advertisement.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_advertisement.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_advertisement.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_advertisement.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_advertisement.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_advertisement.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_advertisement.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_advertisement.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_advertisement.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_advertisement.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_advertisement.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_advertisement.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_advertisement.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_advertisement.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_advertisement.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_advertisement.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_advertisement.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_advertisement.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_advertisement.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_advertisement.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_advertisement.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_advertisement.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_advertisement.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_advertisement.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_advertisement.update_time not between", value1, value2, "updateTime");
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