package com.glacier.frame.entity.website;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WebsiteServiceExample() {
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

        public Criteria andWebServiceIdIsNull() {
            addCriterion("temp_website_service.web_service_id is null");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdIsNotNull() {
            addCriterion("temp_website_service.web_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdEqualTo(String value) {
            addCriterion("temp_website_service.web_service_id =", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdNotEqualTo(String value) {
            addCriterion("temp_website_service.web_service_id <>", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdGreaterThan(String value) {
            addCriterion("temp_website_service.web_service_id >", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_id >=", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdLessThan(String value) {
            addCriterion("temp_website_service.web_service_id <", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_id <=", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdLike(String value) {
            addCriterion("temp_website_service.web_service_id like", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdNotLike(String value) {
            addCriterion("temp_website_service.web_service_id not like", value, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdIn(List<String> values) {
            addCriterion("temp_website_service.web_service_id in", values, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdNotIn(List<String> values) {
            addCriterion("temp_website_service.web_service_id not in", values, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_id between", value1, value2, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceIdNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_id not between", value1, value2, "webServiceId");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameIsNull() {
            addCriterion("temp_website_service.web_service_name is null");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameIsNotNull() {
            addCriterion("temp_website_service.web_service_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameEqualTo(String value) {
            addCriterion("temp_website_service.web_service_name =", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameNotEqualTo(String value) {
            addCriterion("temp_website_service.web_service_name <>", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameGreaterThan(String value) {
            addCriterion("temp_website_service.web_service_name >", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_name >=", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameLessThan(String value) {
            addCriterion("temp_website_service.web_service_name <", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_name <=", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameLike(String value) {
            addCriterion("temp_website_service.web_service_name like", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameNotLike(String value) {
            addCriterion("temp_website_service.web_service_name not like", value, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameIn(List<String> values) {
            addCriterion("temp_website_service.web_service_name in", values, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameNotIn(List<String> values) {
            addCriterion("temp_website_service.web_service_name not in", values, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_name between", value1, value2, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceNameNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_name not between", value1, value2, "webServiceName");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqIsNull() {
            addCriterion("temp_website_service.web_service_qq is null");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqIsNotNull() {
            addCriterion("temp_website_service.web_service_qq is not null");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqEqualTo(String value) {
            addCriterion("temp_website_service.web_service_qq =", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqNotEqualTo(String value) {
            addCriterion("temp_website_service.web_service_qq <>", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqGreaterThan(String value) {
            addCriterion("temp_website_service.web_service_qq >", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_qq >=", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqLessThan(String value) {
            addCriterion("temp_website_service.web_service_qq <", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_qq <=", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqLike(String value) {
            addCriterion("temp_website_service.web_service_qq like", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqNotLike(String value) {
            addCriterion("temp_website_service.web_service_qq not like", value, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqIn(List<String> values) {
            addCriterion("temp_website_service.web_service_qq in", values, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqNotIn(List<String> values) {
            addCriterion("temp_website_service.web_service_qq not in", values, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_qq between", value1, value2, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServiceQqNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_qq not between", value1, value2, "webServiceQq");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoIsNull() {
            addCriterion("temp_website_service.web_service_photo is null");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoIsNotNull() {
            addCriterion("temp_website_service.web_service_photo is not null");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoEqualTo(String value) {
            addCriterion("temp_website_service.web_service_photo =", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoNotEqualTo(String value) {
            addCriterion("temp_website_service.web_service_photo <>", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoGreaterThan(String value) {
            addCriterion("temp_website_service.web_service_photo >", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_photo >=", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoLessThan(String value) {
            addCriterion("temp_website_service.web_service_photo <", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_photo <=", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoLike(String value) {
            addCriterion("temp_website_service.web_service_photo like", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoNotLike(String value) {
            addCriterion("temp_website_service.web_service_photo not like", value, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoIn(List<String> values) {
            addCriterion("temp_website_service.web_service_photo in", values, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoNotIn(List<String> values) {
            addCriterion("temp_website_service.web_service_photo not in", values, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_photo between", value1, value2, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServicePhotoNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_photo not between", value1, value2, "webServicePhoto");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusIsNull() {
            addCriterion("temp_website_service.web_service_status is null");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusIsNotNull() {
            addCriterion("temp_website_service.web_service_status is not null");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusEqualTo(String value) {
            addCriterion("temp_website_service.web_service_status =", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusNotEqualTo(String value) {
            addCriterion("temp_website_service.web_service_status <>", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusGreaterThan(String value) {
            addCriterion("temp_website_service.web_service_status >", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_status >=", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusLessThan(String value) {
            addCriterion("temp_website_service.web_service_status <", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.web_service_status <=", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusLike(String value) {
            addCriterion("temp_website_service.web_service_status like", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusNotLike(String value) {
            addCriterion("temp_website_service.web_service_status not like", value, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusIn(List<String> values) {
            addCriterion("temp_website_service.web_service_status in", values, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusNotIn(List<String> values) {
            addCriterion("temp_website_service.web_service_status not in", values, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_status between", value1, value2, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andWebServiceStatusNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.web_service_status not between", value1, value2, "webServiceStatus");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_website_service.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_website_service.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_website_service.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_website_service.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_website_service.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_website_service.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_website_service.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_website_service.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_website_service.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_website_service.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_website_service.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumIsNull() {
            addCriterion("temp_website_service.web_service_num is null");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumIsNotNull() {
            addCriterion("temp_website_service.web_service_num is not null");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumEqualTo(Integer value) {
            addCriterion("temp_website_service.web_service_num =", value, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumNotEqualTo(Integer value) {
            addCriterion("temp_website_service.web_service_num <>", value, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumGreaterThan(Integer value) {
            addCriterion("temp_website_service.web_service_num >", value, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_website_service.web_service_num >=", value, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumLessThan(Integer value) {
            addCriterion("temp_website_service.web_service_num <", value, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_website_service.web_service_num <=", value, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumIn(List<Integer> values) {
            addCriterion("temp_website_service.web_service_num in", values, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumNotIn(List<Integer> values) {
            addCriterion("temp_website_service.web_service_num not in", values, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_service.web_service_num between", value1, value2, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andWebServiceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_website_service.web_service_num not between", value1, value2, "webServiceNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_website_service.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_website_service.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_website_service.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_website_service.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_website_service.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_website_service.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_website_service.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_website_service.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_website_service.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_website_service.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_website_service.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_website_service.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_website_service.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_website_service.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_website_service.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_website_service.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_website_service.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_website_service.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_website_service.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_website_service.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_website_service.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_website_service.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_website_service.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_website_service.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_website_service.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_service.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_website_service.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_service.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_website_service.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_service.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_website_service.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_service.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_service.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_service.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_website_service.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_website_service.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_website_service.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_website_service.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_website_service.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_website_service.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_website_service.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_website_service.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_website_service.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_website_service.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_website_service.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_website_service.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_website_service.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_website_service.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_website_service.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_website_service.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_website_service.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_website_service.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_website_service.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_website_service.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_website_service.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_website_service.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_website_service.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_website_service.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_website_service.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_website_service.update_time not between", value1, value2, "updateTime");
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