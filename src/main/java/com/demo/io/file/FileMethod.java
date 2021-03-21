package com.demo.io.file;

import org.apache.log4j.Logger;

import java.io.File;
/**
 * 演示File类的方法
 */
public class FileMethod {

	private static Logger logger = Logger.getLogger(FileMethod.class);

	public static void fileMethod() {

		String pathname = System.getProperty("user.dir")
							+ File.separatorChar
							+ "tmp"
							+ File.separatorChar
				            + "io"
				            + File.separatorChar
				            + "createFile2.tmp";
		logger.info(pathname);
		File file = new File(pathname);
		logger.info(file.canExecute());
		logger.info(file.canRead());
		logger.info(file.canWrite());

	}
}
