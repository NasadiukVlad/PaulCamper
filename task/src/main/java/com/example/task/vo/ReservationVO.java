package com.example.task.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Влад on 13.12.2015.
 */
public class ReservationVO {
    @JsonProperty("start")
    private String start;

    @JsonProperty("end")
    private String end;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
