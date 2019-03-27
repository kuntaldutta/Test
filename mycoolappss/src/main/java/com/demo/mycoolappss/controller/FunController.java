package com.demo.mycoolappss.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fun")
public class FunController {

	
	@Value("${coach.name}")
	private String CoachName;
	@GetMapping("/22")
	public String sayHello() {

		return "Hello World! Time in server is :" + LocalDateTime.now();
	}

	@GetMapping("/1")
	public String sayHello1() {

		return "Hello World!ef Time in server is :" + LocalDateTime.now();
	}

	@GetMapping("/2")

	public String sayHello2() {

		return "Hello in server is :" + LocalDateTime.now();
	}

	@GetMapping("/3") 
	public String sayHello3() {

		return "Hello"+ CoachName + " Time is :" + LocalDateTime.now();
	} 

}
