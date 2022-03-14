package com.springboot.web.details;

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

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Long getNumber() {
//		return number;
//	}
//
//	public void setNumber(Long number) {
//		this.number = number;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

}
