package com.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ManagerServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerServiceAppApplication.class, args);
		System.out.println("Manager-Service running------------------------------------");

	}

}
