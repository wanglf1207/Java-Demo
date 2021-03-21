package com.demo.gui.frame;

import java.awt.BorderLayout;  
import java.awt.Frame;  
import java.awt.TextArea;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
  
public class MyFrame3 extends Frame implements WindowListener {// ʵ�ִ����¼������ӿ�  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextArea textArea1 = new TextArea(6, 30);  
  
    public MyFrame3() {  
        super("�����¼�ʾ��");  
        this.add(textArea1, BorderLayout.CENTER);  
        addWindowListener(this);// ���ı�������Ӵ����¼�����  
        setSize(400, 300);  
        setVisible(true);  
  
    }  
  
    public static void main(String[] args) {  
        new MyFrame3();  
    }  
  
    @Override  
    public void windowActivated(WindowEvent e) {  
        textArea1.append("���ڱ�����\n");// ���ڱ�����ʱ��ʾ"���ڱ�����"  
  
    }  
  
    @Override  
    public void windowClosed(WindowEvent e) {  
    }  
  
    @Override  
    public void windowClosing(WindowEvent e) {  
        System.exit(0);// ϵͳ�˳�  
    }  
  
    @Override  
    public void windowDeactivated(WindowEvent e) {  
        textArea1.append("����ʧȥ����\n");// ����ʧȥ����ʱ��ʾ"����ʧȥ����"  
  
    }  
  
    @Override  
    public void windowDeiconified(WindowEvent e) {  
        textArea1.append("���ڻ�ԭ\n");// ���ڻ�ԭʱ��ʾ"���ڻ�ԭ"  
  
    }  
  
    @Override  
    public void windowIconified(WindowEvent e) {  
        textArea1.append("������С��\n");// ������С��ʱ��ʾ"������С��"  
    }  
  
    @Override  
    public void windowOpened(WindowEvent e) {  
        textArea1.append("���ڱ���\n");// ���ڱ���ʱ��ʾ"���ڱ���"  
    }  
  
}  

