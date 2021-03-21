package com.demo.newfeature.java8;

import  static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import com.google.common.collect.Lists;

public class StreamTest {

        /**
         *  先将list转化成流，然后进行过滤，最后使用count计算元素数量
         */
        @Test
        public void testCount() {

            List<Object> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
            long count = nums.stream().filter(num -> num != null).count();

            System.out.println(count);

        }

    /**
     * collect方法将流转化成集合
     */
    @Test
    public void testCollect() {

        List<Integer> nums = Lists.newArrayList(1,1,4,2,3,4,4,5,6,7,8,9,10);

        List<Integer> list = nums.stream().filter(num -> (num < 4)).collect(toList());

        System.out.println(list);

    }

    /**
     * distinct去重
     */
    @Test
    public void testDistinct() {
        List<Integer> nums = Lists.newArrayList(1,1,4,2,3,4,4,5,6,7,8,9,10);

        List<Integer> list = nums.stream().filter(num -> (num != 10)).distinct().collect(toList());

        System.out.println(list);
    }

    /**
     * 利用map方法可以将一个stream转换为一个新的stream
     */
    @Test
    public void testMap() {
        List<Integer> nums = Lists.newArrayList(1,1,4,2,3,4,4,5,6,7,8,9,10);

        List<Integer> list = nums.stream().filter(num -> (num != 10)).map(num -> num+1).collect(toList());

        System.out.println(list);
    }

    /**
     *
     */
    @Test
    public void testMap1() {
        List<String> list = Arrays.asList("sd","sdfsdf","ssssss");
        System.out.println(list);
        List<Integer> newList = list.stream().map(word -> word.length()).collect(toList());
        System.out.println(newList);
    }
    /**
     * flatMap是将小流转成大流
     */
    @Test
    public void testFlatMap() {
        List<Integer> nums = Stream.of(Arrays.asList(1,2),Arrays.asList(3,4))
                .flatMap(num -> num.stream()).collect(toList());

        System.out.println(nums);
        java.util.Date d = new java.util.Date();
    }

}
