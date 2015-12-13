package com.example.task.service;

import com.example.task.domain.Reservation;
import com.example.task.exception.WrongJsonRequestException;
import com.example.task.vo.RentingRequestVO;
import com.example.task.vo.ReservationVO;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Влад on 12.12.2015.
 */
public class RentingServiceImplementation implements RentingService {
    @Override
    public Reservation calculate(RentingRequestVO request) throws WrongJsonRequestException {

        ArrayList<ReservationVO> requestReservations = request.getReservationsList();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime startRentingCar = LocalDateTime.parse(request.getStartDate(), formatter);
        LocalDateTime endRentingCar = LocalDateTime.parse(request.getEndDate(), formatter);


        LocalDateTime lastReservationDay = LocalDateTime.parse(requestReservations.get(0).getEnd(), formatter);

        int leftComparedObjectIsBigger = -1;
        int equalObjects = 0;
        int rightComparedObjectIsBigger = 1;

        for (int i = 1; i < requestReservations.size(); i++) {

            if (lastReservationDay.compareTo(LocalDateTime.parse(requestReservations.get(i).getEnd())) == leftComparedObjectIsBigger) {
                lastReservationDay = LocalDateTime.parse(requestReservations.get(i).getEnd());
            }

        }

        if (lastReservationDay.compareTo(startRentingCar) == leftComparedObjectIsBigger && lastReservationDay.compareTo(startRentingCar) == equalObjects) {
            startRentingCar = lastReservationDay.plusDays(1);
        } else if(lastReservationDay.compareTo(endRentingCar) == rightComparedObjectIsBigger) {
            throw new WrongJsonRequestException();
        } else {
            throw new WrongJsonRequestException();
        }

        Reservation reservation = new Reservation(startRentingCar.toString(), endRentingCar.toString());

        return reservation;
    }
}
