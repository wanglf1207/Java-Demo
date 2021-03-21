package com.demo.string.string.str2byte;

public class StringByteConvert {

	public StringByteConvert() {
	}
	
	public static void main(String [] args) {
		
		
		String str = "wanglifeng";
		
		byte [] b = str.getBytes(); 
		
		System.out.println(b.length); // outpus: 10

		String name = "王利峰";
		byte [] b1 = name.getBytes();
		System.out.println(b1.length); // outputs: 9

		// 总结：一个英文字母占一个字节，一个汉字占三个字节
		str = new String(b);
		
		System.out.println(str);
		
	}

}
