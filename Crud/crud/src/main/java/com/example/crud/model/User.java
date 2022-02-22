package com.example.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	public Long id;
	public String firstName;
	public String lastName;
	public String surName;
	public String phoneNo;

	public User() {
	}

	public User(Long id, String firstname, String lastname, String surname, String phoneno) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.surName = surname;
		this.phoneNo = phoneno;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surname) {
		this.surName = surname;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneno) {
		this.phoneNo = phoneno;
	}

}
