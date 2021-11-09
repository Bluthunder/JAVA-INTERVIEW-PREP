package com.programming_questions;

/**
 * 
 * @author KAUSHIK
 * Sep 14, 20212:49:43 PM
 * 
 * Find the maximum sum of sub array of size k
 * Example Input:
 * [4,2,1,7,8,1,2,8,1,0]
 */

public class MaxSumSubArray {
	
	public static int findMaxSumSubArray(int arr[], int k) {
		
		int maxValue = Integer.MIN_VALUE;
		int currentRunningSum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			currentRunningSum += arr[i];
			
			if(i >= k-1) {
				
				maxValue = Math.max(maxValue, currentRunningSum);
				currentRunningSum -= arr[i- (k-1)];
			}
		}
		
		return maxValue;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findMaxSumSubArray(new int[] {4,2,1,7,8,1,2,8,1,0}, 3));
	}

}
