package com.demo.io.processingstream;

import com.demo.io.processingstream.BufferedReaderDemo;
import org.junit.Test;

import java.io.File;

public class BufferedReaderDemoTest {

    /**
     * 键盘输入不能用junit测试，必须使用main方法
     */
   /* @Test
    public void testKeyboardInput() {
        BufferedReaderDemo.keyboardInput();
    }*/

   @Test
   public void testReadFile() throws  Exception{
       String filePath = System.getProperty("user.dir")
               + File.separatorChar
               + "src" + File.separatorChar + "main"
               + File.separatorChar + "resources" + File.separatorChar
               + "file" + File.separatorChar + "BufferReaderDemo1.txt";
       BufferedReaderDemo.readFile(filePath);
   }
}
