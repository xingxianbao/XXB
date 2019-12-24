package cn.edu.aynu.rjxy.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbTimetable implements Serializable {
    private Long id;

    private Date showTime;

    private String spare;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }
}