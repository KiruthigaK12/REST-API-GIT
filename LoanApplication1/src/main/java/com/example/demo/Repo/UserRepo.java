package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

}
