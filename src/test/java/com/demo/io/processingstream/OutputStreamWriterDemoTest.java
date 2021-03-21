package com.demo.io.processingstream;

import org.junit.Test;

public class OutputStreamWriterDemoTest {

    @Test
    public void testWriteFile() {
        String filePath = System.getProperty("user.dir");
        filePath = filePath + "/tmp/io/OutputStreamWriterDemo.txt";
        OutputStreamWriterDemo.writeFile(filePath);
    }
}
