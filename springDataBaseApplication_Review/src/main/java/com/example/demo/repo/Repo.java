package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.poll.Poll;

public interface Repo extends JpaRepository<Poll, Integer> {

}
