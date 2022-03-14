package com.springboot.web.service;


import com.springboot.web.details.Reservation;
import org.springframework.stereotype.Service;

public interface reservationService {


    Reservation addGuest(Reservation detail);

    Reservation updateReservation(Reservation details);

    void deleteReservation(Integer id);

    Object getReserve();
}
