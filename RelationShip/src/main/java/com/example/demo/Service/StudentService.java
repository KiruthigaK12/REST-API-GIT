package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	public StudentRepo srepo;
	public Student addStudent(Student smodel)
	{
		return srepo.save(smodel);
	}
	public List<Student> getStudent()
	{
		return srepo.findAll();
	}
	public Student putData(Student smodel)
	{
		return srepo.saveAndFlush(smodel);
	}
   public void deletedata(int studentid)
   {
	   srepo.deleteById(studentid);
   }
	
	
}
