package com.example.task.domain;

import java.util.ArrayList;

/**
 * Created by Влад on 13.12.2015.
 */
public class Reservation {

    private String start;
    private String end;
    ArrayList<Reservation> reservationsList;

    public ArrayList<Reservation> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(ArrayList<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }

    public Reservation(String start, String end){
        this.start = start;

        this.end = end;
    }

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
