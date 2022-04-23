package com.springboot.web.controller;

import com.springboot.web.service.OwnerService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.model.Details;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;
@OpenAPIDefinition
@RestController
@RequestMapping("manageDepartment")
public class Controller {

	Logger logger= LoggerFactory.getLogger(Controller.class);
	@Autowired
	private OwnerService ownerservice;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/addDepartment")
	public Details addDepartment(@Valid  @RequestBody Details detail)
	{
		System.out.println(detail);
		return ownerservice.addDepartment(detail);
	}

	@PutMapping("/updateDepartment")
	public ResponseEntity<Details> updateDepartment(@Valid @RequestBody Details detail) {
		Details updateEntity = this.ownerservice.updateDepartment(detail);
		return ResponseEntity.ok(updateEntity);
	}

	@DeleteMapping("/deleteDepartment/{id}")
	public void deleteDepartment(@PathVariable Integer id) {
		ownerservice.deleteDepartment(id);
	}

	@GetMapping("/getDepartment")
	public List<Details> findAllUsers() {
		List<Details> det=ownerservice.getUsers();
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.debug("debug");
		logger.trace("trace");
		return det;
	}





}
