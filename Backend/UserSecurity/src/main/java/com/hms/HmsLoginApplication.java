package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class HmsLoginApplication {

	public static void main(String[] args) {

		SpringApplication.run(HmsLoginApplication.class, args);
	}

}
