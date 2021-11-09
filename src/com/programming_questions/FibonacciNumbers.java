package com.programming_questions;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 11;
		
		System.out.println(fibonacci(n));
		
		fibonacciSeries(n);

	}
	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n == 0 ||n == 1) {
			
			return n;
		}
		
		else {
			
			return fibonacci(n-1) + fibonacci(n-2);
		}

	}
	
	private static void fibonacciSeries(int n) {
		
		int num1 = 0, num2 = 1;
		int counter = 0 ;
		
		while(counter < n) {
			
			System.out.print(num1 + " ");
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			counter += 1;
		}
	}
	
}
