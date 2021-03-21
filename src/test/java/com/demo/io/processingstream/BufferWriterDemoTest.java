package com.demo.io.processingstream;

import com.demo.io.processingstream.BufferWriterDemo;
import org.junit.Test;

public class BufferWriterDemoTest {

    @Test
    public void testWriteFile() {
        String filePath = System.getProperty("user.dir");
        filePath = filePath + "/tmp/io/BufferWriterDemo.txt";
        BufferWriterDemo.writeFile(filePath);
    }
}
