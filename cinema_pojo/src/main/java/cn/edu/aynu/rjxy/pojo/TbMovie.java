package cn.edu.aynu.rjxy.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbMovie implements Serializable {
    private Long movId;

    private String movName;

    private String movIntroduce;

    private Date movIndate;

    private String movTime;

    private String movDirector;

    private String movPerformer;

    private String movPic1;

    private String movPic2;

    private String movStyle;

    private String country;

    private Long typeId;

    private Long isAble;

    private String spare;

    private static final long serialVersionUID = 1L;

    public Long getMovId() {
        return movId;
    }

    public void setMovId(Long movId) {
        this.movId = movId;
    }

    public String getMovName() {
        return movName;
    }

    public void setMovName(String movName) {
        this.movName = movName == null ? null : movName.trim();
    }

    public String getMovIntroduce() {
        return movIntroduce;
    }

    public void setMovIntroduce(String movIntroduce) {
        this.movIntroduce = movIntroduce == null ? null : movIntroduce.trim();
    }

    public Date getMovIndate() {
        return movIndate;
    }

    public void setMovIndate(Date movIndate) {
        this.movIndate = movIndate;
    }

    public String getMovTime() {
        return movTime;
    }

    public void setMovTime(String movTime) {
        this.movTime = movTime == null ? null : movTime.trim();
    }

    public String getMovDirector() {
        return movDirector;
    }

    public void setMovDirector(String movDirector) {
        this.movDirector = movDirector == null ? null : movDirector.trim();
    }

    public String getMovPerformer() {
        return movPerformer;
    }

    public void setMovPerformer(String movPerformer) {
        this.movPerformer = movPerformer == null ? null : movPerformer.trim();
    }

    public String getMovPic1() {
        return movPic1;
    }

    public void setMovPic1(String movPic1) {
        this.movPic1 = movPic1 == null ? null : movPic1.trim();
    }

    public String getMovPic2() {
        return movPic2;
    }

    public void setMovPic2(String movPic2) {
        this.movPic2 = movPic2 == null ? null : movPic2.trim();
    }

    public String getMovStyle() {
        return movStyle;
    }

    public void setMovStyle(String movStyle) {
        this.movStyle = movStyle == null ? null : movStyle.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getIsAble() {
        return isAble;
    }

    public void setIsAble(Long isAble) {
        this.isAble = isAble;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }
}