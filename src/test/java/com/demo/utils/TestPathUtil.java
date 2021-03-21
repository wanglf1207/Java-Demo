package com.demo.utils;

public class TestPathUtil {
    public static String getAppRootPath(String fileName) {
        return System.getProperty("user.dir")+"/" + fileName;
    }
}
