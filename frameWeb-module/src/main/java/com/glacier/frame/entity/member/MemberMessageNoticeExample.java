package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberMessageNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberMessageNoticeExample() {
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

        public Criteria andMessageNoticeIdIsNull() {
            addCriterion("temp_member_message_notice.message_notice_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdIsNotNull() {
            addCriterion("temp_member_message_notice.message_notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdEqualTo(String value) {
            addCriterion("temp_member_message_notice.message_notice_id =", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.message_notice_id <>", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdGreaterThan(String value) {
            addCriterion("temp_member_message_notice.message_notice_id >", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.message_notice_id >=", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdLessThan(String value) {
            addCriterion("temp_member_message_notice.message_notice_id <", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.message_notice_id <=", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdLike(String value) {
            addCriterion("temp_member_message_notice.message_notice_id like", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdNotLike(String value) {
            addCriterion("temp_member_message_notice.message_notice_id not like", value, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdIn(List<String> values) {
            addCriterion("temp_member_message_notice.message_notice_id in", values, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.message_notice_id not in", values, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.message_notice_id between", value1, value2, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andMessageNoticeIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.message_notice_id not between", value1, value2, "messageNoticeId");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("temp_member_message_notice.sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("temp_member_message_notice.sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("temp_member_message_notice.sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("temp_member_message_notice.sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("temp_member_message_notice.sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("temp_member_message_notice.sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("temp_member_message_notice.sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("temp_member_message_notice.sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNull() {
            addCriterion("temp_member_message_notice.addressee is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNotNull() {
            addCriterion("temp_member_message_notice.addressee is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeEqualTo(String value) {
            addCriterion("temp_member_message_notice.addressee =", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.addressee <>", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThan(String value) {
            addCriterion("temp_member_message_notice.addressee >", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.addressee >=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThan(String value) {
            addCriterion("temp_member_message_notice.addressee <", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.addressee <=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLike(String value) {
            addCriterion("temp_member_message_notice.addressee like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotLike(String value) {
            addCriterion("temp_member_message_notice.addressee not like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeIn(List<String> values) {
            addCriterion("temp_member_message_notice.addressee in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.addressee not in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.addressee between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.addressee not between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("temp_member_message_notice.title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("temp_member_message_notice.title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("temp_member_message_notice.title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("temp_member_message_notice.title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("temp_member_message_notice.title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("temp_member_message_notice.title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("temp_member_message_notice.title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("temp_member_message_notice.title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("temp_member_message_notice.content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("temp_member_message_notice.content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("temp_member_message_notice.content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("temp_member_message_notice.content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("temp_member_message_notice.content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("temp_member_message_notice.content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("temp_member_message_notice.content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("temp_member_message_notice.content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("temp_member_message_notice.sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("temp_member_message_notice.sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("temp_member_message_notice.sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("temp_member_message_notice.sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("temp_member_message_notice.sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_message_notice.sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("temp_member_message_notice.sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_message_notice.sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("temp_member_message_notice.sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("temp_member_message_notice.sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_message_notice.sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_message_notice.sendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andLetterstatusIsNull() {
            addCriterion("temp_member_message_notice.letterStatus is null");
            return (Criteria) this;
        }

        public Criteria andLetterstatusIsNotNull() {
            addCriterion("temp_member_message_notice.letterStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLetterstatusEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterStatus =", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterStatus <>", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusGreaterThan(String value) {
            addCriterion("temp_member_message_notice.letterStatus >", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterStatus >=", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusLessThan(String value) {
            addCriterion("temp_member_message_notice.letterStatus <", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterStatus <=", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusLike(String value) {
            addCriterion("temp_member_message_notice.letterStatus like", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusNotLike(String value) {
            addCriterion("temp_member_message_notice.letterStatus not like", value, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusIn(List<String> values) {
            addCriterion("temp_member_message_notice.letterStatus in", values, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.letterStatus not in", values, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.letterStatus between", value1, value2, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLetterstatusNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.letterStatus not between", value1, value2, "letterstatus");
            return (Criteria) this;
        }

        public Criteria andLettertypeIsNull() {
            addCriterion("temp_member_message_notice.letterType is null");
            return (Criteria) this;
        }

        public Criteria andLettertypeIsNotNull() {
            addCriterion("temp_member_message_notice.letterType is not null");
            return (Criteria) this;
        }

        public Criteria andLettertypeEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterType =", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterType <>", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeGreaterThan(String value) {
            addCriterion("temp_member_message_notice.letterType >", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterType >=", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeLessThan(String value) {
            addCriterion("temp_member_message_notice.letterType <", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.letterType <=", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeLike(String value) {
            addCriterion("temp_member_message_notice.letterType like", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeNotLike(String value) {
            addCriterion("temp_member_message_notice.letterType not like", value, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeIn(List<String> values) {
            addCriterion("temp_member_message_notice.letterType in", values, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.letterType not in", values, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.letterType between", value1, value2, "lettertype");
            return (Criteria) this;
        }

        public Criteria andLettertypeNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.letterType not between", value1, value2, "lettertype");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_member_message_notice.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_member_message_notice.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_member_message_notice.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_member_message_notice.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_member_message_notice.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_member_message_notice.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_member_message_notice.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_member_message_notice.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_message_notice.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_message_notice.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_message_notice.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_message_notice.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_message_notice.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_message_notice.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_message_notice.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_message_notice.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member_message_notice.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member_message_notice.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member_message_notice.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_message_notice.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member_message_notice.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_message_notice.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member_message_notice.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_message_notice.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member_message_notice.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_message_notice.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_message_notice.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_message_notice.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_message_notice.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_message_notice.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_message_notice.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_message_notice.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_message_notice.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_message_notice.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_message_notice.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_message_notice.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_message_notice.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_message_notice.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_message_notice.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_message_notice.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_message_notice.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_message_notice.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_message_notice.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_message_notice.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_message_notice.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_message_notice.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_message_notice.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_message_notice.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_message_notice.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_message_notice.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_message_notice.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_message_notice.update_time not between", value1, value2, "updateTime");
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