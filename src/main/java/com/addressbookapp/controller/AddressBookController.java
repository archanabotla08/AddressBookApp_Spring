package com.addressbookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressbookapp.dto.AddressBookDTO;
import com.addressbookapp.dto.ResponseDTO;
import com.addressbookapp.model.AddressBookData;
import com.addressbookapp.service.IAddressBookService;


@RestController
@RequestMapping("/addressbookrestcontroller")
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = { "", "/", "get" })
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(1, new AddressBookDTO("Archana", "ShivajiNagar"));
		ResponseDTO responseDTO = new ResponseDTO("Get Call Success !!!", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{personId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(personId, new AddressBookDTO("Priti", "PimpriColony"));
		ResponseDTO responseDTO = new ResponseDTO("Get Call for id Successful:", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new com.addressbookapp.model.AddressBookData(3, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Address Book Data Successfully:", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(3, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated  Address Book Data Successfully:", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{personId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("personId") int personId) {
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + personId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}

