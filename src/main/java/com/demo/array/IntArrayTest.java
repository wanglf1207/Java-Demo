package com.demo.array;

import java.util.Arrays;
import java.util.List;

public class IntArrayTest {

	public IntArrayTest() {
	}
	
	public static void main(String [] args) {
		
		/**
		 * �½�һ������Ϊ5��int�����飬ע�⣬���鳤��һ��ȷ�������ܸı�
		 */
		int [] iArray = new int[5];
		/**
		 * ��ʼ������
		 */
		iArray[0]=1;iArray[1]=2;iArray[2]=3;iArray[3]=4;iArray[4]=5;
		
		/**
		 * ��ʾ�����е�Ԫ��
		 */
		showArrayContent(iArray);
		
		int [] iArray1 = new int[5];
		iArray1[0]=8;iArray1[1]=7;
		/**
		 * ��������������list��
		 */
		List<int[]>  list = Arrays.asList(iArray);
		//������ô��
		//list.add(iArray1);
		System.out.println("Arrays.asList(iArray) : " + list.get(0)[0] + list.get(0)[1] + 
				list.get(0)[2]);
		
		Arrays.fill(iArray,7);
		showArrayContent(iArray);
		
		
	}
	
	/**
	 * ��ʾ�����е�����
	 * @param iArray
	 */
	public static void showArrayContent(int [] iArray) {
		System.out.print("the comment of the array is : ");
		for(int i=0;i<iArray.length;i++) {
			System.out.print(iArray[i]);
		}
		System.out.println("");
	}
}
