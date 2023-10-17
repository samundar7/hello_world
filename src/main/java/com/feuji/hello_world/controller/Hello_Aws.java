package com.feuji.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class Hello_Aws {
	
	
	@GetMapping("/hello")
	public String helloAws() {
		return "Hello AWS";
	}

}
