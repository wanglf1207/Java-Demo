package com.demo.gui.frame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;


/**
 * @author wanglf
 *
 */
public class CenterPanel {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		new MyFrame4(300, 300, 400, 300, Color.BLUE);
	}
}

class MyFrame4 extends Frame {

	private static final long serialVersionUID = 1L;
	private Panel p;

	MyFrame4(int x, int y, int w, int h, Color c) {
		super("FrameWithPanel");
		setLayout(null);
		setBounds(x, y, w, h);
		setBackground(c);
		p = new Panel(null);
		p.setBounds(w / 4, h / 4, w / 2, h / 2);
		p.setBackground(Color.YELLOW);
		add(p);
		setVisible(true);
	}
}//~
