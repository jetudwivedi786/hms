package com.springboot.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.model.Details;

public interface GuestRepository extends MongoRepository<Details, Integer> {

}
