package com.example.application.service;

import org.springframework.stereotype.Service;

import com.example.application.bean.Login;
import com.example.application.bean.NewApplication;

@Service
public interface LoginService {

	public void check();

	public boolean getInfo(Login details);

	public boolean addAccountDetails(NewApplication app);

	public boolean addCredentials(Login login);

}
