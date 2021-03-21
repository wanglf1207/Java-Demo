package com.demo.regex;

import java.util.regex.*;

/**
 * @author wanglf
 *
 */
public class RegexTest {
	
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		
		int i = 0; 
		String s = null; 
		Pattern p = null;
		Matcher m = null;
		boolean b = false; 
		StringBuffer sb = null; 
		
		System.out.println("1.---------------");
		// �ַ���ƥ�䣬���ǲ����ϵ� 
		p = Pattern.compile("a*b"); 
		m = p.matcher("baaaaab"); 
		b = m.matches(); 
		System.out.println("b = " + b);

		// �ַ���ƥ�䣬���Ƿ��ϵ� 
		System.out.println("2.---------------");
		p = Pattern.compile("a*b"); 
		m = p.matcher("aaaaab"); 
		b = m.matches(); 
		System.out.println("b = " + b); 

		// �ַ����滻 
		System.out.println("3.---------------");
		p = Pattern.compile("ab"); 
		m = p.matcher("aaaaab"); 
		System.out.println("m = " + m);
		s = m.replaceAll("d");
		System.out.println("s = " + s); 
		
		System.out.println("4.---------------");
		p = Pattern.compile("a*b"); 
		m = p.matcher("aaaaab"); 
		s = m.replaceAll("d");   
		System.out.println("s = " + s); 

		System.out.println("5.---------------");
		p = Pattern.compile("a*b");
		m = p.matcher("caaaaab");
		s = m.replaceAll("d");
		System.out.println("s = " + s); 

		// �ַ������� 
		// find()���Բ������ģʽƥ����������е���һ��������
		
		/**
		 * appendReplacementʵ�ַ��ն���Ӻ��滻���衣 
		 * 
	     * �˷���ִ�����²����� 
		 * 1. �������λ�ÿ�ʼ���������ж�ȡ�ַ�����������ӵ������ַ������������ڶ�ȡ��ǰƥ��֮ǰ������ַ�����λ������ start() - 1 �����ַ���֮�����ͻ�ֹͣ��
		 * 
		 * 2. ���������滻�ַ�����ӵ��ַ�����������
		 *  
		 * 3. ������ƥ���������λ������Ϊ���ƥ��λ�õ������� 1���� end()��
		 *  
		 * �滻�ַ������ܰ�������ǰƥ���ڼ�������������е����ã�$g ÿ�γ���ʱ�������� group(g) �ļ������滻��$ ֮��ĵ�һ����ʼ�ձ���Ϊ�����õ�һ���֡�
		 * ����������������γɺϷ������ã��򽫱��ϲ��� g �С�ֻ������ '0' �� '9' ����Ϊ�����õĿ�����������磬����ڶ�����ƥ���ַ��� "foo"���򴫵��滻�ַ��� "$2bar" 
		 * ������ "foobar" ����ӵ��ַ��������������ܽ���Ԫ���� ($) ��Ϊ�滻�ַ����е�����ֵ��ͨ��ǰ��ʹ��һ����б�� (\$)������������ 
     	 * ע�⣬���滻�ַ�����ʹ�÷�б�� (\) ����Ԫ���� ($) ���ܵ�������Ϊ����ֵ�滻�ַ���ʱ�������Ľ����ͬ����Ԫ���ſ���Ϊ�����������Ѳ��������е����ã���б�߿�����ת��
     	 * �滻�ַ����е�����ֵ�ַ��� 
		 * �˷����������ѭ���Լ� appendTail �� find �����С����磬���´��뽫 one dog two dogs in the yard д���׼������У� 
		 */
		System.out.println("5.---------------");
		p = Pattern.compile("cat");
		m = p.matcher("one cat two cats in the yard"); 
		sb = new StringBuffer();
		while (m.find()) { 
			m.appendReplacement(sb, "dog"); 
			i++; 
		} 
		m.appendTail(sb); 
		System.out.println("sb.toString() = " + sb.toString());
		System.out.println("i = " + i);
		
		i = 0;  
		p = Pattern.compile("cat"); 
		m = p.matcher("one cat two ca tsi nthe yard"); 
		sb = new StringBuffer(); 
		while (m.find()) { 
			m.appendReplacement(sb, "dog"); 
			i++; 
		} 

		m.appendTail(sb); 

		System.out.println(sb.toString()+"<br>;"); 

		System.out.println(i+"<br>;"); 

		p = Pattern.compile("cat"); 

		m = p.matcher("one cat two cats in the yard"); 

		p=m.pattern(); 

		m = p.matcher("bacatab"); 

		b = m.matches(); 

		System.out.println(b+"<br>;");  

		s = m.replaceAll("dog");  

		System.out.println(s+"<br>;");  

		  

		i=0; 

		p = Pattern.compile("(fds){2,}"); 

		m = p.matcher("dsa da fdsfds aaafdsafds aaf"); 

		   sb = new StringBuffer(); 

		while (m.find()) { 

		      m.appendReplacement(sb, "dog"); 

		      i++; 

		} 

		m.appendTail(sb); 

		System.out.println(sb.toString()+"<br>;"); 

		System.out.println(i+"<br>;"); 

		  

		   p = Pattern.compile("cat"); 

		   m = p.matcher("one cat two cats in the yard"); 

		   sb = new StringBuffer(); 

		   while (m.find()) { 

		      m.appendReplacement(sb, "<font color=\"red\">;cat</font>;"); 

		   } 

		m.appendTail(sb); 

		System.out.println(sb.toString()+"<br>;"); 

		String aa=sb.toString(); 

		System.out.println(aa+"<br>;");

		//�ַ����ָ� 

		   p = Pattern.compile("a+"); 

		   String[] a=p.split("caaaaaat"); 

		   for(i=0;i<a.length;i++) 

		   { 

		   System.out.println(a+"<br>;"); 

		   } 

		   p = Pattern.compile("a+"); 

		   a=p.split("c aa aaaa t",0); 

		   for(i=0;i<a.length;i++) 

		   { 

		   System.out.println(a+"<br>;"); 

		   } 

		   p = Pattern.compile(" +"); 

		   a=p.split("c aa     aaaa t",0); 

		   for(i=0;i<a.length;i++) 

		   { 

		   System.out.println(a+"<br>;"); 

		   } 

		   p = Pattern.compile("\\+"); 

		   a=p.split("dsafasdfdsafsda+dsagfasdfa+sdafds"); 

		   System.out.println(a.length+"<br>;"); 

		   for(i=0;i<a.length;i++) 

		   { 

		   System.out.println(a+"<br>;"); 

		   }
	}
}

