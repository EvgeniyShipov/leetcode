package com.leetcode.array;

import java.util.Arrays;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */
public class Solution5 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]) {
                count++;
            } else if (count != 2) {
                return num;
            } else {
                count = 1;
                num = nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
