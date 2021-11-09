package com.programming_questions;

public class SwapNumbersWithout3Vars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		
		System.out.printf("Before swap %d and % d",a,b);
			
		System.out.print("\n");
		// TODO Auto-generated method stub
//		a = a + b; // 20 + 30 = 50
//		b = a - b; // 50 - 30 = 20
//		a = a - b; // 50 - 20 = 30
		
		swapNumbers(a,b);
		
	}

	private static void swapNumbers(int a, int b) {
		// TODO Auto-generated method stub
		a = a + b; // 20 + 30 = 50
		b = a - b; // 50 - 30 = 20
		a = a - b; // 50 - 20 = 30
		
		System.out.printf("After swap %d and % d",a,b);
		
	}

}
