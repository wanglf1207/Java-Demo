package com.demo.grammer.polymorphic.v1;

class Animal {
	
  private String name;
  
  Animal(String name) {
	  this.setName(name);
  }
  
  public void enjoy(){
    System.out.println("Animal����......");
  }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
  
}

class Cat extends Animal {
	
  private String eyesColor;
  
  Cat(String n,String c) {
	  super(n); 
	  setEyesColor(c);
  }
  public void enjoy() {
    System.out.println("Cat����......");
  }
public String getEyesColor() {
	return eyesColor;
}
public void setEyesColor(String eyesColor) {
	this.eyesColor = eyesColor;
}
}

class Lady {
	
    private String name;
    private Animal pet;
    
    Lady(String name,Animal pet) {
        this.setName(name); 
        this.pet = pet;
    }
    public void myPetEnjoy(){
    	pet.enjoy();
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class T1 {
    public static void main(String args[]){
    	
        Cat cat = new Cat("tom","blue");
        Lady lady1 = new Lady("jade",cat);
        lady1.myPetEnjoy();
    }
}
