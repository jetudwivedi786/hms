package com.springboot.web.service;

import com.springboot.web.model.InventoryDetails;

public interface inventoryService {


    Object getAllRooms();


    InventoryDetails addInventry(InventoryDetails inventoryDetails);

    InventoryDetails updateInventory(InventoryDetails inventoryDetails);

    void deleteInventory(Integer id);
}
