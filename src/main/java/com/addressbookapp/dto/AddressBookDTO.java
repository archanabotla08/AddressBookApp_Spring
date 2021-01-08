package com.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Invalid Name")
	@NotEmpty(message="Should not be null")
	public String name;
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$",message = "Invalid Address")
	@NotEmpty(message = "Should not be null")
	public String address;
	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public AddressBookDTO() {
		super();
	}

	@Override
	public String toString() {
		return "AddressBookDTO [name=" + name + ", address=" + address + "]";
	}


	
}
