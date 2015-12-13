package com.example.task.service;

import com.example.task.domain.Reservation;
import com.example.task.exception.WrongJsonRequestException;
import com.example.task.vo.RentingRequestVO;
import com.example.task.vo.ReservationVO;

/**
 * Created by Влад on 12.12.2015.
 */
public interface RentingService {
    public Reservation calculate(RentingRequestVO request) throws WrongJsonRequestException;
}
