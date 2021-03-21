package com.demo.io.bytestream;

import org.junit.Test;

public class FileInputStreamAndFileOutputStreamDemoTest {

    String filePath = System.getProperty("user.dir");

    @Test
    public void testCopyFile1() {

        FileInputStreamAndFileOutputStreamDemo.copyFile1(filePath);
    }

    @Test
    public void testCopyFile2() {
        FileInputStreamAndFileOutputStreamDemo.copyFile2(filePath);
    }

    @Test
    public void testCopyFile3() {
        FileInputStreamAndFileOutputStreamDemo.copyFile3(filePath);
    }

    @Test
    public void testCopyFile4() {
        FileInputStreamAndFileOutputStreamDemo.copyFile4(filePath);
    }
}
