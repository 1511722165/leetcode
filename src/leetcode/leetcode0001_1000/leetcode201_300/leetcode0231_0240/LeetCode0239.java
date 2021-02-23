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
			// first ���ȵ�
			if (!queue.isEmpty() && i - queue.peek() >= k) {
				queue.poll();
			}
			// peekLast �൱��getlast
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
			// ������ֵ���ڴ�����
			if (left <= maxIndex) {
				// ��¼������ƶ���ָ��
				res[left++] = nums[maxIndex];
				// �ƶ���ָ��
				// ����µ�Ԫ�ش��ڵ�ǰ���ֵ������и���
				++right;
				if (right == nums.length)
					break;
				if (nums[right] >= nums[maxIndex])
					maxIndex = right;
			} else {
				// ���ֵ������Ƴ���������
				// �жϱ߽�ֵ��һ���̶ȱ������Ѱ��
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
