package com.example.task.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Влад on 13.12.2015.
 */
public class RentingResponseVO {

    @JsonProperty
    String startRantingDate;

    @JsonProperty
    String endRentingDate;

    public String getStartRantingDate() {
        return startRantingDate;
    }

    public void setStartRantingDate(String startRantingDate) {
        this.startRantingDate = startRantingDate;
    }

    public String getEndRentingDate() {
        return endRentingDate;
    }

    public void setEndRentingDate(String endRentingDate) {
        this.endRentingDate = endRentingDate;
    }


}
