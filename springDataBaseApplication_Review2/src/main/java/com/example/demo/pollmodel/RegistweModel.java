package com.example.demo.pollmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="register")
public class RegistweModel {
	@Id
	    private    int id;
	    private  String  username;
		private  String  email;
		private  String  password;
		private  String  conformpassword;
		private  String  dob;
		private  String  gender;
		private  String  address;
		private  String  phoneno;
		private  String  idproof;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConformpassword() {
			return conformpassword;
		}
		public void setConformpassword(String conformpassword) {
			this.conformpassword = conformpassword;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}
		public String getIdproof() {
			return idproof;
		}
		public void setIdproof(String idproof) {
			this.idproof = idproof;
		}
		
		
		
}