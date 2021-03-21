package com.demo.grammer.hexbindecoct;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class HexBinDecOctTest {

    /**
     * A~F表示10~15
     * be 11*16 + 14 = 190
     */
    @Test
    public void testDecimalismToHexadecimal() {
        int i=190;
        String str = HexBinDecOct.decimalismToHexadecimal(i);
        System.out.println(str);
    }
    @Test
    public void testHexadecimalToDecimalism() {
        String str = "5CF0";
        int i = HexBinDecOct.hexadecimalToDecimalism(str);
        System.out.println(i + "Unicode码对应的汉字是" + (char)i);
    }
    /**
     * 190=2+4+8+16+32+128
     */
    @Test
    public void testDecimalismToBinary() {
        int i=-127;
        String str = HexBinDecOct.decimalismToBinary(i);
        System.out.println(str);
    }

    /**
     * 00000111 = 1+2+4 = 7
     */
    @Test
    public void testBinaryToDecimalism() {
        String str = "00000111";
        int i = HexBinDecOct.binaryToDecimalism(str);
        System.out.println(i);
        Assert.assertThat(i, Is.is(7));
    }
}
