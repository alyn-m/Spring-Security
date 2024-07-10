package com.security.basic.resouces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {
	
	@GetMapping("/test")
	public String test() {
		return "This is Test resource.";
	}
	
}
