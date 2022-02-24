package com.springframework.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	
	@GetMapping("/welcome")
	public String showMessage() {
		return "Welcome to My hoem page";
	}

}
