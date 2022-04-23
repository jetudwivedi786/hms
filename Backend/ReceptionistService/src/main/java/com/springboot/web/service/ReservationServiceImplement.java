package com.springboot.web.service;

import com.springboot.web.model.PaymentDetails;
import com.springboot.web.model.Reservation;
import com.springboot.web.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationServiceImplement implements ReservationService {
    @Autowired
    private ReservationRepository reservationrepo;
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

    @Override
    public List<Reservation> getReserved() {
        return this.reservationrepo.findAll();
    }

    @KafkaListener(topics = "transaction" , groupId = "HMS" , containerFactory = "kafkaListenerContainerFactory")
    private void KafakaListener(String msg){
        System.out.println("Apache Kafka "+msg);
    }


}
