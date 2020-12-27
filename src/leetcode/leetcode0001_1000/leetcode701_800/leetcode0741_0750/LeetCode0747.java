package leetcode.leetcode0001_1000.leetcode701_800.leetcode0741_0750;

public class LeetCode0747 {

	public int dominantIndex(int[] nums) {

		int result = -1;
		int[] max = new int[2];
		for (int i = 0; i < nums.length / 2; i++) {
			if (nums[i] > nums[nums.length-1 - i]) {
				max[1] = max[1] > nums[nums.length-1 - i] ? max[1] : nums[nums.length-1 - i];
				result=i;
			} else {
				max[1] = max[1] > nums[i] ? max[1] : nums[i];
				nums[i] = nums[nums.length-1 - i];
				result = nums.length-1 - i;
			}
			if (nums[i] > max[0]) {
				max[1] = max[0];
				max[0] = nums[i];
			} else {
				max[1] = max[1] > nums[i] ? max[1] : nums[i];
			}
		}
		if (max[0] >= 2 * max[1]) {
			return result;
		}
		return -1;
	}


	public static void main(String[] args) {
		LeetCode0747 demo = new LeetCode0747();
		int[] nums = { 0, 0, 0, 1 };
		System.out.println(demo.dominantIndex(nums));
	}
}
