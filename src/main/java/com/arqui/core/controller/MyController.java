package com.arqui.core.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MyController {

	@GetMapping("/micro-service")
	public String getMethod() {
		return "get method!";
	}
	
	@PostMapping("/micro-service")
	public String postMethod() {
		return "post method!";
	}
	
	@PutMapping("micro-service")
	public String putMethod() {
		return "put method!";
	}
	
	@DeleteMapping("micro-service")
	public String deleteMethod() {
		return "delete method!";
	}
}
