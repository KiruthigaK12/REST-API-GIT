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
import com.example.demo.Service.service;
import com.example.demo.pollmodel.Poll_Model;


@RestController
public class PollController {
	@Autowired
	public service obj2;
	@PostMapping("/Post1")                 
	public Poll_Model addDetails(@RequestBody Poll_Model obj3)
	{
		return obj2.saveInfo(obj3);
	
	}
	@GetMapping("/get1")
	public List<Poll_Model>getDetails()
	{
		return obj2.getInfo();
	}
	@PutMapping("/put1")
	public Poll_Model display(@RequestBody Poll_Model obj4) 
	{	
		return obj2.UpdateInfo(obj4);
	}
	@DeleteMapping("/delete1/{voteId}")
    public String deleteDetails(@PathVariable int voteId)
    {
		obj2.deleteInfo(voteId);
		return "cid "+voteId+" deleted";
    }
	@DeleteMapping("/delete1ByParam")
	public String deleteByparamas(@RequestParam("voteId") int voteId)
	{
		obj2.deleteInfo(voteId);
		return " cid number"+voteId+"is deleted";
		
	}
	@GetMapping("/sortData1/{pna}")
	public List<Poll_Model> sortVote(@PathVariable("pna") String pvote)
	{
		return obj2.sortData(pvote);
	}
	//pagination
	
	@GetMapping("/pagination1/{pageno}/{pagesize}")
	//pageno starts with 0
	
	public List<Poll_Model> page(@PathVariable("pageno") int pageno,@PathVariable("pagesize") int pagesize)
	{
	return obj2.pagination(pageno, pagesize);
	}
	
	
	
	
		

}
