package system.model;

import phonebook.model.Phonebook;

public class User {

	private String username;
	private String password;
	private Phonebook phonebook;
	
	public User() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	public User(String userName, String password) {
		init(userName, password);
	}
	
	public void init() {
		username = "";
		password = "";
		phonebook = new Phonebook();
	}
	
	public void init(String userName, String password) {
		this.username = userName;
		this.password = password;
		phonebook = new Phonebook();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Phonebook getPhonebook() {
		return phonebook;
	}

	public void setPhonebook(Phonebook phonebook) {
		this.phonebook = phonebook;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		User u = (User) obj;
		if(username.equals(u.getUsername()) &&
				password.equals(u.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}
