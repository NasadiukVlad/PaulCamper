package com.example.task.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

/**
 * Created by Влад on 12.12.2015.
 */
public class ErrorResponseValueObject {
    @JsonProperty("reason")
    private String reason;

    @JsonProperty("timestamp")
    private LocalDate timeStamp;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }


}
