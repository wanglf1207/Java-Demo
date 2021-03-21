package com.demo.gui.frame;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	/**
	 * @param args
	 * @author wanglf1207
	 * setLocation(int x,int y) ���齨�Ƶ���λ��
	 * setVisible(boolean b) ���ݲ��� b ��ֵ��ʾ�����ش����,��дĬ��false
	 */
	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.setLocation(100, 100);
		frame.setSize(800,600);
		frame.setResizable(true);
		frame.setBackground(Color.white);
		frame.setVisible(true);
		
	}
}
