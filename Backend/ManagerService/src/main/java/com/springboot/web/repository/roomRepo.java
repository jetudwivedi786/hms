package com.springboot.web.repository;

import com.springboot.web.model.roomDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface roomRepo extends MongoRepository<roomDetails,Integer> {


}
