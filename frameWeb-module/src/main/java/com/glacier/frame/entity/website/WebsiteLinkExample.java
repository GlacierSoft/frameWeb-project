package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteLinkExample() {
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

        public Criteria andWebLinkIdIsNull() {
            addCriterion("temp_website_link.web_link_id is null");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdIsNotNull() {
            addCriterion("temp_website_link.web_link_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdEqualTo(String value) {
            addCriterion("temp_website_link.web_link_id =", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdNotEqualTo(String value) {
            addCriterion("temp_website_link.web_link_id <>", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdGreaterThan(String value) {
            addCriterion("temp_website_link.web_link_id >", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_id >=", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdLessThan(String value) {
            addCriterion("temp_website_link.web_link_id <", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_id <=", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdLike(String value) {
            addCriterion("temp_website_link.web_link_id like", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdNotLike(String value) {
            addCriterion("temp_website_link.web_link_id not like", value, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdIn(List<String> values) {
            addCriterion("temp_website_link.web_link_id in", values, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdNotIn(List<String> values) {
            addCriterion("temp_website_link.web_link_id not in", values, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_id between", value1, value2, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_id not between", value1, value2, "webLinkId");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameIsNull() {
            addCriterion("temp_website_link.web_link_name is null");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameIsNotNull() {
            addCriterion("temp_website_link.web_link_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameEqualTo(String value) {
            addCriterion("temp_website_link.web_link_name =", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameNotEqualTo(String value) {
            addCriterion("temp_website_link.web_link_name <>", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameGreaterThan(String value) {
            addCriterion("temp_website_link.web_link_name >", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_name >=", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameLessThan(String value) {
            addCriterion("temp_website_link.web_link_name <", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_name <=", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameLike(String value) {
            addCriterion("temp_website_link.web_link_name like", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameNotLike(String value) {
            addCriterion("temp_website_link.web_link_name not like", value, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameIn(List<String> values) {
            addCriterion("temp_website_link.web_link_name in", values, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameNotIn(List<String> values) {
            addCriterion("temp_website_link.web_link_name not in", values, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_name between", value1, value2, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkNameNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_name not between", value1, value2, "webLinkName");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlIsNull() {
            addCriterion("temp_website_link.web_link_url is null");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlIsNotNull() {
            addCriterion("temp_website_link.web_link_url is not null");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlEqualTo(String value) {
            addCriterion("temp_website_link.web_link_url =", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlNotEqualTo(String value) {
            addCriterion("temp_website_link.web_link_url <>", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlGreaterThan(String value) {
            addCriterion("temp_website_link.web_link_url >", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_url >=", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlLessThan(String value) {
            addCriterion("temp_website_link.web_link_url <", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_url <=", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlLike(String value) {
            addCriterion("temp_website_link.web_link_url like", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlNotLike(String value) {
            addCriterion("temp_website_link.web_link_url not like", value, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlIn(List<String> values) {
            addCriterion("temp_website_link.web_link_url in", values, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlNotIn(List<String> values) {
            addCriterion("temp_website_link.web_link_url not in", values, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_url between", value1, value2, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkUrlNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_url not between", value1, value2, "webLinkUrl");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoIsNull() {
            addCriterion("temp_website_link.web_link_photo is null");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoIsNotNull() {
            addCriterion("temp_website_link.web_link_photo is not null");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoEqualTo(String value) {
            addCriterion("temp_website_link.web_link_photo =", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoNotEqualTo(String value) {
            addCriterion("temp_website_link.web_link_photo <>", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoGreaterThan(String value) {
            addCriterion("temp_website_link.web_link_photo >", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_photo >=", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoLessThan(String value) {
            addCriterion("temp_website_link.web_link_photo <", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_photo <=", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoLike(String value) {
            addCriterion("temp_website_link.web_link_photo like", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoNotLike(String value) {
            addCriterion("temp_website_link.web_link_photo not like", value, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoIn(List<String> values) {
            addCriterion("temp_website_link.web_link_photo in", values, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoNotIn(List<String> values) {
            addCriterion("temp_website_link.web_link_photo not in", values, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_photo between", value1, value2, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkPhotoNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_photo not between", value1, value2, "webLinkPhoto");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusIsNull() {
            addCriterion("temp_website_link.web_link_status is null");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusIsNotNull() {
            addCriterion("temp_website_link.web_link_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusEqualTo(String value) {
            addCriterion("temp_website_link.web_link_status =", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusNotEqualTo(String value) {
            addCriterion("temp_website_link.web_link_status <>", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusGreaterThan(String value) {
            addCriterion("temp_website_link.web_link_status >", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_status >=", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusLessThan(String value) {
            addCriterion("temp_website_link.web_link_status <", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.web_link_status <=", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusLike(String value) {
            addCriterion("temp_website_link.web_link_status like", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusNotLike(String value) {
            addCriterion("temp_website_link.web_link_status not like", value, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusIn(List<String> values) {
            addCriterion("temp_website_link.web_link_status in", values, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusNotIn(List<String> values) {
            addCriterion("temp_website_link.web_link_status not in", values, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_status between", value1, value2, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andWebLinkStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.web_link_status not between", value1, value2, "webLinkStatus");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_website_link.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_website_link.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_website_link.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_website_link.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_website_link.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_website_link.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_website_link.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_website_link.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_website_link.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_website_link.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_website_link.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumIsNull() {
            addCriterion("temp_website_link.web_link_num is null");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumIsNotNull() {
            addCriterion("temp_website_link.web_link_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumEqualTo(Integer value) {
            addCriterion("temp_website_link.web_link_num =", value, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumNotEqualTo(Integer value) {
            addCriterion("temp_website_link.web_link_num <>", value, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumGreaterThan(Integer value) {
            addCriterion("temp_website_link.web_link_num >", value, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_link.web_link_num >=", value, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumLessThan(Integer value) {
            addCriterion("temp_website_link.web_link_num <", value, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_link.web_link_num <=", value, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumIn(List<Integer> values) {
            addCriterion("temp_website_link.web_link_num in", values, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumNotIn(List<Integer> values) {
            addCriterion("temp_website_link.web_link_num not in", values, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_link.web_link_num between", value1, value2, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andWebLinkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_link.web_link_num not between", value1, value2, "webLinkNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_link.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_link.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_link.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_link.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_link.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_link.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_link.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_link.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_link.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_link.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_link.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_link.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_link.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_link.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_link.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_link.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_link.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_link.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_link.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_link.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_link.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_link.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_link.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_link.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_link.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_link.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_link.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_link.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_link.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_link.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_link.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_link.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_link.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_link.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_link.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_link.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_link.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_link.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_link.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_link.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_link.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_link.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_link.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_link.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_link.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_link.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_link.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_link.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_link.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_link.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_link.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_link.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_link.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_link.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_link.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_link.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_link.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_link.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_link.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_link.update_time not between", value1, value2, "updateTime");
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