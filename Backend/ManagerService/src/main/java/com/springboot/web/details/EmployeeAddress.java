package com.springboot.web.details;

import lombok.Data;

@Data
public class EmployeeAddress {
    private Long houseNo;
    private String area;
    private String city;
    private String state;
    private Long pin;
}