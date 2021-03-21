package com.demo.string;

import java.math.BigInteger;

public class StringToBinary {
	
	public static void main(String[] args) {

		String str = "java";
		byte[] bytes = str.getBytes();
		
		System.out.println(bytes); //output :[B@39fc0f04

		System.out.println(new BigInteger(1, bytes).toString(2)); //output: 1101010011000010111011001100001
	}

}
