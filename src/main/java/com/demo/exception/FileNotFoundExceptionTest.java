package com.demo.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		try {
			in = new FileInputStream("myfile.txt");
			int b;
			b = in.read();
			while (b != -1) {
				System.out.print((char) b);
				b = in.read();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
