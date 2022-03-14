package com.payment.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.model.PaymentDetails;
import com.payment.repo.PaymentRepository;

@Service

public class PaymentService {
	
    @Autowired
    private PaymentRepository repository;

    public PaymentDetails doPay(PaymentDetails payment){
        payment.setPaymentStatus(paymentStatus());
        payment.setTxId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    private String paymentStatus(){
    	
        return new Random().nextBoolean()?"success":"failure";
    }
}



