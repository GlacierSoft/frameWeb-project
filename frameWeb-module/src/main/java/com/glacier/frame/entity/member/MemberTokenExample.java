package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.List;

public class MemberTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberTokenExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_token.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_token.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_token.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_token.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_token.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_token.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_token.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_token.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_token.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_token.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_token.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_token.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_token.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_token.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("temp_member_token.username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("temp_member_token.username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("temp_member_token.username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("temp_member_token.username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("temp_member_token.username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_token.username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("temp_member_token.username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("temp_member_token.username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("temp_member_token.username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("temp_member_token.username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("temp_member_token.username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("temp_member_token.username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("temp_member_token.username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("temp_member_token.username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("temp_member_token.password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("temp_member_token.password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("temp_member_token.password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("temp_member_token.password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("temp_member_token.password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_token.password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("temp_member_token.password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("temp_member_token.password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("temp_member_token.password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("temp_member_token.password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("temp_member_token.password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("temp_member_token.password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("temp_member_token.password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("temp_member_token.password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("temp_member_token.salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("temp_member_token.salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("temp_member_token.salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("temp_member_token.salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("temp_member_token.salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_token.salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("temp_member_token.salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("temp_member_token.salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("temp_member_token.salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("temp_member_token.salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("temp_member_token.salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("temp_member_token.salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("temp_member_token.salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("temp_member_token.salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordIsNull() {
            addCriterion("temp_member_token.traters_password is null");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordIsNotNull() {
            addCriterion("temp_member_token.traters_password is not null");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordEqualTo(String value) {
            addCriterion("temp_member_token.traters_password =", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordNotEqualTo(String value) {
            addCriterion("temp_member_token.traters_password <>", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordGreaterThan(String value) {
            addCriterion("temp_member_token.traters_password >", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_token.traters_password >=", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordLessThan(String value) {
            addCriterion("temp_member_token.traters_password <", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordLessThanOrEqualTo(String value) {
            addCriterion("temp_member_token.traters_password <=", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordLike(String value) {
            addCriterion("temp_member_token.traters_password like", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordNotLike(String value) {
            addCriterion("temp_member_token.traters_password not like", value, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordIn(List<String> values) {
            addCriterion("temp_member_token.traters_password in", values, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordNotIn(List<String> values) {
            addCriterion("temp_member_token.traters_password not in", values, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordBetween(String value1, String value2) {
            addCriterion("temp_member_token.traters_password between", value1, value2, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTratersPasswordNotBetween(String value1, String value2) {
            addCriterion("temp_member_token.traters_password not between", value1, value2, "tratersPassword");
            return (Criteria) this;
        }

        public Criteria andTradersSaltIsNull() {
            addCriterion("temp_member_token.traders_salt is null");
            return (Criteria) this;
        }

        public Criteria andTradersSaltIsNotNull() {
            addCriterion("temp_member_token.traders_salt is not null");
            return (Criteria) this;
        }

        public Criteria andTradersSaltEqualTo(String value) {
            addCriterion("temp_member_token.traders_salt =", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltNotEqualTo(String value) {
            addCriterion("temp_member_token.traders_salt <>", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltGreaterThan(String value) {
            addCriterion("temp_member_token.traders_salt >", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_token.traders_salt >=", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltLessThan(String value) {
            addCriterion("temp_member_token.traders_salt <", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltLessThanOrEqualTo(String value) {
            addCriterion("temp_member_token.traders_salt <=", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltLike(String value) {
            addCriterion("temp_member_token.traders_salt like", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltNotLike(String value) {
            addCriterion("temp_member_token.traders_salt not like", value, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltIn(List<String> values) {
            addCriterion("temp_member_token.traders_salt in", values, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltNotIn(List<String> values) {
            addCriterion("temp_member_token.traders_salt not in", values, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltBetween(String value1, String value2) {
            addCriterion("temp_member_token.traders_salt between", value1, value2, "tradersSalt");
            return (Criteria) this;
        }

        public Criteria andTradersSaltNotBetween(String value1, String value2) {
            addCriterion("temp_member_token.traders_salt not between", value1, value2, "tradersSalt");
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