package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.LoginRepo1;
import com.example.demo.pollmodel.UserModel;


@Service
public class LoginService {
	@Autowired
	  public LoginRepo1 obj;
		public String checkLogin(String username,String password)
		{
		UserModel user= obj.findByusername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Succesful";
			}
			else
			{
				return "Login Failed";
			}
		}
		
	} 
		public String resetPassword(String username, String Password, String newPassword)
		{
			UserModel user = obj.findByusername(username);
			
			if(user == null)
			{
				return "No user found";
			}
			
			if(!user.getPassword().equals(Password))
			{
				return "Old password is incorrect";
			}
			
			user.setPassword(newPassword);
			obj.save(user);
			
			return "Password reset successful";
		}
	  public List<UserModel> getUser1()
	  {
	  return obj.findAll();
	  }
	  public UserModel addUser(UserModel cl)
	  {
		return obj.save(cl);
	  }
	 public List<UserModel> getUser()
	 {
		return obj.findAll();
	  }
	

  
}



