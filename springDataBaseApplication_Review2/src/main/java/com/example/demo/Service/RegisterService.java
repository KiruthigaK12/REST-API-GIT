package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.RegisterRepo;
import com.example.demo.pollmodel.RegistweModel;
@Service
public class RegisterService {
	@Autowired
	public RegisterRepo obj;
	
	public String checkLogin(String username,String password)
	{
	RegistweModel user= obj.findByusername(username);
	if(user==null)
	{
		return "No register user  found";
	}
	else
	{
		if(user.getPassword().equals(password))
		{
			return "Registration  Succesful";
		}
		else
		{
			return "Registration Failed";
		}
	}
	
} 
	public RegistweModel adddetails(RegistweModel obj1)
	{
		return obj.save(obj1);
	}
	public List<RegistweModel> getUser1()
	{
	  return obj.findAll();
	}

}
