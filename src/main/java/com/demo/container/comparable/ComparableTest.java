package com.demo.container.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Comparable接口测试
 * @author wanglf1207
 *
 */
public class ComparableTest {

	public static void main(String[] args) {

		List<User> list = new LinkedList<User>();

		list.add(new User("b","b"));
		list.add(new User("a","a"));
		list.add(new User("d","e"));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

class User implements Comparable<Object> {

	private String firstName;
	private String lastName;

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return firstName+""+lastName;
	}

	// 重写父类的equals方法，必须重写父类的hashCode方法
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User name = (User) obj;
			return (firstName.equals(name.firstName))
					&& (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return firstName.hashCode();
	}

	@Override
	public int compareTo(Object o) {
		User n = (User)o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
}