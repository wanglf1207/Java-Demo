package com.demo.io.processingstream;

import java.io.*;

public class BufferWriterDemo {

	/**
	 * 使用BufferedWriter包装FileWriter实现文件写入
	 * @param filePath
	 */
	public static void writeFile(String filePath) {
		try {
			Writer writer = new FileWriter(filePath);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			String str;
			for(int i=0;i<=100;i++) {
				str = String.valueOf(Math.random());
				bufferedWriter.write(str);
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
