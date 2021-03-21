package com.demo.io.bytestream;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @since 09/12/20
 */
public class FileInputStreamAndFileOutputStreamDemo {

	private static Logger logger = Logger.getLogger(FileInputStreamAndFileOutputStreamDemo.class);

    /**
     * FileInputStream read() 从该输入流读取一个字节的数据。
     * FileOutputStream write(int i) 将指定的字节写入此文件输出流。
     * @param filePath
     */
	public static void copyFile1(String filePath) {

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			logger.info("创建输入流");
			in = new FileInputStream(filePath + "/src/main/java/com/demo/io/bytestream/" +
					"FileInputStreamAndFileOutputStreamDemo.java");

			logger.info("创建输出流");
			out = new FileOutputStream(filePath + "/tmp/io/" +
					"FileInputStreamAndFileOutputStreamDemo1.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i;
		try {
			// read() 从该输入流读取一个字节的数据。
			while((i=in.read())!=-1) {
				System.out.print((char)i);
				out.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    /**
     * read(byte[] b)
     * 从该输入流读取最多 b.length个字节的数据为字节数组。
     * write(int b)
     * 将指定的字节写入此文件输出流。
     *
     * 使用该方法发现写入的文件缺失一部分内容
     * @param filePath
     */
    public static void copyFile2(String filePath) {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
          in = new FileInputStream(filePath + "/src/main/java/com/demo/io/bytestream/" +
                    "FileInputStreamAndFileOutputStreamDemo.java");
			/*in = new FileInputStream(filePath + "/src/main/resources/file/" +
					"FileInputStreamAndFileOutputStreamDemo2.txt");*/
            out = new FileOutputStream(filePath + "/tmp/io/" +
                    "FileInputStreamAndFileOutputStreamDemo2.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // read() 从该输入流读取一个字节的数据。
            byte [] buffer = new byte[1024];
            while((in.read(buffer))!=-1) {
                out.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void copyFile3(String filePath) {

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
          in = new FileInputStream(filePath + "/src/main/java/com/demo/io/bytestream/" +
                    "FileInputStreamAndFileOutputStreamDemo.java");
          out = new FileOutputStream(filePath + "/tmp/io/" +
					"FileInputStreamAndFileOutputStreamDemo3.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int len;
		try {
			byte [] bytes = new byte[1024];
			while((len=in.read(bytes))!=-1) {
				out.write(bytes,0,len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 拷贝mp3文件
	 * @param filePath
	 */
	public static void copyFile4(String filePath) {

		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(filePath + "/tmp/io/wanghouyusheng.mp3");
			out = new FileOutputStream(filePath  + "/tmp/io/wanghouyusheng_bak.mp3");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int len;
		try {
			byte [] bytes = new byte[1024*3];
			while((len=in.read(bytes))!=-1) {
				out.write(bytes,0,len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
