package com.programming_questions;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr  = {1,2,3,1,3,6,6};
		
		int n = arr.length;
		
		printRepeatingNumers(arr,n);

	}

	private static void printRepeatingNumers(int[] arr, int n) {
	
		for(int i = 0; i<n;i++) {
			
			int j = Math.abs(arr[i]);
			if(arr[j] > 0) {
				arr[j] = - arr[j];
			}
			else {
				System.out.println(j+ " ");
			}
		}
		
	}

}
