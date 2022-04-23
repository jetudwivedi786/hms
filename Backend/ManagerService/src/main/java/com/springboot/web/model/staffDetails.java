package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection = "staffManagement")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class staffDetails {
	@Id
	private int id;
	private String employeeName;
	private String employeeCode;
	private int age;
	private Long salary;
	private String email;
	private EmployeeAddress employeeAddress;





}
