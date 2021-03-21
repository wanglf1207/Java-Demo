package com.demo.io.file;

import java.io.File;

public class DeleteDirectoryAndFile {
    /**
     * 删除某个文件夹下的所有文件夹和文件
     * @param file File
     * @return boolean
     */
    public static void deleteFileAll(File file) {
        if (file.exists()) {
            File files[] = file.listFiles();
            int len = files.length;
            for (int i = 0; i < len; i++) {
                if (files[i].isDirectory()) {
                    deleteFileAll(files[i]);
                } else {
                    files[i].delete();
                }
            }
            file.delete();
        }
    }
}
