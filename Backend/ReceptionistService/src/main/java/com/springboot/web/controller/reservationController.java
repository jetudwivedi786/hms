package com.springboot.web.controller;

import com.springboot.web.model.Reservation;
import com.springboot.web.service.reservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reservation")
public class reservationController {
//    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private reservationService reservationservice;

    @GetMapping("/getReservation")
    public ResponseEntity<?> getReserve()
    {

        return ResponseEntity.ok(this.reservationservice.getReserve());
    }
    @GetMapping("/getRoomById/{id}")
    public ResponseEntity<?> getRoomById(@PathVariable Integer id)
    {

        return ResponseEntity.ok(this.reservationservice.getRoomById(id));
    }
    @GetMapping("/getRoomByStatus")
    public ResponseEntity<?> getRoomByStatus()
    {

        return ResponseEntity.ok(this.reservationservice.getByStatus());
    }


    @PostMapping("/addReservation")
    public ResponseEntity<?> addGuest(@RequestBody Reservation detail) {
        Reservation save = this.reservationservice.addGuest(detail);
        return ResponseEntity.ok(save);
    }
    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation details){
        return this.reservationservice.updateReservation(details);
    }
    @DeleteMapping("/deleteReservation/{id}")
    public String deleteReservation(@PathVariable Integer id) {
        this.reservationservice.deleteReservation(id);
        return "deleted id is "+id;
    }

}
