package com.demo.io.file;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FileConstructorTest {

    @Test
    public void testCreateFile1() {
        String filePath = System.getProperty("user.dir");
        assertThat(FileConstructor.createFile1(filePath),is(0));
    }

    @Test
    public void testCreateFile2() {
        String filePath = System.getProperty("user.dir");
        assertThat(FileConstructor.createFile2(filePath),is(0));
    }

    @Test
    public void testCreateFile3() {
        String filePath = System.getProperty("user.dir");

        assertThat(FileConstructor.createFile3(filePath),is(0));

    }
}
