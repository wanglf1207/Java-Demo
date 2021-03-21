package com.demo.grammer;

public class OperationDemo {

    /**
     * 与运算，同为1结果才是1
     * @param a
     * @param b
     * @return
     */
    public static int collationOperation(int a,int b) {
        return a&b;
    }

    /**
     * 或运算
     * @param a
     * @param b
     * @return
     */
    public static int orOperation(int a,int b) {
        return a|b;
    }

    /**
     * 非运算
     * @param a
     * @return
     */
    public static int notOperation(int a) {
        return ~a;
    }

    /**
     * 亦或运算
     * @param a
     * @param b
     * @return
     */
    public static int xorOperation(int a, int b) {
        return a^b;
    }

    /**
     * 移位运算符
     * @param a
     * @return
     */
    public static int shiftOpertion(int a) {

        //Integer.toBinaryString()是将数字用二进制格式显示
        System.out.println(Integer.toBinaryString(a));
        //左移两位
        int j = a<<2;
        System.out.println(Integer.toBinaryString(j));
        //右移两位
        int m = a>>2;
        System.out.println(Integer.toBinaryString(m));
        //无符号右移
        int n = a>>>2;
        System.out.println(Integer.toBinaryString(n));
        return n;
    }
}
