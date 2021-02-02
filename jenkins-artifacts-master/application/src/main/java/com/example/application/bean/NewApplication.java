package com.example.application.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
@Component
public class NewApplication {

	/*
	 * @Override public String toString() { return "NewApplication [firstName=" +
	 * firstName + ", lastName=" + lastName + ", mail=" + mail + ", gender=" +
	 * gender + ", userName=" + userName + ", passWord=" + passWord + "]"; }
	 */
	private String firstName;
	private String lastName;
	@Id
	private String mail;
	private String gender;
	private String userName;
	private String passWord;
	public String getFirstName() {
		return firstName;
	}

	/*
	 * public NewApplication(String firstName, String lastName, String mail, String
	 * gender, String userName, String passWord) { super(); this.firstName =
	 * firstName; this.lastName = lastName; this.mail = mail; this.gender = gender;
	 * this.userName = userName; this.passWord = passWord; }
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	
}
