package com.example.helpdesk.contactService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.example.helpdesk.contacts.Contact;
import com.example.helpdesk.contacts.ContactAPI;

/**
 * Servlet implementation class ContactCRUD
 */
public class ContactCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactCRUD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long contactId = Long.valueOf(request.getParameter("contactId"));
		Contact contact = ContactAPI.get(contactId);
		JSONObject contactObj = new JSONObject();
		contactObj.put("firstName", contact.getFirstName());
		contactObj.put("lastName", contact.getLastName());
		response.setContentType("application/json");
		response.getWriter().append(contactObj.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
