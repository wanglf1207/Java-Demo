package com.demo.gui.frame;
import java.awt.*;

public class TestMultiFrame {
	
    public static void main(String args[]) {
        @SuppressWarnings("unused")
		MyFrame f1 = new MyFrame(100,100,200,200,Color.BLUE);
        @SuppressWarnings("unused")
		MyFrame f2 = new MyFrame(300,100,200,200,Color.YELLOW);
        @SuppressWarnings("unused")
		MyFrame f3 = new MyFrame(100,300,200,200,Color.GREEN);
        @SuppressWarnings("unused")
		MyFrame f4 = new MyFrame(300,300,200,200,Color.MAGENTA);
    }
}




class MyFrame extends Frame{
	
	private static final long serialVersionUID = 1L;
	static int id = 0;
    /**
     * @param x
     * @param y
     * @param w
     * @param h
     * @param color
     * setLayout(LayoutManager mgr);//���ô������Ĳ��ֹ�������
     */
    MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame " + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
