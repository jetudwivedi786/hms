package com.springboot.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.model.staffDetails;

public interface staffRepo extends MongoRepository<staffDetails, Integer> {
//    Object findByName(String name);
//    staffDetails findByname(String name);


}
