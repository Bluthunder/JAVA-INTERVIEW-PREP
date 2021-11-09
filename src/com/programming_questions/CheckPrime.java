package com.programming_questions;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num  = scan.nextInt();
		
		System.out.println(isPrime(num));

	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		
		if(num == 0 || num == 1) {
			return false;
		}
		
		else if(num== 2) {
			return true;
		}
		
		else {
			for (int i = 2;i<=num/2;i++) {
				
				if(num % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
