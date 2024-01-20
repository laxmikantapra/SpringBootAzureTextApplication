package com.ashockit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstDemoProApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "welcome to spring boot application ";
	}


	public static void main(String[] args) {
		SpringApplication.run(FirstDemoProApplication.class, args);
	}

}
