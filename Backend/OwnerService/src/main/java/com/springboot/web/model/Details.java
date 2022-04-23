package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "departmentManagement")

@NoArgsConstructor
@AllArgsConstructor
public class Details {

	@Id
	@Min(value=1,message = "id can not be negative or 0")
	private int id;

	@NotBlank(message = "department name required")
	private String departmentName;

	@Min(value=9,message = "min length 2 required")
	private int noOfMember;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNoOfMember() {
		return noOfMember;
	}

	public void setNoOfMember(int noOfMember) {
		this.noOfMember = noOfMember;
	}
}
