package com.springboot.web.controller;

import com.springboot.web.Service.ownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.details.Details;

import java.util.List;

@RestController
@RequestMapping("manageDepartment")
public class Controller {
	@Autowired
	private ownerService ownerservice;

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
	public int deleteDepartment(@PathVariable Integer id) {
		ownerservice.deleteDepartment(id);
		return id;



	}

	@GetMapping("/getDepartment")
	public List<Details> findAllUsers() {
		return ownerservice.getUsers();
	}
}

//	@GetMapping("/getDepartment")
//	public ResponseEntity<?> getDepartment() {
//		return ResponseEntity.ok(this.ownerservice.getDepartment());
//	}
//}
