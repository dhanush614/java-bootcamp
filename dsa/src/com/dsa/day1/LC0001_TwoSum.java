package com.dsa.day1;

import java.util.HashMap;
import java.util.Map;

public class LC0001_TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];
			if (numsMap.containsKey(compliment)) {
				return new int[] { numsMap.get(compliment), i };
			}
			numsMap.put(nums[i], i);
		}
		return new int[] {};

	}

	public static void main(String[] args) {
		LC0001_TwoSum lc0001_TwoSum = new LC0001_TwoSum();
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] result = lc0001_TwoSum.twoSum(nums, target);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
