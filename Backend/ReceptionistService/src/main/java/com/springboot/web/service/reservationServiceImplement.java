package com.springboot.web.service;

import com.springboot.web.details.PaymentDetails;
import com.springboot.web.details.Reservation;
import com.springboot.web.inter.reservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class reservationServiceImplement implements reservationService{
    @Autowired
    private reservationRepo reservationrepo;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Reservation addGuest(Reservation detail) {
        PaymentDetails paymentDetails=restTemplate.getForObject("http://payment-service/pay/getpaybyid/"+detail.getRoomNo(),PaymentDetails.class);
                detail.setPaymentDetails(paymentDetails);
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

    @Override
    public Object getRoomById(Integer id) {
        return this.reservationrepo.findById(id);
    }
@Override
    public Object getByStatus() {
        List<Reservation> lst=new ArrayList<>();
        for (Reservation object:this.reservationrepo.findAll()
             ) {
            if(object.getStatus().equals("vacant")){
                lst.add(object);
            }

        }
        return lst;
    }



}
