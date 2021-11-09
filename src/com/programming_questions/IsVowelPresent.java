package com.programming_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsVowelPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(isVowelPresent(str));
		System.out.println(vowelCount(str));

	}

	private static boolean isVowelPresent(String str) {
		// TODO Auto-generated method stub
		return str.matches(".*['aieou'].*");
	}
	
	private static int vowelCount(String str) {
		
		int count = 0;
		
		//char [] c = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++)
        {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
            {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        }
	
		return count;
		
	}

}
