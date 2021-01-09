package com.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressbookapp.dto.AddressBookDTO;
import com.addressbookapp.exception.AddressBookException;
import com.addressbookapp.model.AddressBookData;
import com.addressbookapp.repository.AddressBookRepository;
import com.sun.el.stream.Stream;
@Service
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	private AddressBookRepository addressBookRepository;
	
	private List<AddressBookData> addressBookList = new ArrayList<>();
 
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int personId) {
		return addressBookRepository.findById(personId)
		.orElseThrow(() -> new AddressBookException("No Record " + personId + " does not exists!!"));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData= null;
		addressBookData = new AddressBookData(addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookRepository.save(addressBookData);
	}

	@Override
	public AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData= this.getAddressBookDataById(personId);
//		System.out.println("AddressBookData: " + addressBookData.getAddressBookId());
		addressBookData.setName(addressBookDTO.name);
		addressBookData.setAddress(addressBookDTO.address);
		addressBookData.setCity(addressBookDTO.city);
		addressBookData.setState(addressBookDTO.state);
		addressBookData.setZipCode(addressBookDTO.zipCode);
		addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
		addressBookList.set(personId - 1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int personId) {
		addressBookList.remove(personId - 1);
	}
}
