package com.demo.container.comparable;

import java.util.Arrays;

/**
 *
 * @author wanglf1207
 *
 */
class Student implements Comparable<Student> {

    private String name;
    private int age;
    private float score;

    /**
     * 构造方法
     * @param name
     * @param age
     * @param score
     */
    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /**
     * 重写toString方法
     */
    public String toString() {
        return name + "\t" + age + "\t" + score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score)
            return -1;//由高到底排序
        else if(this.score < o.score)
            return 1;
        else {
            if(this.age > o.age)
                return 1;//由底到高排序
            else if(this.age<o.age)
                return -1;
            else
                return 0;
        }
    }
}

/**
 *
 * @author wanglf1207
 *
 */
public class ComparableTest1 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Student studentArray[] = {
                new Student("zhangs",20,90.0f),
                new Student("lisi",22,90.0f),
                new Student("wangwu",20,99.0f),
                new Student("sunliu",22,100.0f)};
        // 排序
        Arrays.sort(studentArray);

        for(Student s:studentArray) {
            System.out.println(s);
        }
    }
}
