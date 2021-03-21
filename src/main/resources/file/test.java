package com.cn.coyote.io;
import java.io.*;

/**
 * @author wlf
 * 打印出的结果是乱码，因为是字节流，一个汉字两个字节
 */
public class TestFileInputStream {

    /**
     * @param args
     * int read() 从此输入流中读取一个数据字节。
     */
    public static void main(String[] args) {

        int b = 0;
        FileInputStream in = null;

        try {
            in = new FileInputStream("E:/coyote/Java/Workspace/Java_IO/src" +
                    "/com/cn/coyote/io/TestFileInputStream.java");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        }

        try {
            long num = 0;
            while((b=in.read())!=-1){
                System.out.print((char)b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("共读取了 "+num+" 个字节");
        } catch (IOException e1) {
            System.out.println("文件读取错误"); System.exit(-1);
        }
    }
}