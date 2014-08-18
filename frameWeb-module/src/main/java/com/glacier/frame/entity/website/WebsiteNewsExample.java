package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteNewsExample() {
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

        public Criteria andWebNewsIdIsNull() {
            addCriterion("temp_website_news.web_news_id is null");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdIsNotNull() {
            addCriterion("temp_website_news.web_news_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdEqualTo(String value) {
            addCriterion("temp_website_news.web_news_id =", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdNotEqualTo(String value) {
            addCriterion("temp_website_news.web_news_id <>", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdGreaterThan(String value) {
            addCriterion("temp_website_news.web_news_id >", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_news.web_news_id >=", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdLessThan(String value) {
            addCriterion("temp_website_news.web_news_id <", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_news.web_news_id <=", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdLike(String value) {
            addCriterion("temp_website_news.web_news_id like", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdNotLike(String value) {
            addCriterion("temp_website_news.web_news_id not like", value, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdIn(List<String> values) {
            addCriterion("temp_website_news.web_news_id in", values, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdNotIn(List<String> values) {
            addCriterion("temp_website_news.web_news_id not in", values, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdBetween(String value1, String value2) {
            addCriterion("temp_website_news.web_news_id between", value1, value2, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_news.web_news_id not between", value1, value2, "webNewsId");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeIsNull() {
            addCriterion("temp_website_news.web_news_theme is null");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeIsNotNull() {
            addCriterion("temp_website_news.web_news_theme is not null");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeEqualTo(String value) {
            addCriterion("temp_website_news.web_news_theme =", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeNotEqualTo(String value) {
            addCriterion("temp_website_news.web_news_theme <>", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeGreaterThan(String value) {
            addCriterion("temp_website_news.web_news_theme >", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_news.web_news_theme >=", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeLessThan(String value) {
            addCriterion("temp_website_news.web_news_theme <", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeLessThanOrEqualTo(String value) {
            addCriterion("temp_website_news.web_news_theme <=", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeLike(String value) {
            addCriterion("temp_website_news.web_news_theme like", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeNotLike(String value) {
            addCriterion("temp_website_news.web_news_theme not like", value, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeIn(List<String> values) {
            addCriterion("temp_website_news.web_news_theme in", values, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeNotIn(List<String> values) {
            addCriterion("temp_website_news.web_news_theme not in", values, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeBetween(String value1, String value2) {
            addCriterion("temp_website_news.web_news_theme between", value1, value2, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsThemeNotBetween(String value1, String value2) {
            addCriterion("temp_website_news.web_news_theme not between", value1, value2, "webNewsTheme");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusIsNull() {
            addCriterion("temp_website_news.web_news_status is null");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusIsNotNull() {
            addCriterion("temp_website_news.web_news_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusEqualTo(String value) {
            addCriterion("temp_website_news.web_news_status =", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusNotEqualTo(String value) {
            addCriterion("temp_website_news.web_news_status <>", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusGreaterThan(String value) {
            addCriterion("temp_website_news.web_news_status >", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_news.web_news_status >=", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusLessThan(String value) {
            addCriterion("temp_website_news.web_news_status <", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_news.web_news_status <=", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusLike(String value) {
            addCriterion("temp_website_news.web_news_status like", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusNotLike(String value) {
            addCriterion("temp_website_news.web_news_status not like", value, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusIn(List<String> values) {
            addCriterion("temp_website_news.web_news_status in", values, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusNotIn(List<String> values) {
            addCriterion("temp_website_news.web_news_status not in", values, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusBetween(String value1, String value2) {
            addCriterion("temp_website_news.web_news_status between", value1, value2, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_news.web_news_status not between", value1, value2, "webNewsStatus");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumIsNull() {
            addCriterion("temp_website_news.web_news_num is null");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumIsNotNull() {
            addCriterion("temp_website_news.web_news_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumEqualTo(Integer value) {
            addCriterion("temp_website_news.web_news_num =", value, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumNotEqualTo(Integer value) {
            addCriterion("temp_website_news.web_news_num <>", value, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumGreaterThan(Integer value) {
            addCriterion("temp_website_news.web_news_num >", value, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_news.web_news_num >=", value, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumLessThan(Integer value) {
            addCriterion("temp_website_news.web_news_num <", value, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_news.web_news_num <=", value, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumIn(List<Integer> values) {
            addCriterion("temp_website_news.web_news_num in", values, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumNotIn(List<Integer> values) {
            addCriterion("temp_website_news.web_news_num not in", values, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_news.web_news_num between", value1, value2, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andWebNewsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_news.web_news_num not between", value1, value2, "webNewsNum");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_website_news.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_website_news.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_website_news.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_website_news.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_website_news.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_news.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_website_news.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_website_news.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_website_news.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_website_news.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_website_news.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_website_news.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_website_news.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_website_news.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_news.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_news.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_news.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_news.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_news.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_news.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_news.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_news.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_news.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_news.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_news.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_news.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_news.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_news.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_news.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_news.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_news.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_news.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_news.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_news.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_news.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_news.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_news.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_news.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_news.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_news.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_news.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_news.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_news.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_news.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_news.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_news.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_news.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_news.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_news.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_news.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_news.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_news.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_news.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_news.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_news.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_news.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_news.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_news.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_news.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_news.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_news.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_news.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_news.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_news.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_news.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_news.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_news.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_news.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_news.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_news.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_news.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_news.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_news.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_news.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_news.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_news.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_news.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_news.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_news.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_news.update_time not between", value1, value2, "updateTime");
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