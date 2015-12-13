package com.example.task.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Влад on 12.12.2015.
 */
public class RentingRequestVO {
    @JsonProperty("start")
    private String startDate;

    @JsonProperty("end")
    private String endDate;

    @JsonProperty("reservations")
    ArrayList<ReservationVO> reservationsList;

    public ArrayList<ReservationVO> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(ArrayList<ReservationVO> reservationsList) {
        this.reservationsList = reservationsList;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
