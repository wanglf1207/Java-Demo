package com.demo.grammer.annotation.develop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//��ע�����ϼ�ע�����Դע�⣬����������˵��ע�Ᵽ����������
//Retention������ RetentionPolicy,��������
//����һ��ע����
@Retention(RetentionPolicy.RUNTIME)
//��ʾ���ע�⽫���ȿ����������ϣ�Ҳ�������ڷ�����
//{}�����ʾ���飬Class�ĸ�����TYPE��Type�����:Enum��@interface��...
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface TestAnnotation {
	//ʹ��default����Ĭ��ֵ
	String color() default "blue";
	String value();
	int[] arr() default {1,2};
	MetaAnnotation ann() default @MetaAnnotation("value");
}
