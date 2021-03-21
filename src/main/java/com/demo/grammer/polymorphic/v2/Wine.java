package com.demo.grammer.polymorphic.v2;

public class Wine {
	
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wine(){
    }
    
    public String drink(){
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
     */
    public String toString(){
        return null;
    }
}
