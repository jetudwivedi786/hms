package com.springboot.web.controller;
import com.springboot.web.details.roomDetails;
import com.springboot.web.details.staffDetails;
import com.springboot.web.inter.roomRepo;
import com.springboot.web.service.roomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/manageRoom")
public class roomController {
    @Autowired
    private roomService roomservice;
    @Autowired
    private roomRepo roomrepo;


//@GetMapping("/getroomsbystatus/{roomstatus}")
//public ResponseEntity<?> getroomsbystatus(@PathVariable String roomstatus) {
//    return ResponseEntity.ok(this.roomrepo.findByName(roomstatus));
//}
@GetMapping("/getroombyid/{id}")
public ResponseEntity<?> getroombyid(@PathVariable Integer id) {
    return ResponseEntity.ok(this.roomservice.getbyid(id));
}
//



    @GetMapping("/getrooms")
    public ResponseEntity<?> getallroom() {
        return ResponseEntity.ok(this.roomservice.getAllRooms());
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

