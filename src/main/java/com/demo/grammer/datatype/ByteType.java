package com.demo.grammer.datatype;

import org.apache.log4j.Logger;

public class ByteType {

    private static Logger logger = Logger.getLogger(ByteType.class);

    public static void basicInfo() {
        logger.info("Byte类型最大值" + Byte.MAX_VALUE);
        logger.info("Byte类型最小值" + Byte.MIN_VALUE);
    }

    public static void definedByteTypeData() {
        // 定义十进制的byte值
        byte a = 1;
        byte b = -8;
        logger.info("a=" + a + " b=" + b);

        // 也可以用16进制表示，十六进制0x65对应十进制数为101
        byte c = 0x65;
        logger.info("c=" + c);

        byte d = 101;
        logger.info("d=" + d);
    }

    /**
     * 字节型数据转十六进制数据
     * @param b 需要进行转换的byte字节
     * @return  转换后的Hex字符串
     */
    public static String byteToHex(byte b){
        String hex = Integer.toHexString(b & 0xFF);
        if(hex.length() < 2){
            hex = "0" + hex;
        }
        return hex;
    }


    public static int byteToInt(byte b) {
        return (int)b;
    }

    public static int byteToInt2(byte b) {
        return  b & 0xff;
    }
}
