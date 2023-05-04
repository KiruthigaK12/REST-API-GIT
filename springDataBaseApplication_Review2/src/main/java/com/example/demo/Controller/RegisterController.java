package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.RegisterService;
import com.example.demo.pollmodel.RegistweModel;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
public class RegisterController {
	@Autowired
	public RegisterService obj2;
	
	@PostMapping("/register1")
	public RegistweModel add( @RequestBody  RegistweModel obj3)
	{
		return obj2.adddetails(obj3);
	}
	//To log in:
	  @Tag(name="To post ",description="To Register ")
		@PostMapping("/register")
		public String login(@RequestBody Map<String,String>loginData)
		{
			String username=loginData.get("username");
			String password=loginData.get("password");
			String result=obj2.checkLogin(username,password);
			return result;
		}
	//To add users
		@Tag(name="Post for Register",description="To insert the details  in register")
		@PostMapping("/add1")
		public RegistweModel AddUser(@RequestBody RegistweModel cl)
		{
			return obj2.adddetails(cl);
		}
 
		@GetMapping
		public List<RegistweModel> listAll()
		{
			return obj2.getUser1();
		}
	
	

}
