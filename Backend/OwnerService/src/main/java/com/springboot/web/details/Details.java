package com.springboot.web.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "departmentManagement")
@Data
public class Details {
	@Id
	private int id;
	private String departmentName;
	private int noOfMember;




}
