package cn.edu.aynu.rjxy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbTicket implements Serializable {
    private Long ticketId;

    private String orderId;

    private Date time;

    private String hallName;

    private Long movId;

    private String movName;

    private Long showingsId;

    private String seat;

    private BigDecimal price;

    private String code;

    private Long isComment;

    private Long status;

    private String spare;

    private static final long serialVersionUID = 1L;

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName == null ? null : hallName.trim();
    }

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

    public Long getShowingsId() {
        return showingsId;
    }

    public void setShowingsId(Long showingsId) {
        this.showingsId = showingsId;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getIsComment() {
        return isComment;
    }

    public void setIsComment(Long isComment) {
        this.isComment = isComment;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }
}