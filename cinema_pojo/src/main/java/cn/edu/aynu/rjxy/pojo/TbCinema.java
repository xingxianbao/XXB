package cn.edu.aynu.rjxy.pojo;

import java.io.Serializable;

public class TbCinema implements Serializable {
    private Long cinemaId;

    private String cinName;

    private String cinAddress;

    private String cinPhone;

    private String cinEmail;

    private String cinImg;

    private String cinService;

    private Long cityId;

    private Long isUsable;

    private String spare;

    private static final long serialVersionUID = 1L;

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinName() {
        return cinName;
    }

    public void setCinName(String cinName) {
        this.cinName = cinName == null ? null : cinName.trim();
    }

    public String getCinAddress() {
        return cinAddress;
    }

    public void setCinAddress(String cinAddress) {
        this.cinAddress = cinAddress == null ? null : cinAddress.trim();
    }

    public String getCinPhone() {
        return cinPhone;
    }

    public void setCinPhone(String cinPhone) {
        this.cinPhone = cinPhone == null ? null : cinPhone.trim();
    }

    public String getCinEmail() {
        return cinEmail;
    }

    public void setCinEmail(String cinEmail) {
        this.cinEmail = cinEmail == null ? null : cinEmail.trim();
    }

    public String getCinImg() {
        return cinImg;
    }

    public void setCinImg(String cinImg) {
        this.cinImg = cinImg == null ? null : cinImg.trim();
    }

    public String getCinService() {
        return cinService;
    }

    public void setCinService(String cinService) {
        this.cinService = cinService == null ? null : cinService.trim();
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getIsUsable() {
        return isUsable;
    }

    public void setIsUsable(Long isUsable) {
        this.isUsable = isUsable;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }
}