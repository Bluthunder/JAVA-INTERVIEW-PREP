package com.programming.sorting;

import java.util.Arrays;

public class BubbleSort {

	
	public static void bubbleSort(int [] arr) {
		
		boolean isSorted;
		
		for(int i = 0;i < arr.length;i++) {
			
			isSorted = true;
			
			for(int j = 1; j< arr.length-i;j++) {
				
				if (arr[j] < arr [j-1]) {
					
					int temp = 0 ;
					
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					
					isSorted = false;
				}
			}
						
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bubbleSort(new int [] {4,6,7,8,1,2});
		
	}

}
