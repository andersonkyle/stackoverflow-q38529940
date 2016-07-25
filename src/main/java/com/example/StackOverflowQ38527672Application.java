package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StackOverflowQ38527672Application {

	public static void main(String[] args) {
		SpringApplication.run(StackOverflowQ38527672Application.class, args);
	}
}

@RestController
class DefaultController {
	@RequestMapping("/hello")
	public String rest(){
		return "Hello World";
	}
}