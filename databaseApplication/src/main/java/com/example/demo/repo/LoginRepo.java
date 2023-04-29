package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day5.Usermodel;

public interface LoginRepo extends JpaRepository<Usermodel, Integer> {
	Usermodel findByusrname(String usrname);
	

}
