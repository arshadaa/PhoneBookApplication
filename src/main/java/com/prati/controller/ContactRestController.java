package com.arshad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arshad.entity.Contact;
import com.arshad.service.ContactServiceImpl;

@RestController
public class ContactRestController {

	@Autowired
	private ContactServiceImpl service;
	
	@PostMapping("/contact")
	public String createContact(@RequestBody Contact contact) {
		String status = service.saveContact(contact);
		return status;	
	}
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		return service.getAllContacts();
	}
	
	
	@GetMapping("/contact/{contactId}")
	public Contact getContactById(@PathVariable Integer contactId) {
		return service.getContactById(contactId);
	}
	
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		String message = service.updateContact(contact);
		return message;
	}
	
	
	@DeleteMapping("/contact/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		return service.deleteContactById(contactId);
	}
	
	
}
