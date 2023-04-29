package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pollmodel.Poll_Model;

public interface poll_repo extends JpaRepository<Poll_Model, Integer>{

}
