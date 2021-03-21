package com.demo.container.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void  main(String[] args) {
		Set<Object> s = new HashSet<Object>();
		s.add("hello");
		s.add(new Name("f1","l1"));
		s.add("ok");
		//��ͬԪ�ز��ᱻ����
		s.add(new Name("f1","l1"));
		//��ǿforѭ��
		for(Object o:s) {
			System.out.println(o);
		}
	}
}

class Name {
	
	private String firstName;
	private String lastName;
	
	//Constructor
	public Name(String firstName, String lastName) {
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName))
				&& (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return firstName.hashCode();
	}
}