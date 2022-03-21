package com.springboot.web.controller;

import com.springboot.web.model.InventoryDetails;
import com.springboot.web.service.inventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/inventory")
public class inventoryController {

    @Autowired
    private inventoryService inventoryService;


    @GetMapping("/getInventory")
    public ResponseEntity<?> getallroom() {
        return ResponseEntity.ok(this.inventoryService.getAllRooms());
    }
    @PostMapping("/addInventry")
    public InventoryDetails addInventry(@RequestBody InventoryDetails inventoryDetails) {
        return this.inventoryService.addInventry(inventoryDetails);

    }
    @PutMapping("/updateInventory")
    public InventoryDetails updateInventory(@RequestBody InventoryDetails inventoryDetails){
        return this.inventoryService.updateInventory(inventoryDetails);

    }
    @DeleteMapping("/deleteInventory/{id}")
    public String deleteInventory(@PathVariable Integer id) {
        this.inventoryService.deleteInventory(id);
        return "deleted id is "+id;
    }
}
