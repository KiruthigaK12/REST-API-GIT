package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Users;
import com.example.demo.Repo.UserRepo;

@RestController
@CrossOrigin("http://localhost:3002")
public class UserController {
	@Autowired
	public UserRepo obj;
	@PostMapping("/user")
	public Users newUser(@RequestBody Users newUser )
	{
		return obj.save(newUser);
	}
	    
	@GetMapping("/users")
	public List<Users>getAllUser()
	{
		return obj.findAll();
	}

}
