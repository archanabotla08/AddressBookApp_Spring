package com.addressbookapp.dto;

public class AddressBookDTO {
	String name;
	String address;
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
