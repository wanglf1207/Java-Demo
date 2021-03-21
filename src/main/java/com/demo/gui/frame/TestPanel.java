package com.demo.gui.frame;

import java.awt.Color;

/**
 * @author wlf
 *
 */
public class TestPanel {

	/**
	 * @param args
	 * setBounds(int x, int y, int width, int height)移动组件并调整其大小。
	 * Color(int r, int g, int b)创建具有指定红色、绿色和蓝色值的不透明的 sRGB 颜色，
	 * 这些值都在 (0 - 255) 的范围内。
	 */
	public static void main(String[] args){

		java.awt.Frame frame = new java.awt.Frame("Java Frame with Panel");
		java.awt.Panel panel = new java.awt.Panel(null);
		frame.setLayout(null);
		frame.setBounds(100,100,800,500);
		frame.setBackground(new Color(0,255,0));

		panel.setBounds(50, 50, 700, 400);//50,50,相对于frame
		panel.setBackground(new Color(255,0,0));
		frame.add(panel);
		frame.setVisible(true);
	}
}
