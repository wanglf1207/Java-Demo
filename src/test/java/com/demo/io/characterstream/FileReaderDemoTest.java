package com.demo.io.characterstream;

import org.junit.Test;
public class FileReaderDemoTest {

    @Test
    public void testReadFile1() {

        String filePath = System.getProperty("user.dir");
        FileReaderDemo.readFile1(filePath);
    }

    @Test
    public void testReadFile2() {

        String filePath = System.getProperty("user.dir");
        FileReaderDemo.readFile2(filePath);
    }

    @Test
    public void testReadFile3() {

        String filePath = System.getProperty("user.dir");
        FileReaderDemo.readFile3(filePath);
    }
}
