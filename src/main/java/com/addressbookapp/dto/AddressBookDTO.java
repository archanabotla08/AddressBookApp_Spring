package com.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

@ToString
public class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Invalid Name")
	@NotEmpty(message="Name Should not be null")
	public String name;
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$",message = "Invalid Address")
	@NotEmpty(message = "Address Should not be null")
	public String address;
	@Pattern(regexp ="^[9][1][ ][6-9][0-9]{9}$", message = "Invalid Phone Number")
	@NotEmpty(message = "Phone Number Should Not be nUll")
	public String phoneNumber;

	@NotEmpty(message = "City Should Not be Null")
	public String city;

	@NotEmpty(message = "State Should Not be Null")
	public String state;

	@NotEmpty(message = "ZipCode Should Not be Null")
	public String zipCode;
	
}
