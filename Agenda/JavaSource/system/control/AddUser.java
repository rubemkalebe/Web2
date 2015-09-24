package system.control;

import system.data.DBSimulator;
import system.model.User;

public class AddUser {

	private DBSimulator simulator;
	
	public AddUser() {
		// TODO Auto-generated constructor stub
		simulator = DBSimulator.getInstance();
	}
	
	public void add(User u) {
		simulator.addUser(u);
	}

}
