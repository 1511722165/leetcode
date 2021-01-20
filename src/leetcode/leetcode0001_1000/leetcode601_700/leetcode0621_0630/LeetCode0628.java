package leetcode.leetcode0001_1000.leetcode601_700.leetcode0621_0630;

import java.util.Arrays;

public class LeetCode0628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
				nums[nums.length - 1] * nums[1] * nums[0]);
	}
}
