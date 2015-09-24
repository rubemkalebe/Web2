package phonebook.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import phonebook.model.Contact;
import system.model.User;

@ManagedBean
@SessionScoped
public class PhonebookBean {

	private Contact contact;
	
	public PhonebookBean() {
		// TODO Auto-generated constructor stub
		contact = new Contact();
	}
	
	public String add(User u) {
		u.getPhonebook().addContact(contact);
		return "/pages/home";
	}
	
	public String edit(User u, Contact old) {
		int i = 0;
		for(Contact c : u.getPhonebook().getContacts()) {
			if(c.equals(old)) {
				break; 
			}
			i++;
		}
		u.getPhonebook().getContacts().set(i, contact);
		return "/pages/home";
	}
	
	public String remove(User u, Contact c) {
		u.getPhonebook().removeContact(c);
		return "/pages/home";
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
