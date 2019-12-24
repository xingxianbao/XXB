package cn.edu.aynu.rjxy.pojo;

import java.io.Serializable;

public class TbHomeData implements Serializable {
    private Long homeId;

    private Long cinemaId;

    private Long movId;

    private String movPic1;

    private String movName;

    private Long cityId;

    private String spare;

    private static final long serialVersionUID = 1L;

    public Long getHomeId() {
        return homeId;
    }

    public void setHomeId(Long homeId) {
        this.homeId = homeId;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Long getMovId() {
        return movId;
    }

    public void setMovId(Long movId) {
        this.movId = movId;
    }

    public String getMovPic1() {
        return movPic1;
    }

    public void setMovPic1(String movPic1) {
        this.movPic1 = movPic1 == null ? null : movPic1.trim();
    }

    public String getMovName() {
        return movName;
    }

    public void setMovName(String movName) {
        this.movName = movName == null ? null : movName.trim();
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }
}