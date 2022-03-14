package com.payment.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.payment.model.PaymentDetails;

public interface PaymentRepository extends MongoRepository<PaymentDetails, Integer> {

}
