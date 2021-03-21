package com.demo.io.file;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 演示File类的集中构造方法
 */
public class FileConstructor {

	private static Logger logger = Logger.getLogger(FileConstructor.class);

	/**
	 * @param filePath
	 */
	public static int createFile1(String filePath) {

		logger.info("the file path is " + filePath);
		String pathname = filePath + "/tmp/io/createFile1.txt";

		File file = new File(pathname);

		if(file.exists()) {
			logger.info("the file is exists already.");
			return 0;
		} else {
			try {
				file.createNewFile();
				System.out.println("Is the file exists? " + file.exists());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return 0;
		}
	}

	/**
	 * 两个参数的File构造方法
	 * @param filePath
	 */
	public static int createFile2(String filePath) {

		File parent = new File(filePath + "/tmp/io/");
		String child = "createFile2.txt";
		File file1 = new File(parent,child);
		if(!file1.exists()) {
			logger.info("file is not exists!");
			try {
				logger.info("create file now!");
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			logger.info("file has already exists!");
		}

		return 0;
	}

	public static int createFile3(String filePath) {
		logger.info("filePath is :" + filePath);
		File file = null;
		try {
			/* windows */
			 file = new File(new URI("file:///E:/Practice/Java-Demo/tmp/io/createFile3.tmp"));
			/* linux */
			//file = new File(new URI("file:" + filePath + "/tmp/io/createFile3.txt"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		if(file.exists()) {
			logger.info("file has already exists!");
		} else {
			logger.info("file is not exists,create file now!");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return 0;
	}
}
