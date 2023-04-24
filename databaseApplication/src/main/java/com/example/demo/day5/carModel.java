package com.example.demo.day5;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")
public class carModel {
	@Id
	@Column
	
	private int cid;
	private String employeename;
	private String empname;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) 
	{
		this.employeename = employeename;
		
	}
	
	
	
	

}
