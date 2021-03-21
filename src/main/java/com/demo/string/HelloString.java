package com.demo.string;

import java.nio.charset.Charset;

/**
 * 总结一下：
 * 无论是一个英文字母还是一个汉字，都是一个字符，一个英文字符占一个字符，汉字情况有点特殊
 * 如果是GBK编码的汉字占两个字符，如果是UTF8编码的汉字占3个字符。一个字符占两个字节
  */


public class HelloString {
	
	public static void main(String[] args) {
		String str1 = "hello";
		System.out.println(str1);
		System.out.println(str1.length());

		String str3 = "你好";
		System.out.println(str3.length());
       // byte [] b = str3.getBytes(Charset.forName("GBK")); // outputs: 4
        byte [] b = str3.getBytes(Charset.forName("UTF-8")); // outpus: 6
        System.out.println(b.length);
		String str2 = new String("java");
		System.out.println(str2);
	}
}
