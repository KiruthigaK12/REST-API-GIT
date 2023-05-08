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
import com.example.demo.Service.QuestionService;
import com.example.demo.pollmodel.Question;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class QuestionController {

	@Autowired
	public QuestionService obj1;
	@Tag(name="Post",description=" posting in onetomany")
	@PostMapping("/poststudent")
	public Question add(@RequestBody Question smodel)
	{
		return obj1.addStudent(smodel);
	}
	@Tag(name="get",description="Reteriving in onetomany")
	@GetMapping("/getStudent")
	public List<Question> get()
	{
		return obj1.getStudent();
	}
	@Tag(name="Put",description=" Updating in onetomany")
	@PutMapping("/putStudent")
	public Question put(@RequestBody Question smodel)
	{
		return obj1.putData(smodel);
	}
	@Tag(name="Deleting",description="deleting in onetomany")
	@DeleteMapping("/deleteStudent")
	public String delete(@RequestParam int id)
	{
		obj1.deletedata(id);
		return id+"deleted";
		
	}
}
