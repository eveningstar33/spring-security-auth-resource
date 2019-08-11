package com.dgs.springsecurityresrouceserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// The resource server has the purpose to expose resources. The resources are usually these endpoints that
// you'll call from outside and you need to get authorized on calling them.

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "HELLO";
	}
	
}
