package com.capgemini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Welcome";
	}
	
	@GetMapping("/spring")
	public String springBoot() {
		return "Welcomeeeeeeeeee";
	}

	@GetMapping("/hi")
	public String hiSpring() {
		return "Hi";
	}
}
