package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1471_1480;

public class LeetCode1480 {

	// public int[] runningSum(int[] nums) {
	// int temp = nums[0];
	// int[] result = Arrays.copyOf(nums, nums.length);
	// for (int i = 1; i < nums.length; i++) {
	// result[i] += temp;
	// temp += nums[i];
	// }
	//
	// return result;
	// }

	public int[] runningSum(int[] nums) {

		for (int i = 1; i < nums.length; ++i) {
			nums[i] += nums[i - 1];
		}
		return nums;

	}
	// Ч������˵++i��i++���ĸ���Ч��
	// public int[] runningSum(int[] nums) {
	//
	// for (int i = 1; i < nums.length; i++) {
	// nums[i] += nums[i - 1];
	// }
	// return nums;
	//
	// }

}
