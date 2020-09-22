package com.kgc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPetidIsNull() {
            addCriterion("petid is null");
            return (Criteria) this;
        }

        public Criteria andPetidIsNotNull() {
            addCriterion("petid is not null");
            return (Criteria) this;
        }

        public Criteria andPetidEqualTo(Long value) {
            addCriterion("petid =", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotEqualTo(Long value) {
            addCriterion("petid <>", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThan(Long value) {
            addCriterion("petid >", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThanOrEqualTo(Long value) {
            addCriterion("petid >=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThan(Long value) {
            addCriterion("petid <", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThanOrEqualTo(Long value) {
            addCriterion("petid <=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidIn(List<Long> values) {
            addCriterion("petid in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotIn(List<Long> values) {
            addCriterion("petid not in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidBetween(Long value1, Long value2) {
            addCriterion("petid between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotBetween(Long value1, Long value2) {
            addCriterion("petid not between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNull() {
            addCriterion("petname is null");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNotNull() {
            addCriterion("petname is not null");
            return (Criteria) this;
        }

        public Criteria andPetnameEqualTo(String value) {
            addCriterion("petname =", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotEqualTo(String value) {
            addCriterion("petname <>", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThan(String value) {
            addCriterion("petname >", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThanOrEqualTo(String value) {
            addCriterion("petname >=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThan(String value) {
            addCriterion("petname <", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThanOrEqualTo(String value) {
            addCriterion("petname <=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLike(String value) {
            addCriterion("petname like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotLike(String value) {
            addCriterion("petname not like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameIn(List<String> values) {
            addCriterion("petname in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotIn(List<String> values) {
            addCriterion("petname not in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameBetween(String value1, String value2) {
            addCriterion("petname between", value1, value2, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotBetween(String value1, String value2) {
            addCriterion("petname not between", value1, value2, "petname");
            return (Criteria) this;
        }

        public Criteria andPetbreedIsNull() {
            addCriterion("petbreed is null");
            return (Criteria) this;
        }

        public Criteria andPetbreedIsNotNull() {
            addCriterion("petbreed is not null");
            return (Criteria) this;
        }

        public Criteria andPetbreedEqualTo(String value) {
            addCriterion("petbreed =", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotEqualTo(String value) {
            addCriterion("petbreed <>", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedGreaterThan(String value) {
            addCriterion("petbreed >", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedGreaterThanOrEqualTo(String value) {
            addCriterion("petbreed >=", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedLessThan(String value) {
            addCriterion("petbreed <", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedLessThanOrEqualTo(String value) {
            addCriterion("petbreed <=", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedLike(String value) {
            addCriterion("petbreed like", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotLike(String value) {
            addCriterion("petbreed not like", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedIn(List<String> values) {
            addCriterion("petbreed in", values, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotIn(List<String> values) {
            addCriterion("petbreed not in", values, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedBetween(String value1, String value2) {
            addCriterion("petbreed between", value1, value2, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotBetween(String value1, String value2) {
            addCriterion("petbreed not between", value1, value2, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetsexIsNull() {
            addCriterion("petsex is null");
            return (Criteria) this;
        }

        public Criteria andPetsexIsNotNull() {
            addCriterion("petsex is not null");
            return (Criteria) this;
        }

        public Criteria andPetsexEqualTo(String value) {
            addCriterion("petsex =", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotEqualTo(String value) {
            addCriterion("petsex <>", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexGreaterThan(String value) {
            addCriterion("petsex >", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexGreaterThanOrEqualTo(String value) {
            addCriterion("petsex >=", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexLessThan(String value) {
            addCriterion("petsex <", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexLessThanOrEqualTo(String value) {
            addCriterion("petsex <=", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexLike(String value) {
            addCriterion("petsex like", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotLike(String value) {
            addCriterion("petsex not like", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexIn(List<String> values) {
            addCriterion("petsex in", values, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotIn(List<String> values) {
            addCriterion("petsex not in", values, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexBetween(String value1, String value2) {
            addCriterion("petsex between", value1, value2, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotBetween(String value1, String value2) {
            addCriterion("petsex not between", value1, value2, "petsex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNull() {
            addCriterion("describle is null");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNotNull() {
            addCriterion("describle is not null");
            return (Criteria) this;
        }

        public Criteria andDescribleEqualTo(String value) {
            addCriterion("describle =", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotEqualTo(String value) {
            addCriterion("describle <>", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThan(String value) {
            addCriterion("describle >", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThanOrEqualTo(String value) {
            addCriterion("describle >=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThan(String value) {
            addCriterion("describle <", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThanOrEqualTo(String value) {
            addCriterion("describle <=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLike(String value) {
            addCriterion("describle like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotLike(String value) {
            addCriterion("describle not like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleIn(List<String> values) {
            addCriterion("describle in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotIn(List<String> values) {
            addCriterion("describle not in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleBetween(String value1, String value2) {
            addCriterion("describle between", value1, value2, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotBetween(String value1, String value2) {
            addCriterion("describle not between", value1, value2, "describle");
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