package com.example.helpdesk.tickets;

import org.json.JSONObject;

import com.example.helpdesk.contacts.Contact;
import com.example.helpdesk.contacts.ContactAPI;

public class TicketAPI {

	public static Ticket add(JSONObject ticketObj) {
		Long contactId = ticketObj.getLong("contactId");
		Contact contact = ContactAPI.get(contactId);
		if(contact!=null) {
			return new Ticket(ticketObj.getString("subject"), contactId, ticketObj.getString("description"));
		}
		return null;
	}
}
