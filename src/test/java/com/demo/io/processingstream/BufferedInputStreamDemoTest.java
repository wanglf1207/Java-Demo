package com.demo.io.processingstream;

import org.junit.Test;

public class BufferedInputStreamDemoTest {

    @Test
    public void testReadFile() {
        String filePath = System.getProperty("user.dir");
        filePath  = filePath + "/src/main/resources/file/BufferedInputStreamDemo.txt";
        BufferedInputStreamDemo.readFile(filePath);
    }
}
