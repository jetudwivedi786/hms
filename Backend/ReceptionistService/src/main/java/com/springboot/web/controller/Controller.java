package com.springboot.web.controller;

import com.springboot.web.service.guestService;
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
import com.springboot.web.inter.contactRepo;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("manageGuest")
public class Controller {
	@Autowired
	private guestService guestservice;

	@PostMapping("/add")
	public ResponseEntity<?> addGuest(@RequestBody Details detail) {
		Details save = this.guestservice.save(detail);
		return ResponseEntity.ok(save);
	}

//	@PutMapping("/update")
//	public ResponseEntity<?> updateGuest(@RequestBody Details detail) {
//		Details updateEntity = this.contactrepo.save(detail);
//		return ResponseEntity.ok(updateEntity);
//	}
	@PutMapping("/update")
	public Details updateGusest(@RequestBody Details details){
		return this.guestservice.updateGuest(details);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteGuest(@PathVariable Integer id) {
		this.guestservice.deleteById(id);
		return ("Deleted id is :"+id);
	}
//
//	@GetMapping("/get")
//	public ResponseEntity<?> getAllGuest() {
//		return ResponseEntity.ok(this.contactrepo.findAll());
//	}

	@GetMapping("/get")
	public ResponseEntity<?> getAllGuest(){
		return ResponseEntity.ok(this.guestservice.getAllGuest());
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getById(@PathVariable Details id){
		return ResponseEntity.ok(this.guestservice.getById(id));
	}

}
