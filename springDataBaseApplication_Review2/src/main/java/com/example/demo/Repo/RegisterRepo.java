package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pollmodel.RegistweModel;

public interface RegisterRepo extends JpaRepository<RegistweModel, Integer> {
	 RegistweModel findByusername(String username);


}

