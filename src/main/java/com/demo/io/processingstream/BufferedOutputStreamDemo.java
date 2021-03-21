package com.demo.io.processingstream;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.SecurityException;


public class BufferedOutputStreamDemo {

	// 对应英文字母“abcddefghijklmnopqrsttuvwxyz”
	private static final byte[] ArrayLetters = {
			0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69,
			0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70, 0x71, 0x72,
			0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A
	};

	public static void writeFile(String filePath) {

		// 它对应缓冲区的大小是16，即缓冲区的数据>=16时，会自动将缓冲区的内容写入到输出流。
		try {

			OutputStream out = new BufferedOutputStream(new FileOutputStream(filePath), 16);

			// 将ArrayLetters数组的前10个字节写入到输出流中
			out.write(ArrayLetters, 0, 10);
			// 将“换行符\n”写入到输出流中
			out.write('\n');

			// 我把flush注释掉也能写入，是因为close
			out.flush();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}