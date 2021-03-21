package com.demo.reflect.reflect.field;

import java.lang.reflect.Field;

public class FieldRelect {
    public static void main(String[] args) throws Exception {
        ReflectPoint rp = new ReflectPoint(3,5);
        //fieldY不是对象身上的变量，而是类上的，要用它去取对应对象上得值
        Field fieldY = rp.getClass().getField("y");
        System.out.println("y的值是" + fieldY.get(rp));

        //变量x是私有的，所以这里要用getDeclaredField()方法，（获得声明的变量）
        Field fieldX = rp.getClass().getDeclaredField("x");
        //把fieldX设置成可以访问，这种叫暴力反射
        fieldX.setAccessible(true);
        System.out.println("x的值是" + fieldX.get(rp));
    }
}


//ReflectPoint.java 用作反射用
class ReflectPoint {
    @SuppressWarnings("unused")
    private int x;
    public int y;

    public ReflectPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}
