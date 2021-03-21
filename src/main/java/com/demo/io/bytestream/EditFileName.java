package com.demo.io.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �������кܶ���Ƭ����Щ��Ƭ��Щ��ͬ���ģ��������ݲ�ͬ������дһ�������ĳ����޸���Ƭ�����ֲ�һ��
 * @author wanglf1207
 *  �޸��ļ����ֹ�����
 */
public class EditFileName {
	
	public static void editFileName() {
		
		File file = new File("D:/Album/�ҵ���Ƭ");
		File[] subFiles = file.listFiles();
		InputStream is = null;
		byte[] buffer = null;

		for (int i=0; i<subFiles.length; i++) {
			try {
				is = new FileInputStream(subFiles[i]);
				int length = is.available();
				buffer = new byte[length];
				is.read(buffer);
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			// �����޸�ΪnewName
			String newName = "�ҵ���Ƭ" + (i + 1) + ".JPG";

			System.out.println(newName);
			File file2 = new File("D:/Album/�ҵ���Ƭ/" + newName);
			OutputStream os = null;
			try {
				os = new FileOutputStream(file2);
				os.write(buffer);
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			// ��֮ǰ���ļ�ɾ��
			subFiles[i].delete();
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		editFileName();
	}
}