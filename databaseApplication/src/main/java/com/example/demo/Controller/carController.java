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

import com.example.demo.day5.carModel;
import com.example.demo.repo.carRepository;
import com.example.demo.service.service;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class carController {
	@Autowired
	public service obj2;
	@Tag(name="post data",description="insertdetails")
	@PostMapping("/savecar1")                 
	public carModel addDetails(@RequestBody carModel obj3)
	{
		return obj2.saveInfo(obj3);
	
	}
	@GetMapping("/savecar")
	public List<carModel>getDetails()
	{
		return obj2.getInfo();
		
	}
	
	
	@PutMapping("/putCar")
	public carModel display(@RequestBody carModel obj4) 
	{	
		return obj2.UpdateInfo(obj4);
	}
	@DeleteMapping("/deleteCar/{cid}")
     public String deleteDetails(@PathVariable int cid)
     {
		obj2.deleteInfo(cid);
		return "cid "+cid+" deleted";
		
     }
	
	@DeleteMapping("/deleteByParam")
	public String deleteByparamas(@RequestParam("cid2") int cid)
	{
		obj2.deleteInfo(cid);
		return " cid number"+cid+"is deleted";
	}
	@GetMapping("/sortData/{pna}")
	public List<carModel> sortVote(@PathVariable("pna") String pvote)
	{
		return obj2.sortData(pvote);
	}
	//pagination
	
		@GetMapping("/pagination/{pageno}/{pagesize}")
		//pageno starts with 0
		
		public List<carModel> page(@PathVariable("pageno") int pageno,@PathVariable("pagesize") int pagesize){
			return obj2.pagination(pageno, pagesize);
		}
		//JPQL
		@Autowired
		
		public carRepository ir;
		@GetMapping("/hii")
		public List<carModel>getD()
		{
		    return ir.getAllData();
		}
		@GetMapping("/find/{id}")
		public List<carModel>getData(@PathVariable("id")int pid)
		{
			return ir.bycarName(pid);
		}
		@GetMapping("get1/{start}/{end}")
		public List<carModel>getStartEnd(@PathVariable("start") int start,@PathVariable("end") int end)
		{
			      return ir.byStartEnd(start, end);
	    }
		
	 @DeleteMapping("/dell/{id}/{name}")
	 public String deletecar(@PathVariable("id")int id,@PathVariable("name") String name)
	 {
		ir.deleteId(id, name);
		return "deleted";
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
