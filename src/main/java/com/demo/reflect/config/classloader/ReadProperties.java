package com.demo.reflect.config.classloader;

import java.io.InputStream;
import java.util.Properties;
//企业中常用的读取properties文件的方法
public class ReadProperties {

    public static void main(String[] args) throws Exception  {
        //方法 1
        //InputStream inStream = ReadProperties.class.getClassLoader()
        //.getResourceAsStream("com/cn/config/classloader/config.properties");

        //方法 2(简便方法)
        InputStream inStream = ReadProperties.class.getResourceAsStream("resource/config.properties");
        Properties properties = new Properties();
        properties.load(inStream);
        inStream.close();
        System.out.println(properties.get("name"));
    }
}
