package com.example.demo.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Springexample_2 {
	@Value("${car}")
	public String car;
	@GetMapping("/mycar")
	@ResponseBody
	public String car()
	{
		
		return "My favourite car "+car;
	}
	

}
