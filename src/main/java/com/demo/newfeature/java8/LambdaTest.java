package com.demo.newfeature.java8;

import java.util.*;

import org.junit.Test;

/**
 * Lambda语法入门
 * @author wanglf1207
 *
 */
public class LambdaTest {
	
	/**
	 * 匿名类的方式创建一个新线程
	 */
	public static void runThreadUseClass() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runThreadUseClass---");
			}
		}).start();
	}
	
	/**
	 * Lambda方式创建新线程
	 * 新语法易读吗？没觉得
	 */
	public static void runThreadUseLambda() {
		// ()表示无参的run方法 箭头右侧是方法体
		new Thread(()-> System.out.println("runThreadUseLambda---")).start();
	}

	/**
	 * 使用传统的方式对list进行的排序
	 */
	public static void testSortList() {
		List<String> words = Arrays.asList("apple","orange","banana","pear");
		words.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(),o2.length());
			}
		});
		System.out.println(words);
	}

	public static  void testSortListOverLambda() {
		List<String> words = Arrays.asList("apple","orange","banana","pear");
		// 如果Lambda表达式的代码块只是return后面跟一个表达式，那么省略return.
		// 如果省略了return,前面的大括号也要省略
		words.sort((o1,o2) -> {return Integer.compare(o1.length(),o2.length());});
		System.out.println(words);
	}

	public static void testForEachOverLambda() {
		List<String> words = Arrays.asList("apple","orange","banana","pear");
		words.forEach(word -> System.out.println(word));
	}

	/**
	 * 传统的方法对List进行排序
	 */
	public static void sortList() {

		//这里省略list的构造 
		/*List<String> names = new ArrayList(); 

		Collections.sort(names, (o1, o2) -> o1.compareTo(o2)); */

		List<String> list1 = new ArrayList<String>(); 

		list1.add("B");list1.add("C");list1.add("A");list1.add("D");list1.add("E");
		Collections.sort(list1, new Comparator<String>() { 
		  @Override 
		  public int compare(String str1, String str2) { 
		    return str2.compareTo(str1); 
		  } 
		}); 
		System.out.println(list1);

	}
	
	/**
	 * 这里用到的Collections.sort方法有两个参数，第一个参数是
	 */
	public static void sortListUseLambda() {
		List <String> list1 = new ArrayList<String>();
		list1.add("B");list1.add("C");list1.add("A");list1.add("D");list1.add("E");
        /**
         * Collections.sort方法内部也是list.sort方法
         */
		//Collections.sort(list1,(str1,str2)-> str1.compareTo(str2));
		list1.sort((str1,str2)-> str1.compareTo(str2));
		System.out.println(list1);
	}
	
	public static void main(String[] args) {
		/*runThreadUseClass();*/
		
		/*runThreadUseLambda();*/

		/*testSortList();*/

		/*testSortListOverLambda();*/

		testForEachOverLambda();
		/*sortList();*/
		
		/*sortListUseLambda();*/


	}
}
