package leetcode.leetcode0001_1000.leetcode301_400.leetcode0381_0390;

import java.util.Arrays;
import java.util.Random;

public class LeetCode0384 {

	private int[] nums;

	public LeetCode0384(int[] nums) {
		this.nums = new int[nums.length];
		this.nums = nums;
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return this.nums;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		int temp = 0, j = 0;
		int[] shuff = Arrays.copyOf(nums, nums.length);
		Random r = new Random();// 随机种子
		for (int i = 0; i < shuff.length; i++) {
			j = r.nextInt(shuff.length);
			temp = shuff[j];
			shuff[j] = shuff[i];
			shuff[i] = temp;
		}

		return shuff;
	}

}
