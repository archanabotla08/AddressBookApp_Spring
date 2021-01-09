package com.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableJpaRepositories("com.addressbookapp.repository")
@ComponentScan("com.addressbookapp")
public class AddressBookAppSpringApplication {
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(AddressBookAppSpringApplication.class);
	public static void main(String[] args) {
		System.out.println("Welcome to Address book app");
//		SpringApplication.run(AddressBookAppSpringApplication.class, args);
		ApplicationContext context = SpringApplication.run(AddressBookAppSpringApplication.class, args);
		log.info("Address Book Started In App");
		log.info("Address Book Database : ",context.getEnvironment().getProperty("spring.datasource.username"));
		
	}

}
