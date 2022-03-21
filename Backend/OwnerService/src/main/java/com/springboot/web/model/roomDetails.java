package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class roomDetails {
@Id
    private int roomnumber;
    private Double roomprice;
    private String roomtype;
    private String roomstatus;


}
