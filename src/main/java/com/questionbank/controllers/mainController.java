package com.questionbank.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	
	@RequestMapping("/")
	public String sayHi() {
		return "Hi";
		
	}

}
