package com.springboot.web.details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roomManagement")
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
