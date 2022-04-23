package com.hms.model;

import javax.validation.constraints.NotBlank;

public class AuthenticationRequest {
	@NotBlank(message = "UserName required")
	private String username;
	@NotBlank(message = "Password required")
	private String password;
	private  String role;

	public AuthenticationRequest(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public AuthenticationRequest() {

	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}




}
