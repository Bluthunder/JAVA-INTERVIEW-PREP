package com.programming_questions;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "{[]()}}";
		
		if(isBalancedString(s)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Unbalanced");
		}

	}
	
	public static boolean isBalancedString(String str) {
		
		Stack<Character> st = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			
			if(!st.empty() && ((st.peek()=='{' && ch=='}') || (st.peek()=='(' && ch==')') || (st.peek()=='[' && ch==']'))) {
				
				st.pop();
			}
			else {
				st.push(ch);
			}
			
		}
		return st.empty();
			
	}
		
		
		
		
		/*for(char ch: str.toCharArray()) {
			
			// if char is open bracket
			
			if(ch == '[' || ch == '{' ||ch == '(') {
				
				st.push(ch);
				
			}
			// if char is not open it must be close bracket
			
			else {
				char lastOpened = st.pop();
				
				if(lastOpened=='{' && ch !='}') {
					return false;
				}
				
				else if(lastOpened=='(' && ch !=')') {
					return false;
				}
				
				else if(lastOpened=='[' && ch !=']') {
					return false;
				}
			}
		}
		
		
		return st.size()==0;
		*/
	}


