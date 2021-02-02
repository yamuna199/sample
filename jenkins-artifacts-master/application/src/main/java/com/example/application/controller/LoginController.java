package com.example.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.application.bean.Login;
import com.example.application.bean.NewApplication;
import com.example.application.service.LoginService;
import com.example.application.service.MailService;

@Controller
public class LoginController {

	@Autowired
	MailService mail;
	
	
	@Autowired
	LoginService service;
	@Autowired
	Login login;
	@Autowired
	NewApplication applicationForm;
	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/")
	public ModelAndView getLogin()
	{
		mv.addObject("login", login);
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/verify")
	public ModelAndView verifyDetails(@ModelAttribute("login") Login details)
	{
		boolean b=service.getInfo(details);
		if(b==true)
		{
			mv.setViewName("home");
		}
		else
		{
			mv.addObject("login", login);
			mv.setViewName("login");
		}
			return mv;
	}
	
	@RequestMapping("/newApplication")
	public ModelAndView addDetails()
	{
		mv.addObject("application", applicationForm);
		mv.setViewName("application");
	return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView checkingUser(@ModelAttribute ("application") NewApplication app)
	{
		int count=0;
		String userName=app.getMail();
		char ch[]=userName.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='@')
			{
				count=i;
			}
		}
		app.setUserName(userName.substring(0, count));
		
		login.setUserName(app.getUserName());
		login.setPassWord(app.getPassWord());
		login.setApplication(app);
		boolean b=service.addAccountDetails(app);
		try
		{
			mail.SendNotification(app);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		boolean l=service.addCredentials(login);
		
		if(b==true && l==true)
		{
			login.setUserName("");;
			mv.addObject("login", login);
			
			mv.setViewName("login");
		}
		else
		{
			mv.addObject("application", applicationForm);
			mv.setViewName("application");
		}
	
	return mv;
	}

}
