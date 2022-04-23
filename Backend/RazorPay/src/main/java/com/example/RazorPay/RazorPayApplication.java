package com.example.RazorPay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RazorPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RazorPayApplication.class, args);
		System.out.println("payment..........");
	}

}
