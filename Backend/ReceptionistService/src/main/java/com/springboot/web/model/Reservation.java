package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;

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

//    public Reservation(int i, int i1, int i2, String s, String s1, String abc, ArrayList<Address> addresses) {
//    }
}
