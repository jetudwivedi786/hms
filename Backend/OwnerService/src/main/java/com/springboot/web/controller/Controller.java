package com.springboot.web.controller;

import com.springboot.web.Service.ownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.details.Details;

@RestController
@RequestMapping("manageDepartment")
public class Controller {
	@Autowired
	private ownerService ownerservice;

	@PostMapping("/addDepartment")
	public ResponseEntity<?> addDepartment(@RequestBody Details detail) {
		Details save = this.ownerservice.addDepartment(detail);
		return ResponseEntity.ok(save);
	}

	@PutMapping("/updateDepartment")
	public ResponseEntity<?> updateDepartment(@RequestBody Details detail) {
		Details updateEntity = this.ownerservice.updateDepartment(detail);
		return ResponseEntity.ok(updateEntity);
	}

	@DeleteMapping("/deleteDepartment/{id}")
	public int deleteDepartment(@PathVariable Integer id) {
		this.ownerservice.deleteById(id);
		return id;
	}

	@GetMapping("/getDepartment")
	public ResponseEntity<?> getDepartment() {
		return ResponseEntity.ok(this.ownerservice.getDepartment());
	}
}
