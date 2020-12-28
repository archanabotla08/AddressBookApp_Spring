package com.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookAppSpringApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Address book app");
		SpringApplication.run(AddressBookAppSpringApplication.class, args);
	}

}
