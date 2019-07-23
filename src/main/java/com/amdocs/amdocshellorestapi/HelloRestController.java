package com.amdocs.amdocshellorestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@GetMapping("Hello")
	public String sayHello() {
		return "Hello vikas in rest api !";
	}
}
