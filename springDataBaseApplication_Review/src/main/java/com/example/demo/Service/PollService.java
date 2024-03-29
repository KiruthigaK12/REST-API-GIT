package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.poll.Poll;
import com.example.demo.repo.Repo;

@Service
public class PollService {
	@Autowired
	public Repo obj;
	//Post
		public Poll saveInfo(@RequestBody Poll obj1)
		{
			return obj.save(obj1);
			
		}
		//Get
		public List<Poll> getInfo()
		{
			return obj.findAll();
		}
		//Put
		public Poll UpdateInfo(Poll in)
		{
		   return obj.saveAndFlush(in);
		}
		//Delete
		public void deleteInfo(int id)
		{
			obj.deleteById(id);
		}
	
}
