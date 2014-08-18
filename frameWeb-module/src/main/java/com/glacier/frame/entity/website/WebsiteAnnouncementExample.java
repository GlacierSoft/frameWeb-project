package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteAnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteAnnouncementExample() {
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

        public Criteria andWebAnnIdIsNull() {
            addCriterion("temp_website_announcement.web_ann_id is null");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdIsNotNull() {
            addCriterion("temp_website_announcement.web_ann_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_id =", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdNotEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_id <>", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdGreaterThan(String value) {
            addCriterion("temp_website_announcement.web_ann_id >", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_id >=", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdLessThan(String value) {
            addCriterion("temp_website_announcement.web_ann_id <", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_id <=", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdLike(String value) {
            addCriterion("temp_website_announcement.web_ann_id like", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdNotLike(String value) {
            addCriterion("temp_website_announcement.web_ann_id not like", value, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdIn(List<String> values) {
            addCriterion("temp_website_announcement.web_ann_id in", values, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdNotIn(List<String> values) {
            addCriterion("temp_website_announcement.web_ann_id not in", values, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.web_ann_id between", value1, value2, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.web_ann_id not between", value1, value2, "webAnnId");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeIsNull() {
            addCriterion("temp_website_announcement.web_ann_theme is null");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeIsNotNull() {
            addCriterion("temp_website_announcement.web_ann_theme is not null");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_theme =", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeNotEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_theme <>", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeGreaterThan(String value) {
            addCriterion("temp_website_announcement.web_ann_theme >", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_theme >=", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeLessThan(String value) {
            addCriterion("temp_website_announcement.web_ann_theme <", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeLessThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_theme <=", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeLike(String value) {
            addCriterion("temp_website_announcement.web_ann_theme like", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeNotLike(String value) {
            addCriterion("temp_website_announcement.web_ann_theme not like", value, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeIn(List<String> values) {
            addCriterion("temp_website_announcement.web_ann_theme in", values, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeNotIn(List<String> values) {
            addCriterion("temp_website_announcement.web_ann_theme not in", values, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.web_ann_theme between", value1, value2, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnThemeNotBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.web_ann_theme not between", value1, value2, "webAnnTheme");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusIsNull() {
            addCriterion("temp_website_announcement.web_ann_status is null");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusIsNotNull() {
            addCriterion("temp_website_announcement.web_ann_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_status =", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusNotEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_status <>", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusGreaterThan(String value) {
            addCriterion("temp_website_announcement.web_ann_status >", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_status >=", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusLessThan(String value) {
            addCriterion("temp_website_announcement.web_ann_status <", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.web_ann_status <=", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusLike(String value) {
            addCriterion("temp_website_announcement.web_ann_status like", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusNotLike(String value) {
            addCriterion("temp_website_announcement.web_ann_status not like", value, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusIn(List<String> values) {
            addCriterion("temp_website_announcement.web_ann_status in", values, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusNotIn(List<String> values) {
            addCriterion("temp_website_announcement.web_ann_status not in", values, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.web_ann_status between", value1, value2, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andWebAnnStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.web_ann_status not between", value1, value2, "webAnnStatus");
            return (Criteria) this;
        }

        public Criteria andClicksIsNull() {
            addCriterion("temp_website_announcement.clicks is null");
            return (Criteria) this;
        }

        public Criteria andClicksIsNotNull() {
            addCriterion("temp_website_announcement.clicks is not null");
            return (Criteria) this;
        }

        public Criteria andClicksEqualTo(Integer value) {
            addCriterion("temp_website_announcement.clicks =", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotEqualTo(Integer value) {
            addCriterion("temp_website_announcement.clicks <>", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThan(Integer value) {
            addCriterion("temp_website_announcement.clicks >", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_announcement.clicks >=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThan(Integer value) {
            addCriterion("temp_website_announcement.clicks <", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_announcement.clicks <=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksIn(List<Integer> values) {
            addCriterion("temp_website_announcement.clicks in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotIn(List<Integer> values) {
            addCriterion("temp_website_announcement.clicks not in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_announcement.clicks between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_announcement.clicks not between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_website_announcement.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_website_announcement.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_website_announcement.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_website_announcement.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_website_announcement.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_website_announcement.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_website_announcement.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_website_announcement.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_website_announcement.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_website_announcement.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumIsNull() {
            addCriterion("temp_website_announcement.web_ann_num is null");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumIsNotNull() {
            addCriterion("temp_website_announcement.web_ann_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumEqualTo(Integer value) {
            addCriterion("temp_website_announcement.web_ann_num =", value, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumNotEqualTo(Integer value) {
            addCriterion("temp_website_announcement.web_ann_num <>", value, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumGreaterThan(Integer value) {
            addCriterion("temp_website_announcement.web_ann_num >", value, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_announcement.web_ann_num >=", value, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumLessThan(Integer value) {
            addCriterion("temp_website_announcement.web_ann_num <", value, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_announcement.web_ann_num <=", value, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumIn(List<Integer> values) {
            addCriterion("temp_website_announcement.web_ann_num in", values, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumNotIn(List<Integer> values) {
            addCriterion("temp_website_announcement.web_ann_num not in", values, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_announcement.web_ann_num between", value1, value2, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andWebAnnNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_announcement.web_ann_num not between", value1, value2, "webAnnNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_announcement.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_announcement.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_announcement.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_announcement.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_announcement.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_announcement.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_announcement.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_announcement.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_announcement.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_announcement.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_announcement.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_announcement.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_announcement.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_announcement.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_announcement.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_announcement.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_announcement.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_announcement.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_announcement.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_announcement.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_announcement.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_announcement.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_announcement.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_announcement.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_announcement.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_announcement.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_announcement.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_announcement.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_announcement.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_announcement.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_announcement.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_announcement.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_announcement.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_announcement.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_announcement.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_announcement.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_announcement.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_announcement.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_announcement.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_announcement.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_announcement.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_announcement.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_announcement.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_announcement.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_announcement.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_announcement.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_announcement.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_announcement.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_announcement.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_announcement.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_announcement.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_announcement.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_announcement.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_announcement.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_announcement.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_announcement.update_time not between", value1, value2, "updateTime");
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