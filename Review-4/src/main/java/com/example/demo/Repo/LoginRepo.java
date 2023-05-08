package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LoginModel;
import com.example.demo.Model.UserModel;


public interface LoginRepo extends JpaRepository<LoginModel,String>
{
	
}
