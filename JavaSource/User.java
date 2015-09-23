
public class User {

	private String userName;
	private String password;
	private ContactList list;
	
	public User() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	public User(String userName, String password) {
		init(userName, password);
	}
	
	public void init() {
		userName = "";
		password = "";
		list = new ContactList();
	}
	
	public void init(String userName, String password) {
		this.userName = userName;
		this.password = password;
		list = new ContactList();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ContactList getList() {
		return list;
	}

	public void setList(ContactList list) {
		this.list = list;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		User u = (User) obj;
		if(userName.equals(u.getUserName()) && password.equals(u.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}
