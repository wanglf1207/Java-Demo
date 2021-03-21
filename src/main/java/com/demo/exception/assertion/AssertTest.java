package com.demo.exception.assertion;

/**
 *
 */
public class AssertTest {
    public static void main(String[] args) {
         int a = 10;
         int b = 20;
         assert a > b : "错误,a不大于b";
         System.out.println(a);
    }

}