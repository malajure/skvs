package com.skvs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

class TestController {

	@GetMapping("/test2")
	public String test2() {
		return "test2";
	}
}
