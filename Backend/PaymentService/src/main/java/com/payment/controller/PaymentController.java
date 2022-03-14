package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.PaymentDetails;
import com.payment.service.PaymentService;

@RestController

public class PaymentController {
	
    @Autowired
    public PaymentService service;

    @PostMapping("/payment/")
    public PaymentDetails doPayment(@RequestBody PaymentDetails payment){
        return service.doPay(payment);
    }
}


