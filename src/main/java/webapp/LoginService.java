package webapp;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("tornadohood") && password.equals("test1234");
	}

}

