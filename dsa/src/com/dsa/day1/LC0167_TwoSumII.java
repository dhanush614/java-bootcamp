package com.dsa.day1;

public class LC0167_TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1, sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = numbers[left] + numbers[right];
			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		LC0167_TwoSumII lc0167_TwoSumII = new LC0167_TwoSumII();
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] result = lc0167_TwoSumII.twoSum(nums, target);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
