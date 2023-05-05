package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repo.QuestionRepo;
import com.example.demo.pollmodel.Question;

@Service
public class QuestionService {
	@Autowired
	public QuestionRepo obj;
	public Question addStudent(Question smodel)
	{
		return obj.save(smodel);
	}
	public List<Question>getStudent()
	{
		return obj.findAll();
	}
	public Question putData(Question smodel)
	{
		return obj.saveAndFlush(smodel);
	}
   public void deletedata(int studentid)
   {
	   obj.deleteById(studentid);
   }
	
	
	

}
