package com.springboot.web.inter;

import com.springboot.web.details.InventoryDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inventoryRepo extends MongoRepository<InventoryDetails,Integer> {


}
