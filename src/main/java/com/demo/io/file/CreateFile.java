package com.demo.io.file;

import org.apache.log4j.Logger;
import java.io.File;
import java.io.IOException;

/**
 * @author wanglf1207
 */
public class CreateFile {

	private static Logger logger = Logger.getLogger(CreateFile.class);

	public int createFile() {

		String filePath = System.getProperty("user.dir")
				+ File.separatorChar
				+ "tmp"
				+ File.separatorChar
				+ "io"
				+ File.separatorChar;

		File file = new File(filePath + "CreateFile.txt");
		// 如果文件不存在，则创建文件
		if(!file.exists()) {
			try {
				logger.info("create new file");
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return 0;
		//如果文件存在，则删除再创建
		} else {
			logger.info("file already exists,delete file " + file.getName());
			file.delete();
			logger.info("create file ---");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return 0;
		}
	}

}
