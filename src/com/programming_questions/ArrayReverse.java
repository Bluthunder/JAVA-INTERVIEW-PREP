package com.programming_questions;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,30,40,50};
		
		reverseArray(arr);

	}

	private static void reverseArray(int [] arr) {
		// TODO Auto-generated method stub
		
		int j = arr.length-1;
		
		for(int i = 0;i < arr.length/2;i++) {
			
			int temp = arr[i];
			arr[i] = arr[j-i];
			arr[j-i] = temp;
		}
		
		for (int i = 0 ; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
