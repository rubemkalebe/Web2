import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
		if(v.ok(user)) {
			return "/pages/home";
		} else {
			return "/pages/loginError";
		}
	}
	
	public String tryAgain() {
		return "/index";
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
