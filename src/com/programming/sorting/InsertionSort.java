package com.programming.sorting;


import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,8,6,3,9};
		
		//int [] sorted = insertionSort(arr);
		
		System.out.println(Arrays.toString(insertionSort(arr)));
		
		
		
		/*for(int i = 0; i<sorted.length;i++) {
			System.out.println(sorted[i]);
		}
*/
	}

	private static int [] insertionSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > temp) {
				
				arr[j+1] = arr[j];
				j--;
				
			}
			
			arr[j+1]=temp;
		}
		
		return arr;
		
		
	}

}
