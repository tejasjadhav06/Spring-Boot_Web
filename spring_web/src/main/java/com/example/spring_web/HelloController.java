package com.example.spring_web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String greet() {
		return "Welcome to the World of Programming";
	}
}
