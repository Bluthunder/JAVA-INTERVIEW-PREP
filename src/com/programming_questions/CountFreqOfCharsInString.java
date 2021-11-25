package com.programming_questions;


public class CountFreqOfCharsInString {
	
	final static int SIZE = 26;
	
	public static void printCharFreq(String str) {
		
		int n = str.length();
		
		int[] freq = new int[SIZE];
		
		
		//accumalate freq
		for(int i = 0; i < n; i++) {
						
		//	System.out.println(str.charAt(i) - 'a');
			
			freq[str.charAt(i) - 'a']++;
			
		}
		
		// traverse
		
		for(int i = 0; i < n; i++) {
			
			if(freq[str.charAt(i) - 'a'] != 0) {
				System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");
                
                // update frequency of str.charAt(i) to
                // 0 so that the same character is not
                // printed again
                freq[str.charAt(i) - 'a'] = 0;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
		printCharFreq(str);
	}

}
