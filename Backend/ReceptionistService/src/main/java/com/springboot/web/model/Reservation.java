package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "reservationManagement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    private int roomNo;
    private int noOfChildren;
    private int noOfAdult;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String status;
    private PaymentDetails paymentDetails;


}
