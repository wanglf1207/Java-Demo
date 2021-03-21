package com.demo.grammer.initialization;

class Rock {
	int x = 100;
	Rock() {
		System.out.println("Rock...");
	}
}
public class SimpleConstructor {
	public static void main(String[] args) {
		Rock rock = null;
		for(int i=0;i<10;i++)
			rock = new Rock();
		System.out.println(rock.x);
	}
}
