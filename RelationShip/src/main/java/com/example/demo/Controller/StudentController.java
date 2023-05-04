package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService sserv;
	@PostMapping("/poststudent")
	public Student add(@RequestBody Student smodel)
	{
		return sserv.addStudent(smodel);
	}
	@GetMapping("/getStudent")
	public List<Student> get()
	{
		return sserv.getStudent();
	}
	@PutMapping("/putStudent")
	public Student put(@RequestBody Student smodel)
	{
		return sserv.putData(smodel);
	}
	@DeleteMapping("/deleteStudent")
	public String delete(@RequestParam int id)
	{
		sserv.deletedata(id);
		return id+"deleted";
		
	}

}
