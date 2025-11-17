package com.dsa.day1;

import java.util.HashSet;
import java.util.Set;

public class LC0217_ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			if (numSet.contains(num)) {
				return true;
			}
			numSet.add(num);
		}
		return false;
	}

	public static void main(String[] args) {
		LC0217_ContainsDuplicate lc0217_ContainsDuplicate = new LC0217_ContainsDuplicate();
		int[] nums = new int[] { 1, 2, 3, 4 };
		boolean result = lc0217_ContainsDuplicate.containsDuplicate(nums);
		System.out.println("Contains Duplicate: " + (result == true ? "Yes" : "No"));
	}

}
