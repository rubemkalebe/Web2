package phonebook.model;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

	private List<Contact> contacts;
	
	public Phonebook() {
		// TODO Auto-generated constructor stub
		contacts = new ArrayList<Contact>();
	}
	
	public void addContact(Contact c) {
		contacts.add(c);
	}
	
	public void removeContact(Contact c) {
		contacts.remove(c);
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
