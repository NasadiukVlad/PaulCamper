package com.example.task.controller;

import com.example.task.domain.Reservation;
import com.example.task.exception.WrongJsonRequestException;
import com.example.task.service.RentingService;
import com.example.task.vo.RentingRequestVO;
import com.example.task.vo.RentingResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Влад on 12.12.2015.
 */
@RestController
public class RentingController {

    @Autowired
    RentingService rentingService;

    @RequestMapping(value = "/longest-free-range", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public RentingResponseVO rentingResponseVOCalculate(@RequestBody RentingRequestVO request) throws WrongJsonRequestException {

        RentingResponseVO rentingResponseVO = new RentingResponseVO();
        rentingResponseVO.setStartRantingDate(rentingService.calculate(request).getStart());
        rentingResponseVO.setEndRentingDate(rentingService.calculate(request).getEnd());

        return rentingResponseVO;
    }
}
