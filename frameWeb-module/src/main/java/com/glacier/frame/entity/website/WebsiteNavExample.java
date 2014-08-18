package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteNavExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteNavExample() {
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

        public Criteria andWebNavIdIsNull() {
            addCriterion("temp_website_nav.web_nav_id is null");
            return (Criteria) this;
        }

        public Criteria andWebNavIdIsNotNull() {
            addCriterion("temp_website_nav.web_nav_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebNavIdEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_id =", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdNotEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_id <>", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdGreaterThan(String value) {
            addCriterion("temp_website_nav.web_nav_id >", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_id >=", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdLessThan(String value) {
            addCriterion("temp_website_nav.web_nav_id <", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_id <=", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdLike(String value) {
            addCriterion("temp_website_nav.web_nav_id like", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdNotLike(String value) {
            addCriterion("temp_website_nav.web_nav_id not like", value, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_id in", values, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdNotIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_id not in", values, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_id between", value1, value2, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_id not between", value1, value2, "webNavId");
            return (Criteria) this;
        }

        public Criteria andWebNavPidIsNull() {
            addCriterion("temp_website_nav.web_nav_pid is null");
            return (Criteria) this;
        }

        public Criteria andWebNavPidIsNotNull() {
            addCriterion("temp_website_nav.web_nav_pid is not null");
            return (Criteria) this;
        }

        public Criteria andWebNavPidEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_pid =", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidNotEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_pid <>", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidGreaterThan(String value) {
            addCriterion("temp_website_nav.web_nav_pid >", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_pid >=", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidLessThan(String value) {
            addCriterion("temp_website_nav.web_nav_pid <", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_pid <=", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidLike(String value) {
            addCriterion("temp_website_nav.web_nav_pid like", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidNotLike(String value) {
            addCriterion("temp_website_nav.web_nav_pid not like", value, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_pid in", values, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidNotIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_pid not in", values, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_pid between", value1, value2, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavPidNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_pid not between", value1, value2, "webNavPid");
            return (Criteria) this;
        }

        public Criteria andWebNavNameIsNull() {
            addCriterion("temp_website_nav.web_nav_name is null");
            return (Criteria) this;
        }

        public Criteria andWebNavNameIsNotNull() {
            addCriterion("temp_website_nav.web_nav_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebNavNameEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_name =", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameNotEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_name <>", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameGreaterThan(String value) {
            addCriterion("temp_website_nav.web_nav_name >", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_name >=", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameLessThan(String value) {
            addCriterion("temp_website_nav.web_nav_name <", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_name <=", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameLike(String value) {
            addCriterion("temp_website_nav.web_nav_name like", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameNotLike(String value) {
            addCriterion("temp_website_nav.web_nav_name not like", value, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_name in", values, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameNotIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_name not in", values, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_name between", value1, value2, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavNameNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_name not between", value1, value2, "webNavName");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlIsNull() {
            addCriterion("temp_website_nav.web_nav_url is null");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlIsNotNull() {
            addCriterion("temp_website_nav.web_nav_url is not null");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_url =", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlNotEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_url <>", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlGreaterThan(String value) {
            addCriterion("temp_website_nav.web_nav_url >", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_url >=", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlLessThan(String value) {
            addCriterion("temp_website_nav.web_nav_url <", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_url <=", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlLike(String value) {
            addCriterion("temp_website_nav.web_nav_url like", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlNotLike(String value) {
            addCriterion("temp_website_nav.web_nav_url not like", value, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_url in", values, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlNotIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_url not in", values, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_url between", value1, value2, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavUrlNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_url not between", value1, value2, "webNavUrl");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusIsNull() {
            addCriterion("temp_website_nav.web_nav_status is null");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusIsNotNull() {
            addCriterion("temp_website_nav.web_nav_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_status =", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusNotEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_status <>", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusGreaterThan(String value) {
            addCriterion("temp_website_nav.web_nav_status >", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_status >=", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusLessThan(String value) {
            addCriterion("temp_website_nav.web_nav_status <", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.web_nav_status <=", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusLike(String value) {
            addCriterion("temp_website_nav.web_nav_status like", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusNotLike(String value) {
            addCriterion("temp_website_nav.web_nav_status not like", value, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_status in", values, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusNotIn(List<String> values) {
            addCriterion("temp_website_nav.web_nav_status not in", values, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_status between", value1, value2, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.web_nav_status not between", value1, value2, "webNavStatus");
            return (Criteria) this;
        }

        public Criteria andWebNavNumIsNull() {
            addCriterion("temp_website_nav.web_nav_num is null");
            return (Criteria) this;
        }

        public Criteria andWebNavNumIsNotNull() {
            addCriterion("temp_website_nav.web_nav_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebNavNumEqualTo(Integer value) {
            addCriterion("temp_website_nav.web_nav_num =", value, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumNotEqualTo(Integer value) {
            addCriterion("temp_website_nav.web_nav_num <>", value, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumGreaterThan(Integer value) {
            addCriterion("temp_website_nav.web_nav_num >", value, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_nav.web_nav_num >=", value, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumLessThan(Integer value) {
            addCriterion("temp_website_nav.web_nav_num <", value, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_nav.web_nav_num <=", value, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumIn(List<Integer> values) {
            addCriterion("temp_website_nav.web_nav_num in", values, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumNotIn(List<Integer> values) {
            addCriterion("temp_website_nav.web_nav_num not in", values, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_nav.web_nav_num between", value1, value2, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andWebNavNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_nav.web_nav_num not between", value1, value2, "webNavNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_nav.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_nav.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_nav.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_nav.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_nav.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_nav.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_nav.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_nav.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_nav.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_nav.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_nav.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_nav.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_nav.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_nav.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_nav.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_nav.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_nav.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_nav.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_nav.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_nav.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_nav.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_nav.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_nav.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_nav.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_nav.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_nav.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_nav.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_nav.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_nav.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_nav.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_nav.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_nav.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_nav.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_nav.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_nav.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_nav.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_nav.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_nav.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_nav.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_nav.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_nav.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_nav.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_nav.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_nav.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_nav.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_nav.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_nav.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_nav.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_nav.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_nav.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_nav.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_nav.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_nav.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_nav.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_nav.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_nav.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_nav.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_nav.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_nav.update_time not between", value1, value2, "updateTime");
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