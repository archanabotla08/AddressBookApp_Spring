package com.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.addressbookapp.dto.AddressBookDTO;
import com.addressbookapp.model.AddressBookData;
@Service
public class AddressBookService implements IAddressBookService {
	
	private List<AddressBookData> addressBookList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int personId) {
		return addressBookList.get(personId - 1);
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData= null;
		addressBookData = new AddressBookData(addressBookList.size() + 1 , addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData= this.getAddressBookDataById(personId);
		addressBookData.setName(addressBookDTO.name);
		addressBookData.setAddress(addressBookDTO.address);
		addressBookList.set(personId - 1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int personId) {
		addressBookList.remove(personId - 1);
	}
}
