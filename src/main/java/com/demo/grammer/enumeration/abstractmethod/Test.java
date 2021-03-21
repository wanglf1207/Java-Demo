package com.demo.grammer.enumeration.abstractmethod;

public class Test {
	public static void main(String[] args) {
		TrafficLamp tl = TrafficLamp.RED.nextLamp();
		System.out.println(tl);
	}
}
