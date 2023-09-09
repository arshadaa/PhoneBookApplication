package com.arshad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arshad.entity.Contact;



public interface ContactService {
	public String saveContact ( Contact contact ) ;
	public List<Contact> getAllContacts ( ) ;
	public Contact getContactById ( Integer contactId );
	public String updateContact ( Contact contact );
	public String deleteContactById ( Integer contactId );
}
