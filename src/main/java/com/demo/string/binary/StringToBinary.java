package com.demo.string.binary;

import java.math.BigInteger;

public class StringToBinary {
	
	public static void main(String[] args) {

		String str = "java";
		
		byte[] bytes = str.getBytes();
		
		/*
		 * output:
		 */
		System.out.println(bytes);

		System.out.println(new BigInteger(1, bytes).toString(2)); //output: 1101010011000010111011001100001
	}

}
