package com.demo.grammer.unicode;

import org.junit.Test;

public class UnicodeConvertTest {

    @Test
    public void testUnicodeToChineseChar() {
        String str = "5723 8BDE 5FEB 4E50";
        UnicodeConvert.unicodeToChineseChar(str);
    }
}
