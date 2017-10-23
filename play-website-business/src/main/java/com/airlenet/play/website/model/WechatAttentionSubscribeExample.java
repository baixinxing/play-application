package com.airlenet.play.website.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WechatAttentionSubscribeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public WechatAttentionSubscribeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     *
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNull() {
            addCriterion("subscribeTime is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNotNull() {
            addCriterion("subscribeTime is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeEqualTo(Date value) {
            addCriterion("subscribeTime =", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotEqualTo(Date value) {
            addCriterion("subscribeTime <>", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThan(Date value) {
            addCriterion("subscribeTime >", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("subscribeTime >=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThan(Date value) {
            addCriterion("subscribeTime <", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThanOrEqualTo(Date value) {
            addCriterion("subscribeTime <=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIn(List<Date> values) {
            addCriterion("subscribeTime in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotIn(List<Date> values) {
            addCriterion("subscribeTime not in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeBetween(Date value1, Date value2) {
            addCriterion("subscribeTime between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotBetween(Date value1, Date value2) {
            addCriterion("subscribeTime not between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andAttention_uidIsNull() {
            addCriterion("attention_uid is null");
            return (Criteria) this;
        }

        public Criteria andAttention_uidIsNotNull() {
            addCriterion("attention_uid is not null");
            return (Criteria) this;
        }

        public Criteria andAttention_uidEqualTo(Long value) {
            addCriterion("attention_uid =", value, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidNotEqualTo(Long value) {
            addCriterion("attention_uid <>", value, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidGreaterThan(Long value) {
            addCriterion("attention_uid >", value, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidGreaterThanOrEqualTo(Long value) {
            addCriterion("attention_uid >=", value, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidLessThan(Long value) {
            addCriterion("attention_uid <", value, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidLessThanOrEqualTo(Long value) {
            addCriterion("attention_uid <=", value, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidIn(List<Long> values) {
            addCriterion("attention_uid in", values, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidNotIn(List<Long> values) {
            addCriterion("attention_uid not in", values, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidBetween(Long value1, Long value2) {
            addCriterion("attention_uid between", value1, value2, "attention_uid");
            return (Criteria) this;
        }

        public Criteria andAttention_uidNotBetween(Long value1, Long value2) {
            addCriterion("attention_uid not between", value1, value2, "attention_uid");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     */
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