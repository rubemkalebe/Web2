package system.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import phonebook.model.Contact;
import system.control.AddUser;
import system.model.User;

@ManagedBean
@SessionScoped
public class SystemBean {

	private User user;
	private Contact contact;
	private Contact oldContact;
	
	public SystemBean() {
		// TODO Auto-generated constructor stub
		user = new User();
		contact = new Contact();
		setOldContact(new Contact());
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
		setOldContact(c);
		return "/pages/editContact";
	}
	
	public String removeContact(User u, Contact c) {
		user = u;
		contact = c;
		return "/pages/confirmRemove";
	}
	
	public String addUser() {
		AddUser au = new AddUser();
		au.add(user);
		return "/index";
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

	public Contact getOldContact() {
		return oldContact;
	}

	public void setOldContact(Contact oldContact) {
		this.oldContact = oldContact;
	}

}
