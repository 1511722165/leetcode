package leetcode.leetcode0001_1000.leetcode701_800.leetcode0721_0730;

public class LeetCode0724 {

	public int pivotIndex(int[] nums) {
		int i = 0, j = nums.length - 1;
		int left = 0, right = 0;
		while (i != j && i != j + 1) {
			if (right == left) {
				left += nums[i];
				right += nums[j];
				i++;
				j--;
			} else if (left > right) {
				if (nums[j] < 0) {
					left += nums[j];
				} else {
					right += nums[j];
				}
				j--;
			} else {
				if (nums[i] < 0) {
					right += nums[i];
				} else {
					left += nums[i];
				}
				i++;
			}
		}
		if (left == right && i == j) {
			return i;
		}
		return -1;

	}
}
