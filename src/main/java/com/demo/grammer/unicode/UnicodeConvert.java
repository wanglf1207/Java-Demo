package com.demo.grammer.unicode;

public class UnicodeConvert {

	/**
	 * Unicode码转中文字符
	 * @param str
	 */
	public static void unicodeToChineseChar(String str) {
		
		String [] chars = str.split(" ");
		
        for(int i=0;i<chars.length;i++) { 
        	
            System.out.println(chars[i]+" | "+(char)Integer.parseInt(chars[i],16));
            
        } 
	 }

}
