package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	//@Autowired
	
	@GetMapping("name")
	public String name()
	{
		return "Hey Shankar how are you doing??????? yup i am doing Good.....";
	}
	
	

}
