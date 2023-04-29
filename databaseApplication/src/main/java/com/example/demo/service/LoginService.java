package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day5.Usermodel;
import com.example.demo.repo.LoginRepo;
@Service
public class LoginService {
	@Autowired
  public LoginRepo obj;
	public String checkLogin(String usrname,String psword)
	{
	Usermodel user= obj.findByusrname(usrname);
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPsword().equals(psword))
		{
			return "Login Succesfull";
		}
		else
		{
			return "Login Failed";
		}
	}
	
} 
	public String resetPassword(String usrname, String Psword, String newPsword)
	{
		Usermodel user = obj.findByusrname(usrname);
		
		if(user == null)
		{
			return "No user found";
		}
		
		if(!user.getPsword().equals(Psword))
		{
			return "Old password is incorrect";
		}
		
		user.setPsword(newPsword);
		obj.save(user);
		
		return "Password reset successful";
	}
	public List<Usermodel> getUser1()
	{
		return obj.findAll();
	}
public Usermodel addUser(Usermodel cl)
{
	return obj.save(cl);
}
public List<Usermodel> getUser()
{
	return obj.findAll();
}
}
