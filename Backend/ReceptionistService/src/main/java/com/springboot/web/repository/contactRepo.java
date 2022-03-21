package com.springboot.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.model.Details;

public interface contactRepo extends MongoRepository<Details, Integer> {

}
