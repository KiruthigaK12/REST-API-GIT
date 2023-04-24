package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.day3.Springexample_3;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringExample1Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(SpringExample1Application.class, args);
		Springexample_3 obj=new  Springexample_3(1,"kir","20");
		ObjectMapper o=new ObjectMapper();
		String json=o.writeValueAsString(obj);
		System.out.print(json);
	}

}
