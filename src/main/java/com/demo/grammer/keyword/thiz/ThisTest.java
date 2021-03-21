package com.demo.grammer.keyword.thiz;

class Student {
	
	private String studentName;
	private String studentAge;
	
	public String getStudentName() {
		return studentName;
	}
	/*
	 * this��ʾ��ǰ���������
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
}

public class ThisTest {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("������");
		System.out.println(student.getStudentName());
	}
}