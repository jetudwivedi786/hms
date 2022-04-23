package com.springboot.web.controller;
import com.springboot.web.model.roomDetails;
import com.springboot.web.repository.RoomRepo;
import com.springboot.web.service.roomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/manageRoom")
public class RoomController {
    @Autowired
    private roomService roomservice;
    @Autowired
    private RoomRepo roomrepo;



@GetMapping("/getroombyid/{id}")
public ResponseEntity<?> getroombyid(@PathVariable Integer id) {
    return ResponseEntity.ok(this.roomservice.getbyid(id));
}




    @GetMapping("/getrooms")
    public List<roomDetails> getallroom() {
        return this.roomservice.getAlRooms();
    }
    @PostMapping("/addrooms")
    public roomDetails addrooms(@RequestBody roomDetails roomdetails) {
        return this.roomservice.addrooms(roomdetails);

    }
    @PutMapping("/updaterooms")
    public roomDetails updaterooms(@RequestBody roomDetails roomDetails){
        return this.roomservice.updaterooms(roomDetails);

    }
    @DeleteMapping("/deleterooms/{roomnumber}")
    public int deleterooms(@PathVariable Integer roomnumber) {
        this.roomservice.deleteById(roomnumber);
        return  roomnumber ;
    }
}

