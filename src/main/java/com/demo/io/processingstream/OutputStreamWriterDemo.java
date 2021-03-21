package com.demo.io.processingstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

    public static void writeFile(String filePath) {
        try {
            // 将字节流转换为字符流，即写入out的数据会自动由字节转换为字符。
            OutputStreamWriter out1 = new OutputStreamWriter(
                    new FileOutputStream(filePath), "UTF-8");
            // 写入8个汉字，OutputStreamWriter提供了write(String str)方法
            out1.write("好好学习快乐生活");
            // 向“文件中”写入"0123456789"+换行符
            out1.write("0123456789\n");

            out1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
