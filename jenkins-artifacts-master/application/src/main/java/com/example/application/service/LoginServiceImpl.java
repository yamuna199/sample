package com.example.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.application.bean.Login;
import com.example.application.bean.NewApplication;
import com.example.application.dao.ILoginDAO;
import com.example.application.dao.INewApplicationDAO;

@Component
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	ILoginDAO dao;
	@Autowired
	INewApplicationDAO appDao;

	@Override
	public void check() {
		System.out.println("Hello World");

	}

	@Override
	public boolean getInfo(Login details) {
		
		boolean b=false;
		List<Login> list=dao.findAll();
		for (Login login : list) {
			if(login.getUserName().equals(details.getUserName()) || login.getApplication().getMail().equals(details.getUserName()))
			{
				if(login.getPassWord().equals(details.getPassWord()))
				{
					b=true;
				}
				else
				{
					b=false;
				}
			}
			else
			{
				b=false;
			}
			
		}
		return b;
	}

	@Override
	public boolean addAccountDetails(NewApplication app) {
		
		NewApplication b=appDao.save(app);
		if(b!=null)
		{
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean addCredentials(Login login) {
		Login log=dao.save(login);
		if(log!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
