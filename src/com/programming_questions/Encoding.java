package com.programming_questions;

public class Encoding {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbaabbbccccdd";
		System.out.println(runlenEncoding(str));
		

	}

	private static String runlenEncoding(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int n = str.length();
		int c = 1;
		
		for(int i =0;i<n;i++) {
			
			if(i<n-1 && str.charAt(i)==str.charAt(i+1)) {
				
				c +=1;
			}
			else {
				sb.append(str.charAt(i));
				sb.append(c);
				c=1;
			}
		}
		
		
		return sb.toString();
	}

}
