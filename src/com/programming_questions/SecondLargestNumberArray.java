package com.programming_questions;

import java.util.Arrays;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[] {4,7,8,9,5,6};
		
		int size = arr.length;
		
		int tmp;
		for(int i =0; i<size; i++) {
			
			for(int j = i; j > 0; j--) {
				
				if (arr[j] < arr[j-1]) {
					
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
		     System.out.println(arr[i]);
		   }
		
		
	//	Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int secondLargest = arr[size-2];
		
		System.out.println(secondLargest);

	}


	
}
