package com.springboot.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.web.model.Details;

public interface OwnerRepo extends MongoRepository<Details, Integer> {

    void deleteById(Details user);
}
