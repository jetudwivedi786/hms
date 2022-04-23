package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.payment.model.PaymentDetails;
import com.payment.service.PaymentService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pay")
public class PaymentController {
	
    @Autowired
    public PaymentService service;
    @GetMapping("/getpayment")
    public List<PaymentDetails> getPayment(){
        return service.getPayment();
    }
    @GetMapping("/getpaybyid/{id}")
    public PaymentDetails getbyid(@PathVariable Integer id){
        return service.getbyid(id);
    }

    @PostMapping("/addpayment")
    public PaymentDetails doPayment(@RequestBody PaymentDetails payment){
        return service.doPay(payment);
    }
}


