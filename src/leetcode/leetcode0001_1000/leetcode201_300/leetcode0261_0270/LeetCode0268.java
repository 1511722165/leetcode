package leetcode.leetcode0001_1000.leetcode201_300.leetcode0261_0270;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0268 {

	// public int missingNumber(int[] nums) {
	// Arrays.sort(nums);
	// for (int i = 0; i < nums.length; i++) {
	// if (nums[i] != i) {
	// return i;
	// }
	// }
	// return nums.length;
	// }

	public int missingNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return (nums.length + 1) * (nums.length) / 2 - res;
	}

	public static void main(String[] args) {
		LeetCode0268 demo = new LeetCode0268();
		int[] nums = { 0, 1 };
		System.out.println(demo.missingNumber(nums));
	}
}
