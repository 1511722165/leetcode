package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1461_1470;

import java.util.Arrays;

public class LeetCode1470 {

	public int[] shuffle(int[] nums, int n) {
		int[] cutx = Arrays.copyOfRange(nums, 0, n);
		int[] cuty = Arrays.copyOfRange(nums, n, 2 * n);
		for (int i = 0; i < n; i++) {
			nums[2 * i] = cutx[i];
			nums[2 * i + 1] = cuty[i];
		}

		return nums;
	}

	
	
//    public int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[n << 1];
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            ans[index++] = nums[i];
//            ans[index++] = nums[n + i];
//        }
//        return ans;
//    }
	public static void main(String[] args) {
		LeetCode1470 demo = new LeetCode1470();
		int[] nums = { 2, 5, 1, 3, 4, 7 };

		demo.shuffle(nums, 3);
	}
}
