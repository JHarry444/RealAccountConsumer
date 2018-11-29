package com.qa.RealAccountConsumer.persistence.domain;

public class Prize {

    private Long prizeId;

    private int prizeAmount;

    private String time;

    public Prize() {

    }

    public Prize(Long prizeId, int prizeAmount, String time) {
        this.prizeAmount = prizeAmount;
        this.time = time;
        this.prizeId = prizeId;
    }

    public Long getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Long prizeId) {
        this.prizeId = prizeId;
    }

    public int getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(int prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
