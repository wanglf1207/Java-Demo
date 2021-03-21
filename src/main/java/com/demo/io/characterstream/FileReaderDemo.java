package com.demo.io.characterstream;

import org.apache.log4j.Logger;

import java.io.*;

public class FileReaderDemo {

    private static Logger logger = Logger.getLogger(FileReaderDemo.class);


    public static void readFile1(String filePath) {

        logger.info("FileReaderDemo readFile1 start...");
        Reader reader = null;
        try {
            reader = new FileReader(filePath + File.separatorChar
                    + "src" + File.separatorChar + "main" + File.separatorChar
                    + "resources" + File.separatorChar + "file" + File.separatorChar
                    + "FileReaderDemo1.txt");

            int b;
            while ((b=reader.read())!=-1) {
                System.out.print((char)b);
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * 使用父类提供的read(char cbuf[])方法读取文本内容
     *
     * @param filePath 项目根路径
     */
	public static void readFile2(String filePath) {

        Reader fileReader = null;
        try {
            fileReader = new FileReader(filePath + File.separatorChar
                    + "src" + File.separatorChar + "main"
                    + File.separatorChar + "resources" + File.separatorChar
                    + "file" + File.separatorChar + "FileReaderDemo2.txt");

            char [] ch = new char[3];
            while ( (fileReader.read(ch))!=-1) {
                //System.out.println(bb);
                System.out.print(ch );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}

    public static void readFile3(String filePath) {

        Reader fileReader = null;
        Writer fileWriter = null;
        try {
            fileReader = new FileReader(filePath + File.separatorChar
                    + "src" + File.separatorChar + "main"
                    + File.separatorChar + "resources" + File.separatorChar
                    + "file" + File.separatorChar + "FileReaderDemo1.txt");

            fileWriter = new FileWriter(filePath + File.separatorChar
                    + "src" + File.separatorChar + "main"
                    + File.separatorChar + "resources" + File.separatorChar
                    + "file" + File.separatorChar + "FileReaderDemo3_OUT.txt");
            char [] ch = new char[4];
            int bb = 0;
            while ( (bb=fileReader.read(ch,0,ch.length))!=-1) {
                System.out.println(bb);
                System.out.println(ch);
                fileWriter.write(ch,0,bb);
            }
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
