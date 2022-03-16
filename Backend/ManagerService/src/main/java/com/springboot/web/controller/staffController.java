package com.springboot.web.controller;

import com.springboot.web.service.staffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.details.staffDetails;
import com.springboot.web.inter.staffRepo;

@RestController
@RequestMapping("manageStaff")
@CrossOrigin
public class staffController {

	@Autowired
	private staffService staffservice;

	@PostMapping("/add")
	public staffDetails addStaff(@RequestBody staffDetails detail) {
//		staffDetails save = this.repo.save(detail);
		return this.staffservice.addStaff(detail);

	}

	@PutMapping("/update")
//	public ResponseEntity<?> updateStaff(@RequestBody staffDetails detail) {
//		staffDetails updateEntity = this.repo.save(detail);
//		return ResponseEntity.ok(updateEntity);
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
		return ResponseEntity.ok(this.staffservice.getAllstaff());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getstaffbyid(@PathVariable Integer id) {
		return ResponseEntity.ok(this.staffservice.findById(id));
	}
//	@GetMapping("/getname/{name}")
//	public ResponseEntity<?> getstaffbyname(@PathVariable String name) {
//		return ResponseEntity.ok(this.staffservice.findByname(name));
//	}
}
