package com.demo.container.collection;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

/**
 * @author wanglf
 */
public class CollectionTest {
	/**
	 * @param args
	 * Collection<Object> collection = new ArrayList<Object>();<br>
	 * 这里的ArrayList可以改成LinkList甚至其他，保证程序可扩展性<br>
	 * 但是有一个问题，要想remove(int index),定义容器对象就应该写成
	 * List<Object> collection = new ArrayList<Object>();<br>
	 * 因为remove(int index)是在List中定义的，Set接口也是Collection接口的子接口,但是没有必要定义remove(int index)<br>
	 * 因为Set中的元素是无顺序的<br>
	 * collection.add("hello");  把字符串的引用存起来<br>
	 * remove的时候它会把容器里的对象拿出来比较是否equals
	 * 开始我做到这个时候很迷惑，执行remove方法的时候， Name的对象执行equals方法<br>
	 * 因为Name类没有重写equals方法，所以程序执行的是Object类里面的equals，要想去掉
	 * 新new出来的对象，必须在Name里重写Object对象的equals方法<br>
	 * 执行remove的时候，要明确几点：<br>
	 * 1.remove方法在Collection接口中声明,在ArrayList中实现<br>
	 * 2.在remove方法的实现中，调用equals方法，循环去容器中遍历该对象，找到对应的对象之后remove掉<br>
	 *   这样做貌似效率不高,要想提高效率，使用remove(int index)
	 */
	public static void main(String [] args) {
		// Collection<Object> collection = new ArrayList<Object>();
		List<Object> collection = new ArrayList<Object>();
		collection.add(new Integer(111));
		collection.add("hello");
		collection.add(new Name("a","b"));

		System.out.println("collection = " + collection);
		System.out.println("collection = " + collection.get(1));
		System.out.println("collection.size = " + collection.size());

		collection.remove(2);
		//collection.remove("hello");
		//collection.remove(1);
		System.out.println(collection);
	}
}

class Name {

	private String firstName;
	private String lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
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
		System.out.println("run equals...");
		if(obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return firstName.hashCode();
	}
}
