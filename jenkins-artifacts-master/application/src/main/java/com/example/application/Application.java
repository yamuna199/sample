package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.application.bean.Login;
import com.example.application.controller.LoginController;


@ComponentScan(value= {"com.example.application", "com.example.application.bean.Login"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
	LoginController cont=context.getBean(LoginController.class);

	}

	/*
	 * @Bean public Login getLogin() { return new Login(); }
	 */
}
