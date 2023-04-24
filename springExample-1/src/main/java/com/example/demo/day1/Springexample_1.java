package com.example.demo.day1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Springexample_1 {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hello()
	{
		return "Hello Spring boot";
	}
	

}
