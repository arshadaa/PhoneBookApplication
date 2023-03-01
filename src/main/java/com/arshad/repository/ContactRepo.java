package com.arshad.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arshad.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Serializable>{

}
