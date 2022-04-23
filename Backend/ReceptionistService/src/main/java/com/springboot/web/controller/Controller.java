package com.springboot.web.controller;

import com.springboot.web.model.PaymentDetails;
import com.springboot.web.service.GuestService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
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

import com.springboot.web.model.Details;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@OpenAPIDefinition
@RestController
@RequestMapping("manageGuest")
public class Controller {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private GuestService guestservice;

	@PostMapping("/add")
	public ResponseEntity<?> addGues(@RequestBody Details detail) {
		Details save = this.guestservice.save(detail);
		return ResponseEntity.ok(save);
	}


	@PutMapping("/update")
	public ResponseEntity<?> updateGuest(@RequestBody Details detail){
		Details updateEntity = this.guestservice.updateGuest(detail);
		return ResponseEntity.ok(updateEntity);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteGuest(@PathVariable Integer id) {
		this.guestservice.deleteById(id);
		return ("Deleted id is :"+id);
	}



	@GetMapping("/get")
	public List<Details> getAllGuest() {
		return guestservice.getAlGuest();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getById(@PathVariable Details id){
		return ResponseEntity.ok(this.guestservice.getById(id));
	}



	@GetMapping("/getpayment")
	public List<PaymentDetails> getPayment(){
		return Arrays.asList(restTemplate.getForObject("http://payment-service/pay/getpayment", PaymentDetails[].class));
	}

}
