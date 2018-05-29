package com.springboot.examples.routingfiltering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
	
	@RequestMapping(value="/checked-out")
	public String checkout() {
		return "Spring Boot in Action";
	}
	
	@RequestMapping(value="/available")
	public String available() {
		return "Spring in Action";
	}
}
