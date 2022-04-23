package com.springboot.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.model.staffDetails;

public interface StaffRepo extends MongoRepository<staffDetails, Integer> {


}
