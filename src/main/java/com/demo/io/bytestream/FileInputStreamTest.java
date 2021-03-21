package com.demo.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author wanglf1207
 * @since 09/12/20
 * 该程序的作用就是将本程序通过IO读取，输出打印到控制台上
 */
public class FileInputStreamTest {

    /**
     *
     * @param args
     */
	public static void main(String[] args) {
		
		InputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("E:\\Temp\\FileInputStreamTest.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			byte[] buffer = new byte[1024];
			System.out.println(buffer.length);
			int hasRead = 0;  
			StringBuffer stringBuffer = new StringBuffer("");  
			while((hasRead = fileInputStream.read(buffer)) != -1) {
			    stringBuffer.append(new String(buffer, 0, hasRead, "GBK"));
                System.out.println(hasRead);
                // hasRead是读出来的字节数，两个汉字6个字节，一个字节八个二进制位
		    }

            fileInputStream.close();
            System.out.println(stringBuffer);

            } catch (IOException e) {
                e.printStackTrace();
            }
		
	}
}
