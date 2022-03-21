package com.springboot.web.service;


import com.springboot.web.model.Reservation;

public interface reservationService {


    Reservation addGuest(Reservation detail);

    Reservation updateReservation(Reservation details);

    void deleteReservation(Integer id);

    Object getReserve();

    Object getRoomById(Integer id);
    Object getByStatus();

}
