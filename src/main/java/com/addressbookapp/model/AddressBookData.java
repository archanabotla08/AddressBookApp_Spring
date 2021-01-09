package com.addressbookapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.addressbookapp.dto.AddressBookDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "ADDRESSBOOK_Deatils")
public class AddressBookData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressBookId")
	private int addressBookId;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "phoneNumber")//columnDefinition="Number(10) default '0000000000'"
	public String phoneNumber;
	
	@Column(name = "city")
	public String city;
	
	@Column(name = "state")
	public String state;
	
	@Column(name = "zipcode")//,columnDefinition="Number(6) default '000000'"
	public String zipCode;

	public AddressBookData() {
		
	}
	public AddressBookData(AddressBookDTO addressBookDTO) {
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}
