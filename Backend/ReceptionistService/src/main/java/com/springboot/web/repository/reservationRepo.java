package com.springboot.web.repository;

import com.springboot.web.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface reservationRepo extends MongoRepository<Reservation,Integer> {
}
