package com.demo.container.collection;

/**
 * @author wanglf
 *
 */
public class EqualsTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyName myN = new MyName("wang","lifeng");
		MyName myN1 = new MyName("wang","lifeng");
		
		boolean flag = false;
		flag = myN.equals(myN1);
		System.out.println("flag : " + flag);
		System.out.println(myN.hashCode() + " " + myN1.hashCode());
		
	}
}

class MyName {
	private String firstName;
	private String lastName;
	
	MyName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyName other = (MyName) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
}
