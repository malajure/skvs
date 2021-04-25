package com.skvs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.skvs.DTO.UserRegistrationDto;

@Controller
public class ViewController {

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}

	@GetMapping("/home")
	public String getHome() {
		return "Home";
	}

	// Registration Page
	@GetMapping("/registration")
	public String showRegistrationPage() {
		return "Registration";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "Login";
	}
}
