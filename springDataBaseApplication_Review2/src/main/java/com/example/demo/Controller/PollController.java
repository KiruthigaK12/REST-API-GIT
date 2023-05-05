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
import com.example.demo.Repo.poll_repo;
import com.example.demo.Service.service;
import com.example.demo.pollmodel.Poll_Model;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class PollController {
	@Autowired
	public service obj2;
	@Tag(name="Post",description="To add user")
	@PostMapping("/Post1")                 
	public Poll_Model addDetails(@RequestBody Poll_Model obj3)
	{
		return obj2.saveInfo(obj3);
	
	}
	@Tag(name="Get",description="To reterive the details")
	@GetMapping("/get1")
	public List<Poll_Model>getDetails()
	{
		return obj2.getInfo();
	}
	@Tag(name="Put",description="To reterive thr deteils")
	@PutMapping("/put1")
	public Poll_Model display(@RequestBody Poll_Model obj4) 
	{	
		return obj2.UpdateInfo(obj4);
	}
	@Tag(name="Delete",description="To delete the records")
	@DeleteMapping("/delete1/{voteId}")
    public String deleteDetails(@PathVariable int voteId)
    {
		obj2.deleteInfo(voteId);
		return "cid "+voteId+" deleted";
    }
	@Tag(name="Delete",description="By requestparams")
	@DeleteMapping("/delete1ByParam")
	public String deleteByparamas(@RequestParam("voteId") int voteId)
	{
		obj2.deleteInfo(voteId);
		return " cid number"+voteId+"is deleted";
		
	}
	@Tag(name="Sorting",description="To sort the details")
	@GetMapping("/sortData1/{pna}")
	public List<Poll_Model> sortVote(@PathVariable("pna") String pvote)
	{
		return obj2.sortData(pvote);
	}
	//pagination
	@Tag(name="Pagination",description="To paginate the given page")
	@GetMapping("/pagination1/{pageno}/{pagesize}")
	//pageno starts with 0
	
	public List<Poll_Model> page(@PathVariable("pageno") int pageno,@PathVariable("pagesize") int pagesize)
	{
	return obj2.pagination(pageno, pagesize);
	}
	@Tag(name="Pagination and Sorting operations",description="Both Pagination and Sorting in same method")
	@GetMapping("/paginationsort/{pno}/{psize}/{pname}")
	
		public List<Poll_Model>pagingAndSorting(@PathVariable("pno")int pno,@PathVariable("psize")int psize,@PathVariable("pname")String pname)
		{
			return obj2.paginationAndSorting(pno, psize, pname);
		}
		
		
	//NATIVE QUERY1
		@Autowired
	    public poll_repo obj3;
		@Tag(name="nativequery1",description="To find the totalvotes with minimum")
		@GetMapping("/query1/{tvotes}")
		public List<Poll_Model>getData(@PathVariable("tvotes") int pid)
		{
			return obj3.getVotewithminPrice(pid);
		}
		
		
		
		@PutMapping("updatee/{pid}/{pname}")
		public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
		{
		obj3.updateByQuery(pid, pname);
		}
		@Tag(name="nativequery2",description="To do like operation with voterlocation eg:like pollachi")
        @GetMapping("/locationlike/{voter_location}")
        public List<Poll_Model>getLike(@PathVariable String voter_location)
        {
        	return obj2.readLine1Contains(voter_location);
        }
        @Tag(name="nativequery3",description="to delete")
        @DeleteMapping("/del/{id}/{name}")
        public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
        {
        	obj3.deleteD(id, name);
        	return "deleted";
        }
       
        @Tag(name="JPQL",description="by select ")
        @GetMapping("jp")
        public List <Poll_Model> jpqlQuery()
        {
        	return obj3.jpqlQ();
        }
        @Tag(name="JPQL",description="by select using where condition")
        @GetMapping("/upp/{id}")
        public List<Poll_Model> jpqUp(@PathVariable("id") int id)
        {
        	return obj3.jqBYCon(id);
        }

		
		
		
	
	
	
	
	
		

}
