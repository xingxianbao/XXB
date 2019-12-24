package cn.edu.aynu.rjxy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbHomeDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbHomeDataExample() {
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

        public Criteria andHomeIdIsNull() {
            addCriterion("home_id is null");
            return (Criteria) this;
        }

        public Criteria andHomeIdIsNotNull() {
            addCriterion("home_id is not null");
            return (Criteria) this;
        }

        public Criteria andHomeIdEqualTo(Long value) {
            addCriterion("home_id =", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdNotEqualTo(Long value) {
            addCriterion("home_id <>", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdGreaterThan(Long value) {
            addCriterion("home_id >", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("home_id >=", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdLessThan(Long value) {
            addCriterion("home_id <", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdLessThanOrEqualTo(Long value) {
            addCriterion("home_id <=", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdIn(List<Long> values) {
            addCriterion("home_id in", values, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdNotIn(List<Long> values) {
            addCriterion("home_id not in", values, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdBetween(Long value1, Long value2) {
            addCriterion("home_id between", value1, value2, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdNotBetween(Long value1, Long value2) {
            addCriterion("home_id not between", value1, value2, "homeId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdIsNull() {
            addCriterion("cinema_id is null");
            return (Criteria) this;
        }

        public Criteria andCinemaIdIsNotNull() {
            addCriterion("cinema_id is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaIdEqualTo(Long value) {
            addCriterion("cinema_id =", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdNotEqualTo(Long value) {
            addCriterion("cinema_id <>", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdGreaterThan(Long value) {
            addCriterion("cinema_id >", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cinema_id >=", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdLessThan(Long value) {
            addCriterion("cinema_id <", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdLessThanOrEqualTo(Long value) {
            addCriterion("cinema_id <=", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdIn(List<Long> values) {
            addCriterion("cinema_id in", values, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdNotIn(List<Long> values) {
            addCriterion("cinema_id not in", values, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdBetween(Long value1, Long value2) {
            addCriterion("cinema_id between", value1, value2, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdNotBetween(Long value1, Long value2) {
            addCriterion("cinema_id not between", value1, value2, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andMovIdIsNull() {
            addCriterion("mov_id is null");
            return (Criteria) this;
        }

        public Criteria andMovIdIsNotNull() {
            addCriterion("mov_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovIdEqualTo(Long value) {
            addCriterion("mov_id =", value, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdNotEqualTo(Long value) {
            addCriterion("mov_id <>", value, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdGreaterThan(Long value) {
            addCriterion("mov_id >", value, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mov_id >=", value, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdLessThan(Long value) {
            addCriterion("mov_id <", value, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdLessThanOrEqualTo(Long value) {
            addCriterion("mov_id <=", value, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdIn(List<Long> values) {
            addCriterion("mov_id in", values, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdNotIn(List<Long> values) {
            addCriterion("mov_id not in", values, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdBetween(Long value1, Long value2) {
            addCriterion("mov_id between", value1, value2, "movId");
            return (Criteria) this;
        }

        public Criteria andMovIdNotBetween(Long value1, Long value2) {
            addCriterion("mov_id not between", value1, value2, "movId");
            return (Criteria) this;
        }

        public Criteria andMovPic1IsNull() {
            addCriterion("mov_pic1 is null");
            return (Criteria) this;
        }

        public Criteria andMovPic1IsNotNull() {
            addCriterion("mov_pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andMovPic1EqualTo(String value) {
            addCriterion("mov_pic1 =", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1NotEqualTo(String value) {
            addCriterion("mov_pic1 <>", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1GreaterThan(String value) {
            addCriterion("mov_pic1 >", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1GreaterThanOrEqualTo(String value) {
            addCriterion("mov_pic1 >=", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1LessThan(String value) {
            addCriterion("mov_pic1 <", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1LessThanOrEqualTo(String value) {
            addCriterion("mov_pic1 <=", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1Like(String value) {
            addCriterion("mov_pic1 like", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1NotLike(String value) {
            addCriterion("mov_pic1 not like", value, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1In(List<String> values) {
            addCriterion("mov_pic1 in", values, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1NotIn(List<String> values) {
            addCriterion("mov_pic1 not in", values, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1Between(String value1, String value2) {
            addCriterion("mov_pic1 between", value1, value2, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovPic1NotBetween(String value1, String value2) {
            addCriterion("mov_pic1 not between", value1, value2, "movPic1");
            return (Criteria) this;
        }

        public Criteria andMovNameIsNull() {
            addCriterion("mov_name is null");
            return (Criteria) this;
        }

        public Criteria andMovNameIsNotNull() {
            addCriterion("mov_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovNameEqualTo(String value) {
            addCriterion("mov_name =", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameNotEqualTo(String value) {
            addCriterion("mov_name <>", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameGreaterThan(String value) {
            addCriterion("mov_name >", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameGreaterThanOrEqualTo(String value) {
            addCriterion("mov_name >=", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameLessThan(String value) {
            addCriterion("mov_name <", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameLessThanOrEqualTo(String value) {
            addCriterion("mov_name <=", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameLike(String value) {
            addCriterion("mov_name like", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameNotLike(String value) {
            addCriterion("mov_name not like", value, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameIn(List<String> values) {
            addCriterion("mov_name in", values, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameNotIn(List<String> values) {
            addCriterion("mov_name not in", values, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameBetween(String value1, String value2) {
            addCriterion("mov_name between", value1, value2, "movName");
            return (Criteria) this;
        }

        public Criteria andMovNameNotBetween(String value1, String value2) {
            addCriterion("mov_name not between", value1, value2, "movName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Long value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Long value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Long value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Long> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andSpareIsNull() {
            addCriterion("spare is null");
            return (Criteria) this;
        }

        public Criteria andSpareIsNotNull() {
            addCriterion("spare is not null");
            return (Criteria) this;
        }

        public Criteria andSpareEqualTo(String value) {
            addCriterion("spare =", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotEqualTo(String value) {
            addCriterion("spare <>", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThan(String value) {
            addCriterion("spare >", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareGreaterThanOrEqualTo(String value) {
            addCriterion("spare >=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThan(String value) {
            addCriterion("spare <", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLessThanOrEqualTo(String value) {
            addCriterion("spare <=", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareLike(String value) {
            addCriterion("spare like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotLike(String value) {
            addCriterion("spare not like", value, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareIn(List<String> values) {
            addCriterion("spare in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotIn(List<String> values) {
            addCriterion("spare not in", values, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareBetween(String value1, String value2) {
            addCriterion("spare between", value1, value2, "spare");
            return (Criteria) this;
        }

        public Criteria andSpareNotBetween(String value1, String value2) {
            addCriterion("spare not between", value1, value2, "spare");
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