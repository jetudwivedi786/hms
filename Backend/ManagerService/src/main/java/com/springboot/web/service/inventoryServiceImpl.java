package com.springboot.web.service;

import com.springboot.web.details.InventoryDetails;
import com.springboot.web.details.roomDetails;
import com.springboot.web.inter.inventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class inventoryServiceImpl implements inventoryService{

    @Autowired
    private inventoryRepo inventoryrepo;

    @Override
    public Object getAllRooms() {
        return this.inventoryrepo.findAll();
    }

    @Override
    public InventoryDetails addInventry(InventoryDetails inventoryDetails) {
        return this.inventoryrepo.save(inventoryDetails);
    }

    @Override
    public InventoryDetails updateInventory(InventoryDetails inventoryDetails) {
        return this.inventoryrepo.save(inventoryDetails);
    }

    @Override
    public void deleteInventory(Integer id) {
        this.inventoryrepo.deleteById(id);
    }


}
