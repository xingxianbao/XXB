package cn.edu.aynu.rjxy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMovieExample() {
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

        public Criteria andMovIntroduceIsNull() {
            addCriterion("mov_introduce is null");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceIsNotNull() {
            addCriterion("mov_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceEqualTo(String value) {
            addCriterion("mov_introduce =", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceNotEqualTo(String value) {
            addCriterion("mov_introduce <>", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceGreaterThan(String value) {
            addCriterion("mov_introduce >", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("mov_introduce >=", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceLessThan(String value) {
            addCriterion("mov_introduce <", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceLessThanOrEqualTo(String value) {
            addCriterion("mov_introduce <=", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceLike(String value) {
            addCriterion("mov_introduce like", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceNotLike(String value) {
            addCriterion("mov_introduce not like", value, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceIn(List<String> values) {
            addCriterion("mov_introduce in", values, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceNotIn(List<String> values) {
            addCriterion("mov_introduce not in", values, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceBetween(String value1, String value2) {
            addCriterion("mov_introduce between", value1, value2, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIntroduceNotBetween(String value1, String value2) {
            addCriterion("mov_introduce not between", value1, value2, "movIntroduce");
            return (Criteria) this;
        }

        public Criteria andMovIndateIsNull() {
            addCriterion("mov_indate is null");
            return (Criteria) this;
        }

        public Criteria andMovIndateIsNotNull() {
            addCriterion("mov_indate is not null");
            return (Criteria) this;
        }

        public Criteria andMovIndateEqualTo(Date value) {
            addCriterion("mov_indate =", value, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateNotEqualTo(Date value) {
            addCriterion("mov_indate <>", value, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateGreaterThan(Date value) {
            addCriterion("mov_indate >", value, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("mov_indate >=", value, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateLessThan(Date value) {
            addCriterion("mov_indate <", value, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateLessThanOrEqualTo(Date value) {
            addCriterion("mov_indate <=", value, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateIn(List<Date> values) {
            addCriterion("mov_indate in", values, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateNotIn(List<Date> values) {
            addCriterion("mov_indate not in", values, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateBetween(Date value1, Date value2) {
            addCriterion("mov_indate between", value1, value2, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovIndateNotBetween(Date value1, Date value2) {
            addCriterion("mov_indate not between", value1, value2, "movIndate");
            return (Criteria) this;
        }

        public Criteria andMovTimeIsNull() {
            addCriterion("mov_time is null");
            return (Criteria) this;
        }

        public Criteria andMovTimeIsNotNull() {
            addCriterion("mov_time is not null");
            return (Criteria) this;
        }

        public Criteria andMovTimeEqualTo(String value) {
            addCriterion("mov_time =", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeNotEqualTo(String value) {
            addCriterion("mov_time <>", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeGreaterThan(String value) {
            addCriterion("mov_time >", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mov_time >=", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeLessThan(String value) {
            addCriterion("mov_time <", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeLessThanOrEqualTo(String value) {
            addCriterion("mov_time <=", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeLike(String value) {
            addCriterion("mov_time like", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeNotLike(String value) {
            addCriterion("mov_time not like", value, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeIn(List<String> values) {
            addCriterion("mov_time in", values, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeNotIn(List<String> values) {
            addCriterion("mov_time not in", values, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeBetween(String value1, String value2) {
            addCriterion("mov_time between", value1, value2, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovTimeNotBetween(String value1, String value2) {
            addCriterion("mov_time not between", value1, value2, "movTime");
            return (Criteria) this;
        }

        public Criteria andMovDirectorIsNull() {
            addCriterion("mov_director is null");
            return (Criteria) this;
        }

        public Criteria andMovDirectorIsNotNull() {
            addCriterion("mov_director is not null");
            return (Criteria) this;
        }

        public Criteria andMovDirectorEqualTo(String value) {
            addCriterion("mov_director =", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorNotEqualTo(String value) {
            addCriterion("mov_director <>", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorGreaterThan(String value) {
            addCriterion("mov_director >", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("mov_director >=", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorLessThan(String value) {
            addCriterion("mov_director <", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorLessThanOrEqualTo(String value) {
            addCriterion("mov_director <=", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorLike(String value) {
            addCriterion("mov_director like", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorNotLike(String value) {
            addCriterion("mov_director not like", value, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorIn(List<String> values) {
            addCriterion("mov_director in", values, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorNotIn(List<String> values) {
            addCriterion("mov_director not in", values, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorBetween(String value1, String value2) {
            addCriterion("mov_director between", value1, value2, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovDirectorNotBetween(String value1, String value2) {
            addCriterion("mov_director not between", value1, value2, "movDirector");
            return (Criteria) this;
        }

        public Criteria andMovPerformerIsNull() {
            addCriterion("mov_performer is null");
            return (Criteria) this;
        }

        public Criteria andMovPerformerIsNotNull() {
            addCriterion("mov_performer is not null");
            return (Criteria) this;
        }

        public Criteria andMovPerformerEqualTo(String value) {
            addCriterion("mov_performer =", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerNotEqualTo(String value) {
            addCriterion("mov_performer <>", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerGreaterThan(String value) {
            addCriterion("mov_performer >", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerGreaterThanOrEqualTo(String value) {
            addCriterion("mov_performer >=", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerLessThan(String value) {
            addCriterion("mov_performer <", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerLessThanOrEqualTo(String value) {
            addCriterion("mov_performer <=", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerLike(String value) {
            addCriterion("mov_performer like", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerNotLike(String value) {
            addCriterion("mov_performer not like", value, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerIn(List<String> values) {
            addCriterion("mov_performer in", values, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerNotIn(List<String> values) {
            addCriterion("mov_performer not in", values, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerBetween(String value1, String value2) {
            addCriterion("mov_performer between", value1, value2, "movPerformer");
            return (Criteria) this;
        }

        public Criteria andMovPerformerNotBetween(String value1, String value2) {
            addCriterion("mov_performer not between", value1, value2, "movPerformer");
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

        public Criteria andMovPic2IsNull() {
            addCriterion("mov_pic2 is null");
            return (Criteria) this;
        }

        public Criteria andMovPic2IsNotNull() {
            addCriterion("mov_pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andMovPic2EqualTo(String value) {
            addCriterion("mov_pic2 =", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2NotEqualTo(String value) {
            addCriterion("mov_pic2 <>", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2GreaterThan(String value) {
            addCriterion("mov_pic2 >", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2GreaterThanOrEqualTo(String value) {
            addCriterion("mov_pic2 >=", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2LessThan(String value) {
            addCriterion("mov_pic2 <", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2LessThanOrEqualTo(String value) {
            addCriterion("mov_pic2 <=", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2Like(String value) {
            addCriterion("mov_pic2 like", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2NotLike(String value) {
            addCriterion("mov_pic2 not like", value, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2In(List<String> values) {
            addCriterion("mov_pic2 in", values, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2NotIn(List<String> values) {
            addCriterion("mov_pic2 not in", values, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2Between(String value1, String value2) {
            addCriterion("mov_pic2 between", value1, value2, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovPic2NotBetween(String value1, String value2) {
            addCriterion("mov_pic2 not between", value1, value2, "movPic2");
            return (Criteria) this;
        }

        public Criteria andMovStyleIsNull() {
            addCriterion("mov_style is null");
            return (Criteria) this;
        }

        public Criteria andMovStyleIsNotNull() {
            addCriterion("mov_style is not null");
            return (Criteria) this;
        }

        public Criteria andMovStyleEqualTo(String value) {
            addCriterion("mov_style =", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleNotEqualTo(String value) {
            addCriterion("mov_style <>", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleGreaterThan(String value) {
            addCriterion("mov_style >", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleGreaterThanOrEqualTo(String value) {
            addCriterion("mov_style >=", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleLessThan(String value) {
            addCriterion("mov_style <", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleLessThanOrEqualTo(String value) {
            addCriterion("mov_style <=", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleLike(String value) {
            addCriterion("mov_style like", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleNotLike(String value) {
            addCriterion("mov_style not like", value, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleIn(List<String> values) {
            addCriterion("mov_style in", values, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleNotIn(List<String> values) {
            addCriterion("mov_style not in", values, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleBetween(String value1, String value2) {
            addCriterion("mov_style between", value1, value2, "movStyle");
            return (Criteria) this;
        }

        public Criteria andMovStyleNotBetween(String value1, String value2) {
            addCriterion("mov_style not between", value1, value2, "movStyle");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andIsAbleIsNull() {
            addCriterion("is_able is null");
            return (Criteria) this;
        }

        public Criteria andIsAbleIsNotNull() {
            addCriterion("is_able is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbleEqualTo(Long value) {
            addCriterion("is_able =", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleNotEqualTo(Long value) {
            addCriterion("is_able <>", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleGreaterThan(Long value) {
            addCriterion("is_able >", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleGreaterThanOrEqualTo(Long value) {
            addCriterion("is_able >=", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleLessThan(Long value) {
            addCriterion("is_able <", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleLessThanOrEqualTo(Long value) {
            addCriterion("is_able <=", value, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleIn(List<Long> values) {
            addCriterion("is_able in", values, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleNotIn(List<Long> values) {
            addCriterion("is_able not in", values, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleBetween(Long value1, Long value2) {
            addCriterion("is_able between", value1, value2, "isAble");
            return (Criteria) this;
        }

        public Criteria andIsAbleNotBetween(Long value1, Long value2) {
            addCriterion("is_able not between", value1, value2, "isAble");
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