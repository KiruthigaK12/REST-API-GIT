package com.example.demo.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.example.demo.pollmodel.Poll_Model;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface poll_repo extends JpaRepository<Poll_Model, Integer>{
	
	
	
	//NATIVE QUERY-1
    @Query(value="select * from poll1 WHERE voteID=:tvotes",nativeQuery=true)
	public List<Poll_Model> getVotewithminPrice(@RequestParam("tvotes") int tvotes);
	
	//NATIVE QUERY-2 UPDATE OPERATION
	@Modifying
    @Transactional
    @Query(value="update poll1 set voteID=:pid where poll_title=:pname",nativeQuery=true)
    public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
	
	
	//NATIVEQUERY -3  LIKE OPERATION
	@Query(value="select * from poll1 where voter_location like %:valueTocheck% ",nativeQuery=true)
	public List<Poll_Model> findByAddLineContains(@Param("valueTocheck") String valueTocheck);
	
	 
	
	
	 @Modifying
     @Transactional
     @Query(value="delete from poll1 where voteId=?1 and poll_title=?2",nativeQuery = true)
     Integer deleteD(@Param("id") int pid,@Param ("name") String pname);
	 
	 
	 @Modifying
	 @Transactional
	 @Query(value="select c from Poll_Model c")
	 List<Poll_Model> jpqlQ();
	 
	 @Modifying
	 @Transactional
	 @Query(value="select c from Poll_Model c where c.voteID=?1")
	 public List<Poll_Model> jqBYCon(@Param ("id") int sid);
	 //
	 } 
    



