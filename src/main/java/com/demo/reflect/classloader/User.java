package com.demo.reflect.classloader;

public class User {

	public User() {
		System.out.println("user class constructor");
	}
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
	    return username + " " + password;
    }

}
