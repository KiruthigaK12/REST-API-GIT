package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pollmodel.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Integer> {

}
