package com.hmsLogin.controller;

import com.hmsLogin.model.AuthenticationRequest;
import com.hmsLogin.model.AuthenticationResponse;
import com.hmsLogin.model.UserModel;
import com.hmsLogin.services.UserServices;
import com.hmsLogin.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import com.hmsLogin.repository.UserRepository;

@RestController
@CrossOrigin
public class AuthController {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserServices userServices;

	@Autowired
	private JwtUtils jwtUtils;

	@GetMapping("/dashboard")
	private String testingToken() {
		return "Welcome to DASHBOARD "+ SecurityContextHolder.getContext().getAuthentication().getName();
	}

	//to add new user
	@PostMapping("/subs")
	private ResponseEntity<?> subscribeClient(@RequestBody AuthenticationRequest authenticationRequest){
		String username=authenticationRequest.getUsername();
		String password=authenticationRequest.getPassword();
		UserModel userModel=new UserModel();
		userModel.setUsername(username);
		userModel.setPassword(password);
		try {
			userRepository.save(userModel);
		}
		catch(Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error during subscription for client "+ username));
		}
		return ResponseEntity.ok(new AuthenticationResponse("Successful subscription for client "+ username));

	}

	//to authenticate existing user
	@PostMapping("/auth")
	private ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authenticationRequest){
		String username=authenticationRequest.getUsername();
		String password=authenticationRequest.getPassword();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}
		catch(Exception E) {
			return ResponseEntity.ok(new AuthenticationResponse(null));

		}
		UserDetails loadeduser=userServices.loadUserByUsername(username);
		String generatedToken=jwtUtils.generateToken(loadeduser);

		return ResponseEntity.ok(new AuthenticationResponse(generatedToken));

	}

}
