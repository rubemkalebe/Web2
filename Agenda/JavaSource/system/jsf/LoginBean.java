package system.jsf;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import system.control.VerifyUser;
import system.model.User;

@ManagedBean
@SessionScoped
public class LoginBean {

	private User user;
	private boolean loggedIn;
	
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
			loggedIn = true;
			return "/pages/home";
		} else {
			return "/loginError";
		}
	}
	
	public String tryAgain() {
		init();
		return "/index";
	}
	
	public String logout() {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
		session.invalidate();
		loggedIn = false;
		return "/index";
	}
	
	public String createNewUser() {
		init();
		return "/newUser";
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

}
