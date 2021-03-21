package com.demo.reflect.reflect.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * TestConstructor.java
 * 构造方法的反射机制
 */
public class TestConstructor {
	public static void main(String[] args) {
		try {
			/**
			 * JDK 5.0之后支持可变参数，例如：getConstructor(Class<?>... parameterTypes)
			 * new String(new StringBuffer("abc"));
			 */
			//表示创建String(StringBuffer buffer)构造方法，个人认为和JS中的DOM类似
			Constructor<String> contructor = String.class.getConstructor(StringBuffer.class);
			String str = contructor.newInstance(new StringBuffer("abc"));
			System.out.println(str.charAt(2));
		} catch (SecurityException e) { e.printStackTrace();
		} catch (NoSuchMethodException e) { e.printStackTrace();
		} catch (IllegalArgumentException e) { e.printStackTrace();
		} catch (InstantiationException e) { e.printStackTrace();
		} catch (IllegalAccessException e) { e.printStackTrace();
		} catch (InvocationTargetException e) { e.printStackTrace();
		}
	}
}