package com.springboot.web.inter;

import com.springboot.web.details.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface reservationRepo extends MongoRepository<Reservation,Integer> {
}
