package com.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.addressbookapp.dto.AddressBookDTO;
import com.addressbookapp.model.AddressBookData;
@Service
public class AddressBookService implements IAddressBookService {
	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> addressBookList=new ArrayList<AddressBookData>();
		addressBookList.add(new AddressBookData(1, new AddressBookDTO("Archana", "ShivajiNagar")));
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int personId) {
		AddressBookData addressBookData=new AddressBookData(personId, new AddressBookDTO("Priti", "Pimpri Colony"));
		return addressBookData;
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData=new AddressBookData(3, addressBookDTO);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData=new AddressBookData(3,addressBookDTO);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int personId) {
		// TODO Auto-generated method stub
		
	}
}
