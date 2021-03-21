package com.demo.grammer.datatype.character;

/**
 * @author wanglf
 */
public class CharacterTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c = 'x';
		System.out.println("c = " + c);
		Character c1 = new Character(c);
		System.out.println("c1 = " + c1);
		System.out.println(c1.getClass().getName());
		System.out.println(c1.getClass());
		System.out.println(Character.class.getName());
		System.out.println((int)c1);
		
		
		
		Character character = new Character('C');
		System.out.println(character);
		System.out.println(character.charValue());
		System.out.println(Character.MAX_VALUE);

		/* 此处也能说明在Java中汉字是一个字符*/
		char c2 = '中';
		System.out.println(c2);

		
	}
}
