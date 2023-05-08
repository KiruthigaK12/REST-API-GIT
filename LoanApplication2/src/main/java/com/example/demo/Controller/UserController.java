package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.LoanModel;
import com.example.demo.Repo.UserRepo;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	public UserRepo userRepository;
	 @PostMapping("/user")
	   LoanModel newUser(@RequestBody LoanModel newUser) {
	        return userRepository.save(newUser);
	    }

	    @GetMapping("/users")
	    List<LoanModel> getAllUsers() {
	        return userRepository.findAll();
	    }
	   @GetMapping("/user/{id}")
       Optional<LoanModel> getUserById(@PathVariable int id)
       {
		   
		   return userRepository.findById(id);
				  
       }
	   @PutMapping("/user1/{id}")
	    LoanModel updateUser(@PathVariable int id,@RequestBody LoanModel umodel) {
	        return userRepository.saveAndFlush(umodel);
	                
	    }
	   @DeleteMapping("/delete/{id}")
	    String deleteuser(@PathVariable int id) {
		    userRepository.deleteById(id);
		    return "User with id "+id+" has been deleted successfully";
	   }
}

