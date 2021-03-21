package com.demo.socket.url;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

class T {
	
	public static void main(String[] args) {
		
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		
		try {
			URL url = new URL("http://www.baidu.com"); //���������Դ
			
			// UTF-8���������������
			InputStream inputStream	= url.openStream();  //���URL������������
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
			// System.out.println(fr.getEncoding());
			bufferedReader = new BufferedReader(inputStreamReader);  //��ȡ����װ�ַ���
			fileWriter = new FileWriter("D://baidu.html"); //����Ϊ�ļ�

			String str = null;
			while(( str = bufferedReader.readLine()) != null){ //����
				System.out.println(str);
				fileWriter.write(str+"\r\n");
				fileWriter.flush();
			}
		} catch (MalformedURLException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				fileWriter.flush();
				fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
   }
}


