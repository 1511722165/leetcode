package leetcode.leetcode0001_1000.leetcode401_500.leetcode0491_0500;

public class LeetCode0492 {

	public int[] constructRectangle(int area) {
		for (int a = (int) Math.sqrt(area); a >= 0; a--) {
			if (area % a == 0) {
				return new int[] { area / a, a };
			}
		}
		return null;
	}

	public static void main(String[] args) {
		LeetCode0492 demo = new LeetCode0492();
		demo.constructRectangle(4);
	}
}
