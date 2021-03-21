package com.demo.io.characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * ͨ��FileReader��FileWriterʵ���ļ��ĸ��ƹ��ܣ������У��ǽ���ǰ���ļ������ݸ��Ƶ�һ���µ��ļ���
 * ������ļ�E:E:/Study/JavaEE/workspace/Java-Demo/file/NewCoppyFileTest.newfile
 * �����ڣ���������ʱ���ᱨ��FileNotFoundException
 * @author wanglf1207
 * @since 2010��4��
 */
public class CoppyFileTest {
	
	public static void main(String[] args) {
		
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		int b = 0;
		
		try {
			fileReader = new FileReader("E:/Study/JavaEE/workspace"
					+ "/Java-Demo/src/com/cn/demo/io/characterstream/CoppyFileTest.java");
			fileWriter = new FileWriter("E:/Study/JavaEE/workspace"
					+"/Java-Demo/src/com/cn/demo/io/characterstream/CoppyFileTest.newfile");
			while((b=fileReader.read()) != -1) {
				fileWriter.write(b);
				b++;
			}
			fileReader.close();
			fileWriter.close();
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		System.out.println("�������......");
	}
}
