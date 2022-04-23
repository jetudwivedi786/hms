package com.payment.service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.payment.model.PaymentDetails;
import com.payment.repo.PaymentRepository;

@Service

public class PaymentService {
	
    @Autowired
    private PaymentRepository repository;

    @Autowired
    private KafkaTemplate <String,String> kafkaTemplate;

    public PaymentDetails doPay(PaymentDetails payment){
        kafkaTemplate.send("transaction","Transaction successful with order ID  "+payment.getOrderId());
        payment.setPaymentStatus(paymentStatus());
        System.out.println(payment.toString());
//        payment.setTxId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    private String paymentStatus(){
    	
        return new Random().nextBoolean()?"success":"success";
    }


    public List<PaymentDetails> getPayment() {
        List<PaymentDetails> paymentDetails = repository.findAll();
        return paymentDetails;
    }

    public PaymentDetails getbyid(Integer id) {
        return this.repository.findById(id).get();
    }
}



