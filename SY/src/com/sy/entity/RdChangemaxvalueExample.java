package com.sy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RdChangemaxvalueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RdChangemaxvalueExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateeIsNull() {
            addCriterion("datee is null");
            return (Criteria) this;
        }

        public Criteria andDateeIsNotNull() {
            addCriterion("datee is not null");
            return (Criteria) this;
        }

        public Criteria andDateeEqualTo(Date value) {
            addCriterion("datee =", value, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeNotEqualTo(Date value) {
            addCriterion("datee <>", value, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeGreaterThan(Date value) {
            addCriterion("datee >", value, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeGreaterThanOrEqualTo(Date value) {
            addCriterion("datee >=", value, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeLessThan(Date value) {
            addCriterion("datee <", value, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeLessThanOrEqualTo(Date value) {
            addCriterion("datee <=", value, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeIn(List<Date> values) {
            addCriterion("datee in", values, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeNotIn(List<Date> values) {
            addCriterion("datee not in", values, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeBetween(Date value1, Date value2) {
            addCriterion("datee between", value1, value2, "datee");
            return (Criteria) this;
        }

        public Criteria andDateeNotBetween(Date value1, Date value2) {
            addCriterion("datee not between", value1, value2, "datee");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoIsNull() {
            addCriterion("meter_no is null");
            return (Criteria) this;
        }

        public Criteria andMeterNoIsNotNull() {
            addCriterion("meter_no is not null");
            return (Criteria) this;
        }

        public Criteria andMeterNoEqualTo(String value) {
            addCriterion("meter_no =", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotEqualTo(String value) {
            addCriterion("meter_no <>", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoGreaterThan(String value) {
            addCriterion("meter_no >", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoGreaterThanOrEqualTo(String value) {
            addCriterion("meter_no >=", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoLessThan(String value) {
            addCriterion("meter_no <", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoLessThanOrEqualTo(String value) {
            addCriterion("meter_no <=", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoLike(String value) {
            addCriterion("meter_no like", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotLike(String value) {
            addCriterion("meter_no not like", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoIn(List<String> values) {
            addCriterion("meter_no in", values, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotIn(List<String> values) {
            addCriterion("meter_no not in", values, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoBetween(String value1, String value2) {
            addCriterion("meter_no between", value1, value2, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotBetween(String value1, String value2) {
            addCriterion("meter_no not between", value1, value2, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMaxValue1IsNull() {
            addCriterion("max_value1 is null");
            return (Criteria) this;
        }

        public Criteria andMaxValue1IsNotNull() {
            addCriterion("max_value1 is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValue1EqualTo(Integer value) {
            addCriterion("max_value1 =", value, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1NotEqualTo(Integer value) {
            addCriterion("max_value1 <>", value, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1GreaterThan(Integer value) {
            addCriterion("max_value1 >", value, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1GreaterThanOrEqualTo(Integer value) {
            addCriterion("max_value1 >=", value, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1LessThan(Integer value) {
            addCriterion("max_value1 <", value, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1LessThanOrEqualTo(Integer value) {
            addCriterion("max_value1 <=", value, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1In(List<Integer> values) {
            addCriterion("max_value1 in", values, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1NotIn(List<Integer> values) {
            addCriterion("max_value1 not in", values, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1Between(Integer value1, Integer value2) {
            addCriterion("max_value1 between", value1, value2, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue1NotBetween(Integer value1, Integer value2) {
            addCriterion("max_value1 not between", value1, value2, "maxValue1");
            return (Criteria) this;
        }

        public Criteria andMaxValue2IsNull() {
            addCriterion("max_value2 is null");
            return (Criteria) this;
        }

        public Criteria andMaxValue2IsNotNull() {
            addCriterion("max_value2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValue2EqualTo(Integer value) {
            addCriterion("max_value2 =", value, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2NotEqualTo(Integer value) {
            addCriterion("max_value2 <>", value, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2GreaterThan(Integer value) {
            addCriterion("max_value2 >", value, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2GreaterThanOrEqualTo(Integer value) {
            addCriterion("max_value2 >=", value, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2LessThan(Integer value) {
            addCriterion("max_value2 <", value, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2LessThanOrEqualTo(Integer value) {
            addCriterion("max_value2 <=", value, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2In(List<Integer> values) {
            addCriterion("max_value2 in", values, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2NotIn(List<Integer> values) {
            addCriterion("max_value2 not in", values, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2Between(Integer value1, Integer value2) {
            addCriterion("max_value2 between", value1, value2, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andMaxValue2NotBetween(Integer value1, Integer value2) {
            addCriterion("max_value2 not between", value1, value2, "maxValue2");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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