package phonebook.model;

public class Contact {

	private String name;
	private String phone;
	private String email;
	
	public Contact() {
		// TODO Auto-generated constructor stub
		this.name = "";
		this.phone = "";
		this.email = "";
	}

	public Contact(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		Contact c = (Contact) obj;
		/*if(this.name.equals(c.getName()) &&
				this.phone.equals(c.getPhone()) &&
				this.email.equals(c.getEmail())) {
			return true;
		}*/
		if(this.name.equals(c.getName())) {
			return true;
		} else {
			return false;
		}
	}

}
