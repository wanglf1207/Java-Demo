package com.demo.grammer.datatype;

import org.junit.Test;

public class ByteTypeTest {

    @Test
    public void testBasicInfo() {
        ByteType.basicInfo();
    }

    @Test
    public void testDefinedByteTypeData() {
        ByteType.definedByteTypeData();
    }

    @Test
    public void testByteToHex() {
        byte a = 101;
        System.out.println( ByteType.byteToHex(a));
    }

    @Test
    public void testByteToInt() {
        byte b = 120;
        System.out.println("转化后的十进制数字为 : "
                + ByteType.byteToInt(b));
    }

    @Test
    public void testByteToInt2() {
        byte b = 120;
        System.out.println("转化后的十进制数字为 : "
                + ByteType.byteToInt2(b));
    }

}
