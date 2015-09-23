
public class VerifyUser {

	private DBSimulator simulator;
	
	public VerifyUser() {
		// TODO Auto-generated constructor stub
		simulator = new DBSimulator();
	}
	
	public boolean ok(User u) {
		return simulator.checkUser(u);
	}

}
