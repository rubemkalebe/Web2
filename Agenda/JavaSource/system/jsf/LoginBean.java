package system.jsf;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import system.control.VerifyUser;
import system.model.User;

@ManagedBean
@SessionScoped
public class LoginBean {

	private User user;
	
	public LoginBean() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	public void init() {
		user = new User();
	}
	
	public String authenticate() {
		VerifyUser v = new VerifyUser();
		if((user = v.ok(user)) != null) {
			return "/pages/home";
		} else {
			return "/loginError";
		}
	}
	
	public String tryAgain() {
		init();
		return "/index";
	}
	
	public String createNewUser() {
		init();
		return "/pages/newUser";
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
