package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/world")
	public String helloWorld(){
		return "Hello World";
		
	}
	
	@RequestMapping("/{name}")
	public String helloName(@PathVariable String name){
		return "Hello " + name;
	}
	
	
}
