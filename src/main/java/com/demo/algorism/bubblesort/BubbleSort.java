package com.demo.algorism.bubblesort;


public class BubbleSort {
	
	/**
	 * @param array
	 */
	private static void bubbleSort(int[] array) {
		int temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					 temp = array[j];
					 array[j] = array[j+1];
					 array[j+1] = temp;
				}
			}
		}
	} 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {3,2,6,3};
		bubbleSort(array);
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
}