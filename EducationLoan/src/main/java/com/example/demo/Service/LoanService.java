package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.AdminModel;
import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.LoginModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Repo.AdminRepo;
import com.example.demo.Repo.LoanApplicationRepo;
import com.example.demo.Repo.LoginRepo;
import com.example.demo.Repo.UserRepo;
@Service
public class LoanService {

	
	@Autowired
	
	public  AdminRepo obj;
	public LoanApplicationRepo obj1;
	public LoginRepo obj2;
	public UserRepo obj3;
	
	//AdminModel:
	
	public AdminModel post1(AdminModel amodel)
	{
		return obj.save(amodel);
	}
	public List<AdminModel>get1()
	{
		return obj.findAll();
	}
	public AdminModel put1(AdminModel amodel)
	{
		return obj.saveAndFlush(amodel);
	}
	public void delete(String password)
	{
		obj.deleteById(password);
	}
	
	//LoanApplication Model
	public LoanApplicationModel post2(LoanApplicationModel lmodel)
	{
		return obj1.save(lmodel);
	}
	public List<LoanApplicationModel >get2()
	{
		return obj1.findAll();
	}
	public LoanApplicationModel put2(LoanApplicationModel  lmodel)
	{
		return obj1.saveAndFlush(lmodel);
	}
	public void delete1(int loanid)
	{
		obj1.deleteById(loanid);
	}
	//LoginModel
	public LoginModel post3(LoginModel lmodel)
	{
		return obj2.save(lmodel);
	}
	public List<LoginModel >get3()
	{
		return obj2.findAll();
	}
	public LoginModel put3(LoginModel  lmodel)
	{
		return obj2.saveAndFlush(lmodel);
	}
	public void delete2(String password)
	{
		obj2.deleteById(password);
	}
	//UserModel
	public UserModel post4(UserModel lmodel)
	{
		return obj3.save(lmodel);
	}
	public List<UserModel >get4()
	{
		return obj3.findAll();
	}
	public UserModel put4(UserModel  lmodel)
	{
		return obj3.saveAndFlush(lmodel);
	}
	public void delete3(int id)
	{
		obj3.deleteById(id);
	}
	
}
