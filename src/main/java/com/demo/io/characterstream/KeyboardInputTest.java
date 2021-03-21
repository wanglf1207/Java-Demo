package com.demo.io.characterstream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
/**
 * @author wanglf1207
 * ��������
 */
public class KeyboardInputTest {

	/**
	 * �Ӽ��̻�ȡ�����ַ�
	 * @return
	 * @throws IOException
	 */
	public static char getChar() throws IOException {
		return (char) System.in.read();
	}
	
	/**
	 * BufferedReader�ķ�ʽ�Ӽ��̻�ȡ�ַ���
	 * @return
	 * @throws IOException
	 */
	public static String getInputString () throws IOException {
		
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
		return bufferReader.readLine();
		
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String getString () throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = "";
		
		String name = scanner.nextLine();
		
		str += name;
		
		String age = scanner.nextLine();
		
		str += age;
		
		scanner.close();
		return str;
	}
	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		/*char ch = getChar();
		System.out.println(ch);*/
		
		//System.out.println(getInputString());
		
		System.out.println(getString());
	}

}
