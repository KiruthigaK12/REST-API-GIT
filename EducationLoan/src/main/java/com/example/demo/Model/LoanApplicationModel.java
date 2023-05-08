package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {
	@Id
	private int loanid;
	private String loantype;
	private String applicantname;
	private String applicantaddres;
	private String applicantmobile;
	private String applicantemail;
	private String applicantaadhar;
	private String applicantpan;
	private String applicantsalary;
	private String loanamountrequired;
	private String loanrepayementmethod;

	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantname() {
		return applicantname;
	}
	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}
	public String getApplicantaddres() {
		return applicantaddres;
	}
	public void setApplicantaddres(String applicantaddres) {
		this.applicantaddres = applicantaddres;
	}
	public String getApplicantmobile() {
		return applicantmobile;
	}
	public void setApplicantmobile(String applicantmobile) {
		this.applicantmobile = applicantmobile;
	}
	public String getApplicantemail() {
		return applicantemail;
	}
	public void setApplicantemail(String applicantemail) {
		this.applicantemail = applicantemail;
	}
	public String getApplicantaadhar() {
		return applicantaadhar;
	}
	public void setApplicantaadhar(String applicantaadhar) {
		this.applicantaadhar = applicantaadhar;
	}
	public String getApplicantpan() {
		return applicantpan;
	}
	public void setApplicantpan(String applicantpan) {
		this.applicantpan = applicantpan;
	}
	public String getApplicantsalary() {
		return applicantsalary;
	}
	public void setApplicantsalary(String applicantsalary) {
		this.applicantsalary = applicantsalary;
	}
	public String getLoanamountrequired() {
		return loanamountrequired;
	}
	public void setLoanamountrequired(String loanamountrequired) {
		this.loanamountrequired = loanamountrequired;
	}
	public String getLoanrepayementmethod() {
		return loanrepayementmethod;
	}
	public void setLoanrepayementmethod(String loanrepayementmethod) {
		this.loanrepayementmethod = loanrepayementmethod;
	}



}
