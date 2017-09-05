package com.samantula.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext  applicationcontext = SpringApplication.run(Application.class, args);
		System.out.println("*******************************************");
		for (String beanName : applicationcontext.getBeanDefinitionNames()) {
			System.out.println("****** Bean Definition Name ****** : " + beanName);
		}
		System.out.println("*******************************************");
		System.out.println("*******************************************");
	}

	@Profile("prod")
	@Bean
	public String dummy() {
		return "something";
	}
}