package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeAddress {
    private Long houseNo;
    private String area;
    private String city;
    private String state;
    private Long pin;
}
