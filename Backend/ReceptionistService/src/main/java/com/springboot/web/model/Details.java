package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "guestManagement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Details {
	@Id
	private int id;
	private String memberCode;
	private Long phoneNumber;
	private String company;
	private String name;
	private String email;
	private String gender;
	private String address;


}
