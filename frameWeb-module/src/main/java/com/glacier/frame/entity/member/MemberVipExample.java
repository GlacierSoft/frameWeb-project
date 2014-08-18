package com.glacier.frame.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberVipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberVipExample() {
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

        public Criteria andVipIdIsNull() {
            addCriterion("temp_member_vip.vip_id is null");
            return (Criteria) this;
        }

        public Criteria andVipIdIsNotNull() {
            addCriterion("temp_member_vip.vip_id is not null");
            return (Criteria) this;
        }

        public Criteria andVipIdEqualTo(String value) {
            addCriterion("temp_member_vip.vip_id =", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotEqualTo(String value) {
            addCriterion("temp_member_vip.vip_id <>", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThan(String value) {
            addCriterion("temp_member_vip.vip_id >", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.vip_id >=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThan(String value) {
            addCriterion("temp_member_vip.vip_id <", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.vip_id <=", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdLike(String value) {
            addCriterion("temp_member_vip.vip_id like", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotLike(String value) {
            addCriterion("temp_member_vip.vip_id not like", value, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdIn(List<String> values) {
            addCriterion("temp_member_vip.vip_id in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotIn(List<String> values) {
            addCriterion("temp_member_vip.vip_id not in", values, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdBetween(String value1, String value2) {
            addCriterion("temp_member_vip.vip_id between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andVipIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_vip.vip_id not between", value1, value2, "vipId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_vip.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_vip.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_vip.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_vip.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_vip.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_vip.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_vip.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_vip.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_vip.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_vip.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_vip.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_vip.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("temp_member_vip.vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("temp_member_vip.vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(String value) {
            addCriterion("temp_member_vip.vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(String value) {
            addCriterion("temp_member_vip.vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(String value) {
            addCriterion("temp_member_vip.vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(String value) {
            addCriterion("temp_member_vip.vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLike(String value) {
            addCriterion("temp_member_vip.vip_level like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotLike(String value) {
            addCriterion("temp_member_vip.vip_level not like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<String> values) {
            addCriterion("temp_member_vip.vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<String> values) {
            addCriterion("temp_member_vip.vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(String value1, String value2) {
            addCriterion("temp_member_vip.vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(String value1, String value2) {
            addCriterion("temp_member_vip.vip_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipIntegralIsNull() {
            addCriterion("temp_member_vip.vip_integral is null");
            return (Criteria) this;
        }

        public Criteria andVipIntegralIsNotNull() {
            addCriterion("temp_member_vip.vip_integral is not null");
            return (Criteria) this;
        }

        public Criteria andVipIntegralEqualTo(Integer value) {
            addCriterion("temp_member_vip.vip_integral =", value, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralNotEqualTo(Integer value) {
            addCriterion("temp_member_vip.vip_integral <>", value, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralGreaterThan(Integer value) {
            addCriterion("temp_member_vip.vip_integral >", value, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_vip.vip_integral >=", value, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralLessThan(Integer value) {
            addCriterion("temp_member_vip.vip_integral <", value, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_vip.vip_integral <=", value, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralIn(List<Integer> values) {
            addCriterion("temp_member_vip.vip_integral in", values, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralNotIn(List<Integer> values) {
            addCriterion("temp_member_vip.vip_integral not in", values, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_vip.vip_integral between", value1, value2, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_vip.vip_integral not between", value1, value2, "vipIntegral");
            return (Criteria) this;
        }

        public Criteria andVipStartIsNull() {
            addCriterion("temp_member_vip.vip_start is null");
            return (Criteria) this;
        }

        public Criteria andVipStartIsNotNull() {
            addCriterion("temp_member_vip.vip_start is not null");
            return (Criteria) this;
        }

        public Criteria andVipStartEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_start =", value, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartNotEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_start <>", value, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartGreaterThan(Date value) {
            addCriterion("temp_member_vip.vip_start >", value, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_start >=", value, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartLessThan(Date value) {
            addCriterion("temp_member_vip.vip_start <", value, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_start <=", value, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartIn(List<Date> values) {
            addCriterion("temp_member_vip.vip_start in", values, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartNotIn(List<Date> values) {
            addCriterion("temp_member_vip.vip_start not in", values, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.vip_start between", value1, value2, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipStartNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.vip_start not between", value1, value2, "vipStart");
            return (Criteria) this;
        }

        public Criteria andVipEndIsNull() {
            addCriterion("temp_member_vip.vip_end is null");
            return (Criteria) this;
        }

        public Criteria andVipEndIsNotNull() {
            addCriterion("temp_member_vip.vip_end is not null");
            return (Criteria) this;
        }

        public Criteria andVipEndEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_end =", value, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndNotEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_end <>", value, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndGreaterThan(Date value) {
            addCriterion("temp_member_vip.vip_end >", value, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_end >=", value, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndLessThan(Date value) {
            addCriterion("temp_member_vip.vip_end <", value, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.vip_end <=", value, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndIn(List<Date> values) {
            addCriterion("temp_member_vip.vip_end in", values, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndNotIn(List<Date> values) {
            addCriterion("temp_member_vip.vip_end not in", values, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.vip_end between", value1, value2, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andVipEndNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.vip_end not between", value1, value2, "vipEnd");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_vip.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_vip.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_vip.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_vip.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_vip.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_vip.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_vip.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_vip.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_vip.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_vip.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_vip.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_vip.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member_vip.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member_vip.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member_vip.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_vip.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member_vip.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member_vip.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member_vip.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_vip.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_vip.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_vip.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_vip.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_vip.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_vip.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_vip.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_vip.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_vip.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_vip.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_vip.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_vip.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_vip.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_vip.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_vip.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_vip.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_vip.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_vip.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_vip.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_vip.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_vip.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_vip.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_vip.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_vip.update_time not between", value1, value2, "updateTime");
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