package com.demo.grammer.polymorphic.v2;

public class JGJ extends Wine{
    public JGJ(){
        setName("JGJ");
    }
    
    /**
     * ��д���෽����ʵ�ֶ�̬
     */
    public String drink(){
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
     */
    public String toString(){
        return "Wine : " + getName();
    }
}