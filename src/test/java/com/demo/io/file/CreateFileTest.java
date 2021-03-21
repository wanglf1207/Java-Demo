package com.demo.io.file;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateFileTest {

    @Test
    public void testCreateFile() {
        int i = new CreateFile().createFile();
        assertThat(i, is(0));
    }
}
