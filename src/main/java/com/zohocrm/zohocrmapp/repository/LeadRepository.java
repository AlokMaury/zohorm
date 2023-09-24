package com.zohocrm.zohocrmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.zohocrmapp.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
