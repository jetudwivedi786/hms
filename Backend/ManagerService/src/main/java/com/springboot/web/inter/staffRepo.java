package com.springboot.web.inter;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.details.staffDetails;

public interface staffRepo extends MongoRepository<staffDetails, Integer> {
//    Object findByName(String name);
//    staffDetails findByname(String name);


}
