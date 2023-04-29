package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.example.demo.day5.carModel;

import jakarta.transaction.Transactional;

public interface carRepository extends JpaRepository<carModel,Integer> {

	@Query(value="select * from car",nativeQuery=true)
	public List<carModel> getAllData();
	@Query(value="select*from car where cid=:id",nativeQuery=true)
	public List<carModel>bycarName(@Param("id")int id);
	@Query(value="select*from car where cid between :start and :end",nativeQuery=true)
	public List<carModel>byStartEnd(@Param("start")int start,@Param("end")int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from car where cid=?1 and carname=?2",nativeQuery=true)
	Integer deleteId(@Param("id") int pid,@Param("name") String pname);
	
}
