package com.springboot.web.service;

import com.springboot.web.details.Reservation;
import com.springboot.web.inter.reservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reservationServiceImplement implements reservationService{
    @Autowired
    private reservationRepo reservationrepo;

    @Override
    public Reservation addGuest(Reservation detail) {
        return this.reservationrepo.save(detail);
    }

    @Override
    public Reservation updateReservation(Reservation details) {
        return this.reservationrepo.save(details);
    }

    @Override
    public void deleteReservation(Integer id) {
        this.reservationrepo.deleteById(id);
    }

    @Override
    public Object getReserve() {
        return this.reservationrepo.findAll();
    }


}
