package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.day5.carModel;

import com.example.demo.repo.carRepository;

@Service
public class service {
	@Autowired
	public carRepository obj;
	//Post
	public carModel saveInfo(carModel obj1)
	{
		return obj.save(obj1);
		
	}
	//Get
	public List<carModel> getInfo()
	{
		return obj.findAll();
	}
	//Put
	public carModel UpdateInfo(carModel in)
	{
	   return obj.saveAndFlush(in);
	}
	//Delete
	public void deleteInfo(int id)
	{
		obj.deleteById(id);
	}
	//sorting
	  public List<carModel> sortData(String p)
	  {
		  return obj.findAll(Sort.by(p).ascending());
	  }
	//pagination
		
     public List<carModel> pagination(int pageno,int pagesize){
	 Page<carModel> p =obj.findAll(PageRequest.of(pageno, pagesize));
	return p.getContent();					
	}

}
