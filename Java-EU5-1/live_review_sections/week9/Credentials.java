package week9;

public class Credentials {

	private String username,password;

	
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username.length()<8) {
			System.err.println("username should at least 8 characters");
			return;
		}
		
		if(!username.endsWith("gmail.com")) {
			System.out.println("username must end with @gmail.com");		
		}
	
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(!Character.isLetter(password.charAt(0))) {
			System.err.println("password must start with letter");
			return;
		}
		
		
		this.password = password;
	}
	
	
	
	
	
	
}
