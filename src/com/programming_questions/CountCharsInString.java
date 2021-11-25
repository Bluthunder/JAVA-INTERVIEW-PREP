package com.programming_questions;

import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "geeksforgeeks";
		prCharWithFreq(s); 
		
	}

	private static void prCharWithFreq(String s) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> d = new HashMap<>();
		
		for(int i = 0;i<s.length();i++) {
			
			if(d.containsKey(s.charAt(i))) {
				
				d.put(s.charAt(i), d.get(s.charAt(i))+1);
				
			}
			else {
				d.put(s.charAt(i), 1);
			}
		}
		System.out.println(d);
		
		for(int i = 0; i < s.length(); i++)
        {
           
            // Print only if this
            // character is not printed
            // before
            if(d.get(s.charAt(i)) != 0)
            {
                System.out.print(s.charAt(i));
                System.out.print(d.get(s.charAt(i)) + " ");
                d.put(s.charAt(i), 0);
            }           
        }
	}

}
