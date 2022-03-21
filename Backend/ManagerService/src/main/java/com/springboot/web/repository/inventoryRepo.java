package com.springboot.web.repository;

import com.springboot.web.model.InventoryDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inventoryRepo extends MongoRepository<InventoryDetails,Integer> {


}
