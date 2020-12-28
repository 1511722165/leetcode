package leetcode.leetcode0001_1000.leetcode001_100.leetcode0031_0040;

public class LeetCode0035 {

	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			} else if (nums[i] < target) {

			} else {
				return i;
			}
		}
		return nums.length;
	}
}
