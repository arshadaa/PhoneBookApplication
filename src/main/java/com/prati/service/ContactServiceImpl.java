package com.arshad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arshad.entity.Contact;
import com.arshad.repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepo repo;

	@Override
	public String saveContact(Contact contact) {
		
		contact = repo.save(contact);
		
		if(contact.getContactId() != null) {
			return "Contact Saved";
		}
		return "Contact Failed to Save";
	}

	@Override
	public List<Contact> getAllContacts() {
		
		List<Contact> list = repo.findAll();
		
		return list;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> contact = repo.findById(contactId);
		
		if(contact.isPresent()) {
			return contact.get();
		}
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		
		Integer id = contact.getContactId();
		
		if(repo.existsById(id)) {
		contact = repo.save(contact);
		return "Contact Updated Successfully";
		}
		return "Contact with given id does not exist";
		
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repo.existsById(contactId)) {
			
			repo.deleteById(contactId);
			return "Contact deleted successfully";
		}
		
		return "Contact does not exist";
	
	}
	
	
	
}
