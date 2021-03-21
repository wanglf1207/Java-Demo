package com.demo.reflect.reflect.field;

import java.lang.reflect.Field;
//���÷����User������nameֵ�е���ĸa�滻��b��
//���С������м�ֵ��Spring��ܾ���������ԭ��
//������һ��������ܰѶ������Ըĵ�
public class UserReflect {
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setName("jade");
		changeStringValue(user);
		System.out.println(user);
	}
	
	public static void changeStringValue(User user) throws Exception {
		Field[] fields = user.getClass().getFields();
		for(Field field : fields) {
			//���ʱ����==����equals��׼ȷ
			//if(field.getType().equals(String.class)) {
			if(field.getType() == String.class) {
				String oldValue = (String)field.get(user);
				String newValue = oldValue.replace('a', 'b');
				field.set(user, newValue);
			}
		}
	}
}

//User����
class User {
	
	public User(){}
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
