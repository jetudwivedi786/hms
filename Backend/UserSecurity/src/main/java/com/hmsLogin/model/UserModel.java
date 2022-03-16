package com.hmsLogin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@Document(collection="USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	
	
	@Id
	private String id;
	private String username;
	private String password;
	private String name;



}
