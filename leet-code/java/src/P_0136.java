// 136. Single Number --- https://leetcode.com/problems/single-number/description
// See bottom for problem statement
public class P_0136 {

    /**
     * We XOR all of the numbers together. The twice duplicated numbers will cancel with themselves when XOR'ed with themselves... leaving only
     * the last non-duplicate number remaining.
     */
    public int singleNumber(int[] nums) {
        int finalNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            finalNumber ^= nums[i];
        }

        return finalNumber;
    }
}

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1



Constraints:

    1 <= nums.length <= 3 * 104
    -3 * 104 <= nums[i] <= 3 * 104
    Each element in the array appears twice except for one element which appears only once.



*/
