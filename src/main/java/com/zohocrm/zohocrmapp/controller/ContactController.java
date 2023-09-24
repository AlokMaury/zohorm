package com.zohocrm.zohocrmapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.zohocrmapp.entities.Contact;
import com.zohocrm.zohocrmapp.service.ContactService;

@Controller
public class ContactController {
	
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		
		this.contactService = contactService;
	}
	@RequestMapping("/listContacts")
	public String getAllContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id,Model model) {
		List<Contact> contact = contactService.getAllContacts();
		model.addAttribute("contact", contact);
		return "list_contacts";
	}
}
