package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

public class LeetCode0011 {
	public int maxArea(int[] height) {
		int start = 0, end = height.length - 1;
		int res = 0;
		while (start < end) {
			if (height[start] >= height[end]) {
				res = Math.max(res, (end - start)* height[end]);
				end--;
			} else {
				res = Math.max(res, height[start] * (end - start));
				start++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		LeetCode0011 demo =new LeetCode0011();
		int[] height={1,8,6,2,5,4,8,3,7};
		demo.maxArea(height);
	}
}
