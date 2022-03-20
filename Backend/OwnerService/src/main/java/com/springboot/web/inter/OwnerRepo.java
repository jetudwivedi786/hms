package com.springboot.web.inter;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.details.Details;

public interface OwnerRepo extends MongoRepository<Details, Integer> {

    void deleteById(Details user);
}
