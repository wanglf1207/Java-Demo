package com.demo.array;


public class TwoDimentionArrayTest {

	public static void main(String [] args){  
	  
	     
	    int [][] arr = {{123},{456}};
	    for(int x = 0; x<arr.length; x++) {
	        for(int y = 0; y<arr[x].length; y++) {
	            System.out.print(arr[x][y]); 
	        } 
	        System.out.println(); 
	    } 
	      
	    int [][] num = new int [3][3];
	    num[0][0] = 1;
	    num[0][1] = 2;
	    num[0][2] = 3;
	      
	    num[1][0] = 4; //���ڶ��е�һ��Ԫ�ظ�ֵ  
	    num[1][1] = 5; //���ڶ��еڶ���Ԫ�ظ�ֵ  
	    num[1][2] = 6; //���ڶ��е�����Ԫ�ظ�ֵ  
	      
	    num[2][0] = 7; //�������е�һ��Ԫ�ظ�ֵ  
	    num[2][1] = 8; //�������еڶ���Ԫ�ظ�ֵ  
	    num[2][2] = 9; //�������е�����Ԫ�ظ�ֵ  
	    
	    for(int x=0; x<num.length; x++){
	        for(int y = 0; y<num[x].length; y++){  //��λÿ�е�Ԫ�ظ���  
	            System.out.print(num[x][y]);  
	        } 
	        System.out.println();
	    }  
	  }  
}  
	//����ֵarr[x][y]��ʾָ�����ǵ�x�е�y�е�ֵ��  
	//��ʹ�ö�ά�������ʱ��ע��length������ĳ��ȣ�  
	//��������ֱ�Ӽ���length(��arr.length)����ָ�����м���(Row)��  
	//ָ�����������length(��arr[0].length)��ָ���Ǹ�����ӵ�е�Ԫ�أ�Ҳ������(Column)��Ŀ��  


