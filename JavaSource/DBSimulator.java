import java.util.ArrayList;
import java.util.List;

public class DBSimulator {

	private List<User> users = new ArrayList<User>();
	
	public DBSimulator() {
		// TODO Auto-generated constructor stub		
		users.add(new User("user1", "senha1"));
		users.add(new User("user2", "senha2"));
		users.add(new User("user3", "senha3"));
	}
	
	public boolean checkUser(User u) {
		return users.contains(u);
	}
	

}
