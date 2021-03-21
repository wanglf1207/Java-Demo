package com.demo.grammer.annotation;

public class Apple {

    @FruitName("Apple11")
    private String appleName;

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
    public static void main(String[] args) {
        System.out.println(new Apple().getAppleName());
    }
}
