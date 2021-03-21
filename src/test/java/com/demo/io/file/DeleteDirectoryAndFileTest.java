package com.demo.io.file;

import org.junit.Test;

import java.io.File;

public class DeleteDirectoryAndFileTest {

    @Test
    public void testDeleteDirectoryAndPath() {
        String filePath = "E:\\tmpDirectory";
        File file = new File(filePath);
        DeleteDirectoryAndFile.deleteFileAll(file);
    }
}
