package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day5.Usermodel;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/userr")
public class LoginController {
	@Autowired
	private LoginService lser;
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String usrname=loginData.get("usrname");
		String psword=loginData.get("psword");
		String result=lser.checkLogin(usrname,psword);
		return result;
	}
	@PostMapping("/addu")
	public Usermodel AddUser(@RequestBody Usermodel cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping
	public List<Usermodel> listAll()
	{
		return lser.getUser();
	}
	@PostMapping("/reset")
	public String resetPassword(@RequestBody Map<String,String> resetData)
	{
		String usrname = resetData.get("usrname");
		String Psword = resetData.get("Psword");
		String newPsword = resetData.get("newPsword");
		
		String result = lser.resetPassword(usrname, Psword, newPsword);
		
		return result;
	}
	
	
	
	

}
