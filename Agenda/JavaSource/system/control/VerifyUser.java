package system.control;

import system.data.DBSimulator;
import system.model.User;

public class VerifyUser {

	private DBSimulator simulator;
	
	public VerifyUser() {
		// TODO Auto-generated constructor stub
		simulator = DBSimulator.getInstance();
	}
	
	public User ok(User u) {
		return simulator.checkUser(u);
	}

}
