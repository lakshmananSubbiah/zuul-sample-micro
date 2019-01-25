package com.example.helpdesk.contacts;

public class Contact {

	private String lastName;
	private String firstName;
	
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public Contact(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	
}
