package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberSecretSecurityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberSecretSecurityExample() {
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

        
        
        //扩展查询条件
        public Criteria andMemberRealNameLike(String value) {
            addCriterion("temp_member.member_real_name like", value, "memberRealName");
            return (Criteria) this;
        }
        
        public Criteria andSecretSecurityIdIsNull() {
            addCriterion("temp_member_secret_security.secret_security_id is null");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdIsNotNull() {
            addCriterion("temp_member_secret_security.secret_security_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdEqualTo(String value) {
            addCriterion("temp_member_secret_security.secret_security_id =", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdNotEqualTo(String value) {
            addCriterion("temp_member_secret_security.secret_security_id <>", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdGreaterThan(String value) {
            addCriterion("temp_member_secret_security.secret_security_id >", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.secret_security_id >=", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdLessThan(String value) {
            addCriterion("temp_member_secret_security.secret_security_id <", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.secret_security_id <=", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdLike(String value) {
            addCriterion("temp_member_secret_security.secret_security_id like", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdNotLike(String value) {
            addCriterion("temp_member_secret_security.secret_security_id not like", value, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdIn(List<String> values) {
            addCriterion("temp_member_secret_security.secret_security_id in", values, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdNotIn(List<String> values) {
            addCriterion("temp_member_secret_security.secret_security_id not in", values, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.secret_security_id between", value1, value2, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andSecretSecurityIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.secret_security_id not between", value1, value2, "secretSecurityId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("temp_member_secret_security.question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("temp_member_secret_security.question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(String value) {
            addCriterion("temp_member_secret_security.question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(String value) {
            addCriterion("temp_member_secret_security.question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(String value) {
            addCriterion("temp_member_secret_security.question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(String value) {
            addCriterion("temp_member_secret_security.question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLike(String value) {
            addCriterion("temp_member_secret_security.question_id like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotLike(String value) {
            addCriterion("temp_member_secret_security.question_id not like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<String> values) {
            addCriterion("temp_member_secret_security.question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<String> values) {
            addCriterion("temp_member_secret_security.question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_secret_security.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_secret_security.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_secret_security.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_secret_security.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_secret_security.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_secret_security.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_secret_security.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_secret_security.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_secret_security.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_secret_security.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("temp_member_secret_security.answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("temp_member_secret_security.answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("temp_member_secret_security.answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("temp_member_secret_security.answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("temp_member_secret_security.answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("temp_member_secret_security.answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("temp_member_secret_security.answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("temp_member_secret_security.answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("temp_member_secret_security.answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("temp_member_secret_security.answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_member_secret_security.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_member_secret_security.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_member_secret_security.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_member_secret_security.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_member_secret_security.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_member_secret_security.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_member_secret_security.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_member_secret_security.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_member_secret_security.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_member_secret_security.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_secret_security.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_secret_security.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_secret_security.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_secret_security.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_secret_security.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_secret_security.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_secret_security.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_secret_security.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_secret_security.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_secret_security.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member_secret_security.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member_secret_security.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member_secret_security.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_secret_security.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member_secret_security.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_secret_security.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member_secret_security.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_secret_security.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member_secret_security.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_secret_security.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_secret_security.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_secret_security.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_secret_security.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_secret_security.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_secret_security.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_secret_security.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_secret_security.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_secret_security.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_secret_security.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_secret_security.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_secret_security.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_secret_security.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_secret_security.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_secret_security.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_secret_security.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_secret_security.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_secret_security.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_secret_security.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_secret_security.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_secret_security.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_secret_security.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_secret_security.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_secret_security.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_secret_security.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_secret_security.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_secret_security.update_time not between", value1, value2, "updateTime");
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