package com.mvc.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("vaibhav") && password.equals("dummy");
	}

}