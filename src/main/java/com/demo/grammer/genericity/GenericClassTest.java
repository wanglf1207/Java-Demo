package com.demo.grammer.genericity;

/**
 * ���������
 * @author wanglf1207
 *
 */
public class GenericClassTest {
	public static void main(String [] args) {
		User<String,String> user1 = new User<String, String>("wanglf","admin");
		System.out.println(user1.getUsername() + " " + user1.getPassword());
	}
	
}

class User<T,V> {
	
	private T username;
	private V password;
	
	public User(T username, V password) {
		this.username = username;
		this.password = password;
	}
	
	public T getUsername() {
		return username;
	}
	public V getPassword() {
		return password;
	}
	public void setUsername(T username) {
		this.username = username;
	}
	public void setPassword(V password) {
		this.password = password;
	}
	
}
