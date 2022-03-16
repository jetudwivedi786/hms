package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.model.PaymentDetails;
import com.payment.service.PaymentService;

@RestController

public class PaymentController {
	
    @Autowired
    public PaymentService service;
    @GetMapping("/get")
    public ResponseEntity<?> getPayment(){
        return ResponseEntity.ok(this.service.getAllPayments());
    }

    @PostMapping("/payment/")
    public PaymentDetails doPayment(@RequestBody PaymentDetails payment){
        return service.doPay(payment);
    }
}


