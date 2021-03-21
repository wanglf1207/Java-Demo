package com.cn.coyote.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCoppyFile {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		int b = 0;
		try {
			fr = new FileReader("E:/coyote/Java/Workspace/Java_IO/src" +
					"/com/cn/coyote/io/TestCoppyFile.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		try {
			fw = new FileWriter("E:/coyote/Java/Workspace/Java_IO/file" +
					"/testwriter.java");
			while((b=fr.read())!=-1) {
				fw.write(b);
				b++;
			}
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("复制完毕");
	}
}
