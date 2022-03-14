package com.springboot.web.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "guestManagement")
@Data
public class Details {
	@Id
	private int id;
	private String memberCode;
	private Long phoneNumber;
	private String company;
	private String name;
	private String email;
	private String gender;
	private Address address;



}
