package com.addressbookapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.addressbookapp.dto.AddressBookDTO;
import com.addressbookapp.model.AddressBookData;

@Component("IAddressBookService")
public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressBookDataById(int personId);

	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO);

	void deleteAddressBookData(int personId);
}
