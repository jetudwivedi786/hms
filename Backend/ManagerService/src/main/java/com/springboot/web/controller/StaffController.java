package com.springboot.web.controller;

import com.springboot.web.service.staffService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.model.staffDetails;
@OpenAPIDefinition
@RestController
@RequestMapping("manageStaff")
@CrossOrigin
public class StaffController {

	@Autowired
	private staffService staffservice;
Logger logger= LoggerFactory.getLogger(StaffController.class);

	@PostMapping("/add")
	public staffDetails addStaff(@RequestBody staffDetails detail) {
		return this.staffservice.addStaff(detail);

	}

	@PutMapping("/update")

	public staffDetails updateStaff(@RequestBody staffDetails detail)
	{
		return this.staffservice.updateStaff(detail);
	}

	@DeleteMapping("/delete/{id}")
	public int deleteStaff(@PathVariable Integer id) {
		this.staffservice.deleteById(id);
		return id;
	}

	@GetMapping("/get")
	public ResponseEntity<?> getstaff() {
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.debug("debug");
		logger.trace("trace");
		return ResponseEntity.ok(this.staffservice.getAllstaff());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getstaffbyid(@PathVariable Integer id) {

		return ResponseEntity.ok(this.staffservice.findById(id));
	}

}
