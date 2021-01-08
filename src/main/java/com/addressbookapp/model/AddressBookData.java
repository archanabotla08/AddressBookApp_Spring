package com.addressbookapp.model;


import com.addressbookapp.dto.AddressBookDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public @Data class AddressBookData {
	private int addressBookId;
	private String name;
	private String address;
	public String phoneNumber;
	public String city;
	public String state;
	public String zipCode;

	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		super();
		this.addressBookId = addressBookId;
		this.updateAddressBookData(addressBookDTO);
	}
	
	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zipCode = addressBookDTO.zipCode;
		this.phoneNumber = addressBookDTO.phoneNumber;
	}

	public AddressBookData() {
		super();
	}

	public int getAddressBookId() {
		return addressBookId;
	}

	public void setAddressBookId(int addressBookId) {
		this.addressBookId = addressBookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
