package testMaven;

public class Login {

	String name;
	String password;
	
	public String getName() {
		return name;
	}

	public Login(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean checkUsernamePassword() {
		return false;
		
	}

}
