package com.zohocrm.zohocrmapp.service;

import java.util.List;

import com.zohocrm.zohocrmapp.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);
}
