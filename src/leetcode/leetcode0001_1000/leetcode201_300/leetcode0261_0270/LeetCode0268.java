package leetcode.leetcode0001_1000.leetcode201_300.leetcode0261_0270;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0268 {

	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i) {
				return i;
			}
		}
		return nums.length;
	}

}
