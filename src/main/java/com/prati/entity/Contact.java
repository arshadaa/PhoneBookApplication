package com.arshad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "CONTACT_INFO")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer contactId;
	
	String contactName;
	String contactEmail;
	Long contactNum;
}
