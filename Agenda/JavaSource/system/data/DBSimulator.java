package system.data;
import java.util.ArrayList;
import java.util.List;

import phonebook.model.Contact;
import system.model.User;

public class DBSimulator {

	private static DBSimulator instance;
	private List<User> users = new ArrayList<User>();
	
	private DBSimulator() {
		// TODO Auto-generated constructor stub		
		User u = new User("user1", "senha1");
		u.getPhonebook().addContact(new Contact("contato11", "telefone11", "email11"));
		u.getPhonebook().addContact(new Contact("contato12", "telefone12", "email12"));
		u.getPhonebook().addContact(new Contact("contato13", "telefone13", "email13"));
		users.add(u);
		u = new User("user2", "senha2");
		u.getPhonebook().addContact(new Contact("contato21", "telefone21", "email21"));
		u.getPhonebook().addContact(new Contact("contato22", "telefone22", "email22"));
		u.getPhonebook().addContact(new Contact("contato23", "telefone23", "email23"));
		users.add(u);
		u = new User("user3", "senha3");
		u.getPhonebook().addContact(new Contact("contato31", "telefone31", "email31"));
		u.getPhonebook().addContact(new Contact("contato32", "telefone32", "email32"));
		u.getPhonebook().addContact(new Contact("contato33", "telefone33", "email33"));
		users.add(u);
	}
	
	public static DBSimulator getInstance() {
		if(instance == null) {
			instance = new DBSimulator();
		}
		return instance;
	}
	
	public User checkUser(User u) {
		for(User it : users) {
			if(it.equals(u)) {
				return it;
			}
		}
		return null;
	}
	
	public void addUser(User u) {
		users.add(u);
	}

}
