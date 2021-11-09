package com.programming_questions;

import java.util.Scanner;

/**
 * There is no utility in string class to reverse a string. But we can create a character array
 * and then iterate over from end to start.
 * Append the characters using string builders and return final reversed string.
 **/

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println(stringReverse(str));
		
		/*String input = "Kaushik";
		char [] inp_char = input.toCharArray();
		
		System.out.println(inp_char);
		
		StringBuilder output = new StringBuilder();
		
		
		
		System.out.println(output);
		
*/		scan.close();
		
	}

	private static String stringReverse(String str) {
		// TODO Auto-generated method stub
		
		if (str == null) {
			throw new IllegalArgumentException();
		}
			
		StringBuilder outStr = new StringBuilder();
		char[] chars = str.toCharArray();
		for(int i = str.length() - 1;i>=0;i--) {
				
				outStr.append(chars[i]);
			}
		
		return outStr.toString();
			
		}	

}
