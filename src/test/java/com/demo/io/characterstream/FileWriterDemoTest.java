package com.demo.io.characterstream;

import org.junit.Test;

public class FileWriterDemoTest {

    @Test
    public void testWriteUnicode() {
        String filePath = System.getProperty("user.dir");
        FileWriterDemo.printUnicode(filePath);
    }

    @Test
    public void testWriteCharacter() {
        String filePath = System.getProperty("user.dir");
        FileWriterDemo.writeCharacter(filePath);
    }

    @Test
    public void testWriteCharacter1() {
        String filePath = System.getProperty("user.dir");
        FileWriterDemo.writeCharacter1(filePath);
    }
}
