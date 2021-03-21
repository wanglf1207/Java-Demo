package com.demo.grammer.hexbindecoct;

import org.apache.log4j.Logger;

/**
 * 进制转换
 */
public class HexBinDecOct {

    private static Logger logger = Logger.getLogger(HexBinDecOct.class);
    /**
     * 十进制转十六进制
     * @param i
     * @return
     */
    public static String decimalismToHexadecimal(int i) {
        String str = Integer.toHexString(i);
        return str;
    }

    /**
     * 十六进制转十进制
     * @param str
     * @return
     */
    public static int hexadecimalToDecimalism(String str) {
        int i = Integer.parseInt(str,16);
        return i;
    }

    /**
     * 十进制转二进制
     * @param i
     * @return
     */
    public static String decimalismToBinary(int i) {

        String str = Integer.toBinaryString(i);
        return str;
    }

    /**
     * 2进制转10进制
     * @param str
     * @return
     */
    public static int binaryToDecimalism(String str) {
        int i = Integer.parseInt(str,2);
        return i;
    }
}
