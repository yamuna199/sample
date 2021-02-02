package com.example.application.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Login {
	@Id
	private String userName;
	private String passWord;
	@OneToOne
	@JoinColumn(name = "mail")
	private NewApplication application;
	
	public NewApplication getApplication() {
		return application;
	}
	public void setApplication(NewApplication application) {
		this.application = application;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", passWord=" + passWord + "]";
	}

}
