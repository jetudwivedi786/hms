package com.springboot.web.inter;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.details.staffDetails;

public interface staffRepo extends MongoRepository<staffDetails, Integer> {
//    staffDetails findByname(String name);


}
