package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
 info =@Info(
		title = "OneToMany Relationship",
	version = "1.1.2",
	description ="Execution of Relationship in JPA",
	contact = @Contact
	       (
			name = "Kiruthiga K",
			email = "kir@max.io"
		)
	)
)
public class RelationShip1OneToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationShip1OneToManyApplication.class, args);
	}

}
