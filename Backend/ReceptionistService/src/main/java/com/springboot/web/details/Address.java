package com.springboot.web.details;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Data
public class Address {
    private String houseNo;
    private String city;
    private Long pin;
    private String state;
}
