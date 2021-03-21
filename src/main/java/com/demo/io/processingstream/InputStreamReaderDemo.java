package com.demo.io.processingstream;


import java.io.*;

public class InputStreamReaderDemo {

    /**
     * 会将内容转换成utf-8的内容转换成字节并读出来。
     * @param filePath
     */
    public static void readFile(String filePath) {

        try {
            InputStream inputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader =
                    new InputStreamReader(inputStream,"UTF-8");
            System.out.println("读取一个字符");
            char ch = (char)inputStreamReader.read();
            System.out.println(ch);

            System.out.println("跳过3个字节");
            inputStreamReader.skip(3);

            System.out.println("读取512个字节");
            char [] buf = new char[512];
            inputStreamReader.read(buf,0,buf.length);
            System.out.println(new String(buf));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
