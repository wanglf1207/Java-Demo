package com.demo.grammer.innerclass;

interface IContent1 {   
    int value();   
}   
 
interface IDestination1 {   
    String readLabel();   
}   
/**
 * 
 * @author wanglf1207
 *
 */
public class Goods1 {   
	private int valueRate = 2; //�۸���
	private int goodSum = 100;
    private class Content1 implements IContent1 {  
    	private int goodSum = 200;
        private int i = 11 * valueRate;   
        public int value() {
        	System.out.println("�ڲ����value����....");
            return i;    
        }   
    }     
  
    public IContent1 cont() {
    	System.out.println("�ⲿ���cont����....");
        return new Content1();   
    }   
    
    /**
     * @param args
     */
    public static void main(String[] args) {   
    	
    	Goods1.Content1 content = new Goods1().new Content1();
	    // �����ⲿ��ı���
	    System.out.println(new Goods1().goodSum);
	    // �����ڲ���ı���
	    System.out.println(content.goodSum);
    }   
}   