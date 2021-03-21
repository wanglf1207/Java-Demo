package com.demo.container;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class IteratorTest {
	public static void main(String[] args) {
		Collection<Object> c = new HashSet<Object>();
		c.add(new Name("1111","1111"));
		c.add(new Name("222222","222222"));
		c.add(new Name("3333333","3333333"));
		Iterator<Object> i = c.iterator();
		while(i.hasNext()) {
			Name n = (Name)i.next();
			if(n.getFirstName().length()<5) {
				//i.remove();
				c.remove(n);
				//c.remove(new Name("1111","1111"));
			}
			System.out.println(n.getFirstName()+":" +n.getLastName());
		}
		System.out.println(c);
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
