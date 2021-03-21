package com.demo.io.processingstream;


import org.junit.Test;

import java.io.InputStreamReader;

public class InputStreamReaderDemoTest {

    @Test
    public void testReadFile() {
        String filePath = System.getProperty("user.dir");
        filePath = filePath + "/src/main/java/com/demo/" +
                "io/processingstream/InputStreamReaderDemo.java";
        InputStreamReaderDemo.readFile(filePath);
    }
}
