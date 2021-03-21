package com.demo.io.processingstream;

import org.junit.Test;

public class BufferedOutputStreamDemoTest {

    @Test
    public void testWriteFile() {
        String filePath = System.getProperty("user.dir");
        filePath = filePath  + "/tmp/io/BufferedOutputStreamDemo.txt";
        BufferedOutputStreamDemo.writeFile(filePath);
    }
}
