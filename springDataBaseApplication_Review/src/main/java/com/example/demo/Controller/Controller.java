package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.PollService;
import com.example.demo.poll.Poll;


@RestController
public class Controller {
	@Autowired
	public PollService obj2;
	@PostMapping("/Post")                 
	public Poll addDetails(@RequestBody Poll obj3)
	{
		return obj2.saveInfo(obj3);
	
	}
	@GetMapping("/get")
	public List<Poll>getDetails()
	{
		return obj2.getInfo();
	}
	@PutMapping("/put")
	public Poll display(@RequestBody Poll obj4) 
	{	
		return obj2.UpdateInfo(obj4);
	}
	@DeleteMapping("/delete/{voteId}")
    public String deleteDetails(@PathVariable int voteId)
    {
		obj2.deleteInfo(voteId);
		return "cid "+voteId+" deleted";
    }
	@DeleteMapping("/deleteByParam")
	public String deleteByparamas(@RequestParam("voteId") int voteId)
	{
		obj2.deleteInfo(voteId);
		return " cid number"+voteId+"is deleted";
	}
	
		
	

}
