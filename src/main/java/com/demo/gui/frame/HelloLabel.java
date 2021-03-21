package com.demo.gui.frame;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloLabel {
	
	public static void main(String [] args) {
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Lable");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setVisible(true);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		label.setText("Hey, This is a diffferent!");
	}
}
