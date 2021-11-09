package com.programming_questions;

public class StringPalindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "anna";
		
		System.out.println(PalindromeChecker(s));

	}

	private static boolean PalindromeChecker(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		int j = s.length()-1;
		int i;
		
		for(i = 0; i<n/2;i++) {
			
			if(s.charAt(i)!=s.charAt(j-i)) {
				return false;
			}
		}
		
		return true; 
	}

}
