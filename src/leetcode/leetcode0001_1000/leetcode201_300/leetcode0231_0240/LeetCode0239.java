package leetcode.leetcode0001_1000.leetcode201_300.leetcode0231_0240;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode0239 {
	public int[] maxSlidingWindow1(int[] nums, int k) {
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

	public int[] maxSlidingWindow(int[] nums, int k) {
		int[] res = new int[nums.length - k + 1];
		int left = 0;
		int right = left + k - 1;
		if (right >= nums.length)
			return res;
		int maxIndex = maxNum(nums, 0, right);
		while (true) {
			// 如果最大值还在窗口内
			if (left <= maxIndex) {
				// 记录结果并移动左指针
				res[left++] = nums[maxIndex];
				// 移动右指针
				// 如果新的元素大于当前最大值，则进行更新
				++right;
				if (right == nums.length)
					break;
				if (nums[right] >= nums[maxIndex])
					maxIndex = right;
			} else {
				// 最大值从左侧移出窗口内了
				// 判断边界值，一定程度避免遍历寻找
				if (nums[left] >= nums[maxIndex] - 1)
					maxIndex = left;
				else if (nums[right] >= nums[maxIndex] - 1)
					maxIndex = right;
				else
					maxIndex = maxNum(nums, left, right);
			}
		}
		return res;
	}

	public int maxNum(int[] nums, int start, int end) {
		int index = start;
		for (int i = start + 1; i <= end; i++) {
			if (nums[i] >= nums[index]) {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		LeetCode0239 demo = new LeetCode0239();
		int nums[] = { 1, 3, -1, -3, 1, 3, 6, 7 };
		int k = 3;
		demo.maxSlidingWindow(nums, k);
	}
}
