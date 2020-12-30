package leetcode.leetcode0001_1000.leetcode401_500.leetcode0491_0500;

public class LeetCode0492 {

	public int[] constructRectangle(int area) {
		int[] nums = new int[2];
		int a = (int) Math.sqrt(area);
		if (Math.pow(a, 2) == area) {
			nums[1] = a;
			nums[0] = a;
			return nums;
		}
		a = a + 1;
		for (; a <= area; a++) {
			if (area % a == 0) {
				nums[1] = area / a;
				nums[0] = a;
				return nums;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		LeetCode0492 demo = new LeetCode0492();
		demo.constructRectangle(4);
	}
}
