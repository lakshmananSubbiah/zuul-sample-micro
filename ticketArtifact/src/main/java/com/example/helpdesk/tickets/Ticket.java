package com.example.helpdesk.tickets;

public class Ticket {

	private String subject;
	private Long contactId;
	private String description;
	
	
	public String getSubject() {
		return subject;
	}
	public Long getContactId() {
		return contactId;
	}
	public String getDescription() {
		return description;
	}
	
	Ticket(String subject, Long contactId, String description) {
		super();
		this.subject = subject;
		this.contactId = contactId;
		this.description = description;
	}
}
