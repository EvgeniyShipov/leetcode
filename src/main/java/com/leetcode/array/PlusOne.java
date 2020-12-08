package com.leetcode.array;

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Example 3:
 * <p>
 * Input: digits = [0]
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;

        while (digits[lastIndex] == 9) {
            if (lastIndex > 0) {
                digits[lastIndex] = 0;
                lastIndex = --lastIndex;
            } else {
                int[] result = new int[digits.length + 1];
                System.arraycopy(digits, 0, result, 1, digits.length);
                result[lastIndex + 1] = 0;
                result[0] = 1;
                return result;
            }
        }

        digits[lastIndex] = ++digits[lastIndex];
        return digits;
    }
}
