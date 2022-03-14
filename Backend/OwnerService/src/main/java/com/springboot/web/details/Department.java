package com.springboot.web.details;

import lombok.Data;

@Data
public class Department {
    private String name;
    private Long mobileNumber;
    private String email;
    private Address address;
}
