package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1861_1870;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode1862 {
	public int[] maxSlidingWindow1(int[] nums, int k) {

		int n = nums.length;
		int[] res = new int[n - k + 1];
		int max;
		for (int i = 0; i + k - 1 < n; i++) {
			max = nums[i];
			for (int j = 1; j < k; j++) {
				max = Math.max(max, nums[i + j]);
			}
			res[i] = max;
		}
		return res;
	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return new int[0];
		}
		int[] res = new int[nums.length - k + 1];
		Deque<Integer> queue = new ArrayDeque<>();
		for (int i = 0, j = 0; i < nums.length; i++) {
			// first 最先的
			if (!queue.isEmpty() && i - queue.peek() >= k) {
				queue.poll();
			}
			// peekLast 相当于getlast
			while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
				// remove last
				queue.pollLast();
			}
			queue.offer(i);
			if (i >= k - 1) {
				res[j++] = nums[queue.peek()];
			}
		}

		return res;
	}

	public static void main(String[] args) {
		LeetCode1862 demo = new LeetCode1862();
		int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		demo.maxSlidingWindow(nums, k);
	}
}
