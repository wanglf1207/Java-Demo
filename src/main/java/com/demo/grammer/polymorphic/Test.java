package com.demo.grammer.polymorphic;

abstract class Animal {
	
  private String name;
  
  Animal(String name) {this.setName(name);}
  
  /*
  public void enjoy(){
    System.out.println("����......");
  }
  */
  
  public abstract void enjoy();

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
}

abstract class Cat extends Animal {
	
  private String eyesColor;
  Cat(String n,String c) {super(n); setEyesColor(c);}
  /*
  public void enjoy() {
    System.out.println("è����......");
  }
  */
  //public abstract void enjoy();
public String getEyesColor() {
	return eyesColor;
}
public void setEyesColor(String eyesColor) {
	this.eyesColor = eyesColor;
}
}

class Dog extends Animal {
  private String furColor;
  Dog(String n,String c) {super(n); setFurColor(c);}
 
  public void enjoy() {
    System.out.println("������......");
  }

public String getFurColor() {
	return furColor;
}

public void setFurColor(String furColor) {
	this.furColor = furColor;
}
}

class Bird extends Animal {
	 Bird() {
	 	 super("bird");
	 }
	 public void enjoy() {
    System.out.println("�����......");
  }
}

class Lady {
    private String name;
    private Animal pet;
    Lady(String name,Animal pet) {
        this.setName(name); this.pet = pet;
    }
    public void myPetEnjoy(){pet.enjoy();}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Test {
    public static void main(String args[]){
        //Cat c = new Cat("catname","blue");
        Dog d = new Dog("dogname","black");
        Bird b = new Bird();
        //Lady l1 = new Lady("l1",c);
        Lady l2 = new Lady("l2",d);
        Lady l3 = new Lady("l3",b);
       //l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}
