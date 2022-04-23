package com.springboot.web.controller;

import com.springboot.web.model.Reservation;
import com.springboot.web.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationservice;



    @GetMapping("/getReservation")
    public List<Reservation> findAllUsers() {
        return reservationservice.getReserved();
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
    public ResponseEntity<?> addGuestDetail(@RequestBody Reservation detail) {
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
