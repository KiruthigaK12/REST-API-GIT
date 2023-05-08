package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pollmodel.UserModel;

public interface LoginRepo1 extends JpaRepository<UserModel, Integer> 
{
	UserModel findByusername(String email);

}
