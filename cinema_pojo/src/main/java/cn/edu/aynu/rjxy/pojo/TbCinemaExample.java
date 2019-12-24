package cn.edu.aynu.rjxy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCinemaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCinemaExample() {
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

        public Criteria andCinNameIsNull() {
            addCriterion("cin_name is null");
            return (Criteria) this;
        }

        public Criteria andCinNameIsNotNull() {
            addCriterion("cin_name is not null");
            return (Criteria) this;
        }

        public Criteria andCinNameEqualTo(String value) {
            addCriterion("cin_name =", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameNotEqualTo(String value) {
            addCriterion("cin_name <>", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameGreaterThan(String value) {
            addCriterion("cin_name >", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameGreaterThanOrEqualTo(String value) {
            addCriterion("cin_name >=", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameLessThan(String value) {
            addCriterion("cin_name <", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameLessThanOrEqualTo(String value) {
            addCriterion("cin_name <=", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameLike(String value) {
            addCriterion("cin_name like", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameNotLike(String value) {
            addCriterion("cin_name not like", value, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameIn(List<String> values) {
            addCriterion("cin_name in", values, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameNotIn(List<String> values) {
            addCriterion("cin_name not in", values, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameBetween(String value1, String value2) {
            addCriterion("cin_name between", value1, value2, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinNameNotBetween(String value1, String value2) {
            addCriterion("cin_name not between", value1, value2, "cinName");
            return (Criteria) this;
        }

        public Criteria andCinAddressIsNull() {
            addCriterion("cin_address is null");
            return (Criteria) this;
        }

        public Criteria andCinAddressIsNotNull() {
            addCriterion("cin_address is not null");
            return (Criteria) this;
        }

        public Criteria andCinAddressEqualTo(String value) {
            addCriterion("cin_address =", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressNotEqualTo(String value) {
            addCriterion("cin_address <>", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressGreaterThan(String value) {
            addCriterion("cin_address >", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cin_address >=", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressLessThan(String value) {
            addCriterion("cin_address <", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressLessThanOrEqualTo(String value) {
            addCriterion("cin_address <=", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressLike(String value) {
            addCriterion("cin_address like", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressNotLike(String value) {
            addCriterion("cin_address not like", value, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressIn(List<String> values) {
            addCriterion("cin_address in", values, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressNotIn(List<String> values) {
            addCriterion("cin_address not in", values, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressBetween(String value1, String value2) {
            addCriterion("cin_address between", value1, value2, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinAddressNotBetween(String value1, String value2) {
            addCriterion("cin_address not between", value1, value2, "cinAddress");
            return (Criteria) this;
        }

        public Criteria andCinPhoneIsNull() {
            addCriterion("cin_phone is null");
            return (Criteria) this;
        }

        public Criteria andCinPhoneIsNotNull() {
            addCriterion("cin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCinPhoneEqualTo(String value) {
            addCriterion("cin_phone =", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneNotEqualTo(String value) {
            addCriterion("cin_phone <>", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneGreaterThan(String value) {
            addCriterion("cin_phone >", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cin_phone >=", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneLessThan(String value) {
            addCriterion("cin_phone <", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneLessThanOrEqualTo(String value) {
            addCriterion("cin_phone <=", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneLike(String value) {
            addCriterion("cin_phone like", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneNotLike(String value) {
            addCriterion("cin_phone not like", value, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneIn(List<String> values) {
            addCriterion("cin_phone in", values, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneNotIn(List<String> values) {
            addCriterion("cin_phone not in", values, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneBetween(String value1, String value2) {
            addCriterion("cin_phone between", value1, value2, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinPhoneNotBetween(String value1, String value2) {
            addCriterion("cin_phone not between", value1, value2, "cinPhone");
            return (Criteria) this;
        }

        public Criteria andCinEmailIsNull() {
            addCriterion("cin_email is null");
            return (Criteria) this;
        }

        public Criteria andCinEmailIsNotNull() {
            addCriterion("cin_email is not null");
            return (Criteria) this;
        }

        public Criteria andCinEmailEqualTo(String value) {
            addCriterion("cin_email =", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailNotEqualTo(String value) {
            addCriterion("cin_email <>", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailGreaterThan(String value) {
            addCriterion("cin_email >", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cin_email >=", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailLessThan(String value) {
            addCriterion("cin_email <", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailLessThanOrEqualTo(String value) {
            addCriterion("cin_email <=", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailLike(String value) {
            addCriterion("cin_email like", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailNotLike(String value) {
            addCriterion("cin_email not like", value, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailIn(List<String> values) {
            addCriterion("cin_email in", values, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailNotIn(List<String> values) {
            addCriterion("cin_email not in", values, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailBetween(String value1, String value2) {
            addCriterion("cin_email between", value1, value2, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinEmailNotBetween(String value1, String value2) {
            addCriterion("cin_email not between", value1, value2, "cinEmail");
            return (Criteria) this;
        }

        public Criteria andCinImgIsNull() {
            addCriterion("cin_img is null");
            return (Criteria) this;
        }

        public Criteria andCinImgIsNotNull() {
            addCriterion("cin_img is not null");
            return (Criteria) this;
        }

        public Criteria andCinImgEqualTo(String value) {
            addCriterion("cin_img =", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgNotEqualTo(String value) {
            addCriterion("cin_img <>", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgGreaterThan(String value) {
            addCriterion("cin_img >", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgGreaterThanOrEqualTo(String value) {
            addCriterion("cin_img >=", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgLessThan(String value) {
            addCriterion("cin_img <", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgLessThanOrEqualTo(String value) {
            addCriterion("cin_img <=", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgLike(String value) {
            addCriterion("cin_img like", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgNotLike(String value) {
            addCriterion("cin_img not like", value, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgIn(List<String> values) {
            addCriterion("cin_img in", values, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgNotIn(List<String> values) {
            addCriterion("cin_img not in", values, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgBetween(String value1, String value2) {
            addCriterion("cin_img between", value1, value2, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinImgNotBetween(String value1, String value2) {
            addCriterion("cin_img not between", value1, value2, "cinImg");
            return (Criteria) this;
        }

        public Criteria andCinServiceIsNull() {
            addCriterion("cin_service is null");
            return (Criteria) this;
        }

        public Criteria andCinServiceIsNotNull() {
            addCriterion("cin_service is not null");
            return (Criteria) this;
        }

        public Criteria andCinServiceEqualTo(String value) {
            addCriterion("cin_service =", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceNotEqualTo(String value) {
            addCriterion("cin_service <>", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceGreaterThan(String value) {
            addCriterion("cin_service >", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceGreaterThanOrEqualTo(String value) {
            addCriterion("cin_service >=", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceLessThan(String value) {
            addCriterion("cin_service <", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceLessThanOrEqualTo(String value) {
            addCriterion("cin_service <=", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceLike(String value) {
            addCriterion("cin_service like", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceNotLike(String value) {
            addCriterion("cin_service not like", value, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceIn(List<String> values) {
            addCriterion("cin_service in", values, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceNotIn(List<String> values) {
            addCriterion("cin_service not in", values, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceBetween(String value1, String value2) {
            addCriterion("cin_service between", value1, value2, "cinService");
            return (Criteria) this;
        }

        public Criteria andCinServiceNotBetween(String value1, String value2) {
            addCriterion("cin_service not between", value1, value2, "cinService");
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

        public Criteria andIsUsableIsNull() {
            addCriterion("is_usable is null");
            return (Criteria) this;
        }

        public Criteria andIsUsableIsNotNull() {
            addCriterion("is_usable is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsableEqualTo(Long value) {
            addCriterion("is_usable =", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableNotEqualTo(Long value) {
            addCriterion("is_usable <>", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableGreaterThan(Long value) {
            addCriterion("is_usable >", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableGreaterThanOrEqualTo(Long value) {
            addCriterion("is_usable >=", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableLessThan(Long value) {
            addCriterion("is_usable <", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableLessThanOrEqualTo(Long value) {
            addCriterion("is_usable <=", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableIn(List<Long> values) {
            addCriterion("is_usable in", values, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableNotIn(List<Long> values) {
            addCriterion("is_usable not in", values, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableBetween(Long value1, Long value2) {
            addCriterion("is_usable between", value1, value2, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableNotBetween(Long value1, Long value2) {
            addCriterion("is_usable not between", value1, value2, "isUsable");
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