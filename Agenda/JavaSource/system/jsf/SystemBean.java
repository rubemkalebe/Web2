package system.jsf;

import phonebook.model.Contact;
import system.model.User;

public class SystemBean {

	private User user;
	private Contact contact;
	
	public SystemBean() {
		// TODO Auto-generated constructor stub
		user = new User();
		contact = new Contact();
	}
	
	public String goHome() {
		return "/pages/home";
	}
	
	public String addContact(User u) {
		user = u;
		return "/pages/addContact";
	}
	
	public String editContact(User u, Contact c) {
		user = u;
		contact = c;
		return "/pages/editContact";
	}
	
	public String removeContact(User u, Contact c) {
		user = u;
		contact = c;
		return "/pages/confirmRemove";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
