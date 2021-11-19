package com.programming.leetcode;

public class ArrayConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		getConcatenation(arr);

	}

	public static int[] getConcatenation(int[] nums) {

		int n = nums.length;
		int[] ans = new int[2 * n];

		for (int i = 0; i < n; i++) {
			ans[i] = nums[i];
			ans[i + n] = nums[i];
		}
		return ans;
	}

}
