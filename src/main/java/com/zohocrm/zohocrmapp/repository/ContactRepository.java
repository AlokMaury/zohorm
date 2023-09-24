package com.zohocrm.zohocrmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.zohocrmapp.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
