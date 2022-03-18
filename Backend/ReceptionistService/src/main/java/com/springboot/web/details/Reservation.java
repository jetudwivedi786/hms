package com.springboot.web.details;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "reservationManagement")
@Data
public class Reservation {

    @Id
    private int roomNo;
    private int noOfChildren;
    private int noOfAdult;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String status;
    private int numberOfNight;

}
