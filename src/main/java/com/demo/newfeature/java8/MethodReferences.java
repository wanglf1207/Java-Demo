package com.demo.newfeature.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferences {

    /**
     * 静态方法引用
     */
    public static void testStaticMethodRef() {
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        /*
         * 有时候Lambda表达式的代码就只是一个简单的方法调用而已，
         * 遇到这种情况，Lambda表达式还可以进一步简化为方法引用（Method References）。
         * 一共有四种形式的方法引用，第一种引用静态方法，例如
         */
        ints.sort(Integer :: compare);
        System.out.println(ints);
    }

    /**
     * 引用某个特定对象的实例方法
     */
    public static void testInstantMethodRef() {
        List<Integer> ints = Arrays.asList(1,2,3,4);
        ints.forEach(System.out :: println);

    }

    @Test
    public  void testClassInstantMethodRef() {
        List<String> words = Arrays.asList("apple","banana","pear");
        List<Integer> newList = words.stream().map(word -> word.length()).collect(Collectors.toList());
        System.out.println(newList);
    }
    public static void main(String [] args) {
        /*testStaticMethodRef();*/
        /*testInstantMethodRef();*/
    }
}
