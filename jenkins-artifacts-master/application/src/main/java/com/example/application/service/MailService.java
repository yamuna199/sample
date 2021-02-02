package com.example.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.application.bean.NewApplication;

@Service
public class MailService {
	
	private JavaMailSender javamailSender;

	@Autowired
	public MailService(JavaMailSender javamailSender) {
	
		this.javamailSender = javamailSender;
	}
	
	public void SendNotification(NewApplication application) throws MailException
	{
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(application.getMail());
		mail.setFrom("kongara.bindusri@gmail.com");
		mail.setSubject("Sending message through Spring Boot");
		mail.setText("First Name:"+application.getFirstName()+"Last Name: "+application.getLastName()+"Username: "+application.getUserName()+"Password: "+application.getPassWord());
		javamailSender.send(mail);
		
	}
	

}
