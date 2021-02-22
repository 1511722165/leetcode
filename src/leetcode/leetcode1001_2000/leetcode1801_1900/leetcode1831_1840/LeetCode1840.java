package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1831_1840;

public class LeetCode1840 {
	public int maxSubArray(int[] nums) {
		int res = nums[0] > 0 ? nums[0] : 0;
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			res += nums[i];
			if (res >= 0) {
				max = Math.max(max, res);
			} else {
				max = Math.max(max, nums[i]);
				res = 0;
			}
		}
		return max;
	}
}
