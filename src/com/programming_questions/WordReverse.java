package com.programming_questions;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String paragraph = scan.nextLine();
		
		System.out.println(ReverseWord(paragraph));
		
		scan.close();

	}

	private static String ReverseWord(String paragraph) {
		// TODO Auto-generated method stub
		
		if (paragraph == null) {
			throw new IllegalArgumentException();
		}
		
		StringBuilder reverseWord = new StringBuilder();
		
	//	String reverseWord = " ";
		
		
		String [] words = paragraph.split(" ");
		
		
		
		for(int i = words.length-1;i>=0;i--) {
			
			//reverseWord = reverseWord + " " + words[i];
			reverseWord.append(words[i] + " ");
		}
		
		
		
		//return reverseWord.trim();
		return reverseWord.toString().trim();
	}

}
