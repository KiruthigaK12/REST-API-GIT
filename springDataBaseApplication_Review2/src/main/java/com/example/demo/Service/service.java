package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Repo.poll_repo;
import com.example.demo.pollmodel.Poll_Model;

@Service
public class service {
	@Autowired
	public poll_repo obj;
	//Post
		public Poll_Model saveInfo(@RequestBody Poll_Model obj1)
		{
			return obj.save(obj1);
			
		}
		//Get
		public List<Poll_Model> getInfo()
		{
			return obj.findAll();
		}
		//Put
		public Poll_Model UpdateInfo(Poll_Model in)
		{
		   return obj.saveAndFlush(in);
		}
		//Delete
		public void deleteInfo(int id)
		{
			obj.deleteById(id);
		}
		//sorting
		  public List<Poll_Model> sortData(String p)
		  {
			  return obj.findAll(Sort.by(p).ascending());
		  }
		//pagination
			
	     public List<Poll_Model> pagination(int pageno,int pagesize){
		 Page<Poll_Model> p =obj.findAll(PageRequest.of(pageno, pagesize));
		return p.getContent();					
		}
	     
	     //both pagination and sorting
	     public List<Poll_Model>paginationAndSorting(int pageno,int pagesize,String pname)
	     {
	    	 Page<Poll_Model>p=obj.findAll(PageRequest.of(pageno,pagesize,Sort.by(pname).descending()));
	    	 return p.getContent();
	     }
	     //NATIVE QUERY 3 LIKE OPERATOR
	     public List<Poll_Model>readLine1Contains(String addressLike){
	     
	    	 return obj.findByAddLineContains(addressLike);
	     }
	     //JPQL-1 DELETE QUERY
	    // @Transactional
	     //public int deletepollBytitle(String poll_title)
	     //{
	    	//return obj.deletepollBytitle(poll_title);
	    // }
	
	

}
