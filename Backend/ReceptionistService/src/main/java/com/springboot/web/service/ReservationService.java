package com.springboot.web.service;


import com.springboot.web.model.Reservation;

import java.util.List;

public interface ReservationService {


    Reservation addGuest(Reservation detail);

    Reservation updateReservation(Reservation details);

    void deleteReservation(Integer id);


    Object getRoomById(Integer id);
    Object getByStatus();

    List<Reservation> getReserved();
}
