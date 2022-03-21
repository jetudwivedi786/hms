package com.springboot.web.controller;

import com.springboot.web.Service.ownerService;
import com.springboot.web.model.roomDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.model.Details;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("manageDepartment")
public class Controller {
	@Autowired
	private ownerService ownerservice;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/addDepartment")
	public Details addDepartment(@RequestBody Details detail) {
		return ownerservice.addDepartment(detail);
	}

	@PutMapping("/updateDepartment")
	public ResponseEntity<?> updateDepartment(@RequestBody Details detail) {
		Details updateEntity = this.ownerservice.updateDepartment(detail);
		return ResponseEntity.ok(updateEntity);
	}

	@DeleteMapping("/deleteDepartment/{id}")
	public String deleteDepartment(@PathVariable Integer id) {
		ownerservice.deleteDepartment(id);
		return ("id "+id);


	}

	@GetMapping("/getDepartment")
	public List<Details> findAllUsers() {
		return ownerservice.getUsers();
	}


	@GetMapping("/getRoomOfManager")
	public List<roomDetails> getPayment() {
		return Arrays.asList(restTemplate.getForObject("http://manager-service/manageRoom/getrooms", roomDetails[].class));
	}


}

//	@GetMapping("/getDepartment")
//	public ResponseEntity<?> getDepartment() {
//		return ResponseEntity.ok(this.ownerservice.getDepartment());
//	}
//}
