package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.List;

public class MemberWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberWorkExample() {
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
            addCriterion("temp_member_work.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_work.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_work.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_work.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_work.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_work.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_work.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_work.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_work.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_work.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_work.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_work.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_work.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_work.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("temp_member_work.unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("temp_member_work.unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("temp_member_work.unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("temp_member_work.unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("temp_member_work.unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_work.unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("temp_member_work.unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("temp_member_work.unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("temp_member_work.unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("temp_member_work.unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("temp_member_work.unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("temp_member_work.unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("temp_member_work.unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("temp_member_work.unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIsNull() {
            addCriterion("temp_member_work.unit_phone is null");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIsNotNull() {
            addCriterion("temp_member_work.unit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneEqualTo(String value) {
            addCriterion("temp_member_work.unit_phone =", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotEqualTo(String value) {
            addCriterion("temp_member_work.unit_phone <>", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneGreaterThan(String value) {
            addCriterion("temp_member_work.unit_phone >", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_work.unit_phone >=", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLessThan(String value) {
            addCriterion("temp_member_work.unit_phone <", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member_work.unit_phone <=", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLike(String value) {
            addCriterion("temp_member_work.unit_phone like", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotLike(String value) {
            addCriterion("temp_member_work.unit_phone not like", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIn(List<String> values) {
            addCriterion("temp_member_work.unit_phone in", values, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotIn(List<String> values) {
            addCriterion("temp_member_work.unit_phone not in", values, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneBetween(String value1, String value2) {
            addCriterion("temp_member_work.unit_phone between", value1, value2, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member_work.unit_phone not between", value1, value2, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitAdressIsNull() {
            addCriterion("temp_member_work.unit_adress is null");
            return (Criteria) this;
        }

        public Criteria andUnitAdressIsNotNull() {
            addCriterion("temp_member_work.unit_adress is not null");
            return (Criteria) this;
        }

        public Criteria andUnitAdressEqualTo(String value) {
            addCriterion("temp_member_work.unit_adress =", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotEqualTo(String value) {
            addCriterion("temp_member_work.unit_adress <>", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressGreaterThan(String value) {
            addCriterion("temp_member_work.unit_adress >", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_work.unit_adress >=", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressLessThan(String value) {
            addCriterion("temp_member_work.unit_adress <", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressLessThanOrEqualTo(String value) {
            addCriterion("temp_member_work.unit_adress <=", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressLike(String value) {
            addCriterion("temp_member_work.unit_adress like", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotLike(String value) {
            addCriterion("temp_member_work.unit_adress not like", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressIn(List<String> values) {
            addCriterion("temp_member_work.unit_adress in", values, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotIn(List<String> values) {
            addCriterion("temp_member_work.unit_adress not in", values, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressBetween(String value1, String value2) {
            addCriterion("temp_member_work.unit_adress between", value1, value2, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotBetween(String value1, String value2) {
            addCriterion("temp_member_work.unit_adress not between", value1, value2, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIsNull() {
            addCriterion("temp_member_work.work_age is null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIsNotNull() {
            addCriterion("temp_member_work.work_age is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeEqualTo(Integer value) {
            addCriterion("temp_member_work.work_age =", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotEqualTo(Integer value) {
            addCriterion("temp_member_work.work_age <>", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeGreaterThan(Integer value) {
            addCriterion("temp_member_work.work_age >", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_work.work_age >=", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeLessThan(Integer value) {
            addCriterion("temp_member_work.work_age <", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_work.work_age <=", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIn(List<Integer> values) {
            addCriterion("temp_member_work.work_age in", values, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotIn(List<Integer> values) {
            addCriterion("temp_member_work.work_age not in", values, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_work.work_age between", value1, value2, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_work.work_age not between", value1, value2, "workAge");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("temp_member_work.salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("temp_member_work.salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Float value) {
            addCriterion("temp_member_work.salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Float value) {
            addCriterion("temp_member_work.salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Float value) {
            addCriterion("temp_member_work.salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_work.salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Float value) {
            addCriterion("temp_member_work.salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_work.salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Float> values) {
            addCriterion("temp_member_work.salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Float> values) {
            addCriterion("temp_member_work.salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Float value1, Float value2) {
            addCriterion("temp_member_work.salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_work.salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andProofPersonIsNull() {
            addCriterion("temp_member_work.proof_person is null");
            return (Criteria) this;
        }

        public Criteria andProofPersonIsNotNull() {
            addCriterion("temp_member_work.proof_person is not null");
            return (Criteria) this;
        }

        public Criteria andProofPersonEqualTo(String value) {
            addCriterion("temp_member_work.proof_person =", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotEqualTo(String value) {
            addCriterion("temp_member_work.proof_person <>", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonGreaterThan(String value) {
            addCriterion("temp_member_work.proof_person >", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_work.proof_person >=", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonLessThan(String value) {
            addCriterion("temp_member_work.proof_person <", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonLessThanOrEqualTo(String value) {
            addCriterion("temp_member_work.proof_person <=", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonLike(String value) {
            addCriterion("temp_member_work.proof_person like", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotLike(String value) {
            addCriterion("temp_member_work.proof_person not like", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonIn(List<String> values) {
            addCriterion("temp_member_work.proof_person in", values, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotIn(List<String> values) {
            addCriterion("temp_member_work.proof_person not in", values, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonBetween(String value1, String value2) {
            addCriterion("temp_member_work.proof_person between", value1, value2, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotBetween(String value1, String value2) {
            addCriterion("temp_member_work.proof_person not between", value1, value2, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPhoneIsNull() {
            addCriterion("temp_member_work.proof_phone is null");
            return (Criteria) this;
        }

        public Criteria andProofPhoneIsNotNull() {
            addCriterion("temp_member_work.proof_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProofPhoneEqualTo(String value) {
            addCriterion("temp_member_work.proof_phone =", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneNotEqualTo(String value) {
            addCriterion("temp_member_work.proof_phone <>", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneGreaterThan(String value) {
            addCriterion("temp_member_work.proof_phone >", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_work.proof_phone >=", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneLessThan(String value) {
            addCriterion("temp_member_work.proof_phone <", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member_work.proof_phone <=", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneLike(String value) {
            addCriterion("temp_member_work.proof_phone like", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneNotLike(String value) {
            addCriterion("temp_member_work.proof_phone not like", value, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneIn(List<String> values) {
            addCriterion("temp_member_work.proof_phone in", values, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneNotIn(List<String> values) {
            addCriterion("temp_member_work.proof_phone not in", values, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneBetween(String value1, String value2) {
            addCriterion("temp_member_work.proof_phone between", value1, value2, "proofPhone");
            return (Criteria) this;
        }

        public Criteria andProofPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member_work.proof_phone not between", value1, value2, "proofPhone");
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