package com.verizon.bsa.model;

import java.sql.Date;

public class Customer {
	
	private String customerId;

	private String name;
	
	private Date dateOfJoining;
	
	private String city;
	
	private String contact;
	
	public Customer() {}

	public Customer(String customerId, String name, Date dateOfJoining, String city, String contact) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.city = city;
		this.contact = contact;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

	
	
	
	

}
