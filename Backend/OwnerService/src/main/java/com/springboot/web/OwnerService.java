package com.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OwnerService {

	public static void main(String[] args) {
		SpringApplication.run(OwnerService.class, args);
		System.out.println("owner-Service running------------------------------------");

	}

}
