package com.demo.io.processingstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BufferedInputStreamDemo {

	public static void readFile(String filePath) {

		try {
			File file = new File(filePath);
			InputStream fileInputStream = new FileInputStream(file);

			// 创建一个缓冲区大小为512字节的字节缓冲输入流
			InputStream bufferedInputStream = new BufferedInputStream(fileInputStream,512);

			// 从字节流中读取5个字节。“abcde”，a对应0x61，b对应0x62，依次类推...
			for (int i=0; i<5; i++) {
				// 若能继续读取下一个字节，则读取下一个字节
				if (bufferedInputStream.available() >= 0) {
					// 读取“字节流的下一个字节”
					int tmp = bufferedInputStream.read();
					System.out.printf("%d : 0x%s\n", i, Integer.toHexString(tmp));
				}
			}

			// 测试BufferedInputStream是否支持mark功能
			System.out.println("是否支付mark？ : " + bufferedInputStream.markSupported());

			/**
			 * 标记“当前索引位置”，即标记第6个位置的元素--“f”
			 * readlimit - 标记位置无效之前可以读取的最大字节数。
			 * 1024对应marklimit
			 */
			bufferedInputStream.mark(1024);

			System.out.println("跳过22个字节");
			bufferedInputStream.skip(22);

			System.out.println("读取5个字节");
			byte[] buf = new byte[5];
			bufferedInputStream.read(buf, 0, 5);
			// 将buf转换为String字符串。
			String str1 = new String(buf);
			System.out.printf("str1=%s\n", str1);

			// 重置“输入流的索引”为mark()所标记的位置，即重置到“f”处。
			bufferedInputStream.reset();
			// 从“重置后的字节流”中读取5个字节到buf中。即读取“fghij”
			System.out.println("reset结束，在读取5个");
			bufferedInputStream.read(buf, 0, 5);
			// 将buf转换为String字符串。
			String str2 = new String(buf);
			System.out.printf("str2=%s\n", str2);

			bufferedInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}