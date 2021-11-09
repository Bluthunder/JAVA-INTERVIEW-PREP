package com.programming_questions;




public class SmallestSubArrGivenSum {
	
	public static int smallestSubArray(int targetSum, int[] arr) {
		
		int minWindowSize = Integer.MAX_VALUE;
		int currentWindowSum = 0;
		int windowStart = 0;
		
		for(int windowEnd = 0; windowEnd < arr.length; windowEnd ++) {
			
			currentWindowSum += arr[windowEnd];
			
			while(currentWindowSum >= targetSum) {
				
				minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1); // min sum
				currentWindowSum -= arr[windowStart]; // shrinking the array
				windowStart++;
			}
		}
		
		
		
		return minWindowSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = new int[] {4,2,2,7,8,1,2,8,10};
		int targetSum = 8;
		System.out.println(smallestSubArray(targetSum, input));
	}

}
