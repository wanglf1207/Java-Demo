package com.demo.io.characterstream;

import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class FileWriterDemo {

	private static Logger logger = Logger.getLogger(FileWriterDemo.class);

	/**
	 * 打印Unicode码表
	 */
	public static void printUnicode(String filePath) {
		logger.info("filePath is : "+ filePath);
		FileWriter fw = null;
		try {
			fw = new FileWriter(filePath+ "/tmp/io/FileWriterDemo.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(int c=0;c<=65535;c++) {
			try {
				fw.write(c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

    /**
     * 将自定义的数组写入到文件中
     * @param filePath
     */
	public static void writeCharacter(String filePath) {
	    char [] chars = {'h','e','l','l','o'};
	    char [] chars1 = {'世','界'};
        try {
            Writer writer = new FileWriter(filePath + "/tmp/io/FileWriterDemo2.txt");
            writer.write(chars);
            writer.write(chars1);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeCharacter1(String filePath) {

        char [] chars = {'h','e','l','l','o'};
        try {
            Writer writer = new FileWriter(filePath + "/tmp/io/FileWriterDemo3.txt");
            writer.write(chars,0,4);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
