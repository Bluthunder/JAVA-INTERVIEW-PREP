package com.programming_questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

	
	
	public static void main(String[] args) {
		
		int [] arr = new int[] {2,8,9,7};
		
		twoSums(arr,9);

	}

	private static int[] twoSums(int[] arr, int target) {
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException();
		
	}*/
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0;i<arr.length;i++) {
			
			int compliment = arr[i] - target;
			
			if(map.containsKey(compliment)) {
				
				return new int[] {map.get(compliment),i};
			}
			
			map.put(arr[i],i);
			
		}
		
		throw new IllegalArgumentException();

}}
