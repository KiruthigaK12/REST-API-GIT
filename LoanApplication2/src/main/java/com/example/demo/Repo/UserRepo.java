package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LoanModel;

public interface UserRepo extends JpaRepository<LoanModel, Integer> {

}
