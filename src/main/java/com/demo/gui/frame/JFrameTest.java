package com.demo.gui.frame;

import javax.swing.JFrame;

public class JFrameTest {
	
	public static void main(String [] args) {
		JFrame jframe = new JFrame("hello swing");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(500,400);
		jframe.setVisible(true);
	}
}
