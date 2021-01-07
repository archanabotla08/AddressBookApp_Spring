package com.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan("com.addressbookapp")
@Slf4j
public class AddressBookAppSpringApplication {
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(AddressBookAppSpringApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressBookAppSpringApplication.class, args);
		log.info("Address Book Started In App");
		}

}
