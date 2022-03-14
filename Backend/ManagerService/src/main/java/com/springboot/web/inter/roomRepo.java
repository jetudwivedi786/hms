package com.springboot.web.inter;

import com.springboot.web.details.roomDetails;
import com.springboot.web.details.staffDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface roomRepo extends MongoRepository<roomDetails,Integer> {


}
