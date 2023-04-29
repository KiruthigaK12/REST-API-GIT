package com.example.demo.day5;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="car")
public class carModel {
	@Id
	private int cid;
	private String carname;
	private String carmodel;
	@Transient
	private int  year;
	private String color;
	private String bodystyle;
	private String milleage;
	private String price;
	private String enginesize;
	private String fueltype;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBodystyle() {
		return bodystyle;
	}
	public void setBodystyle(String bodystyle) {
		this.bodystyle = bodystyle;
	}
	public String getMilleage() {
		return milleage;
	}
	public void setMilleage(String milleage) {
		this.milleage = milleage;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEnginesize() {
		return enginesize;
	}
	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
	
	
	

}
