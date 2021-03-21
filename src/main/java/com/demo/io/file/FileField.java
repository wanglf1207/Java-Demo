package com.demo.io.file;

import java.io.File;
/**
 * File
 * @author wanglf1207
 *
 */
public class FileField {
	
	public static void printSeparator() {

		/**
		 * The system-dependent path-separator character.
		 */
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);

		/**
		 * The system-dependent default name-separator character.
		 */
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
	}
}
