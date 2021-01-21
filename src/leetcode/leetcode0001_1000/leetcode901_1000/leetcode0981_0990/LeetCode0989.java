package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0981_0990;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0989 {
	public List<Integer> addToArrayForm(int[] A, int K) {
		StringBuilder sbBuilder = new StringBuilder();
		for (int item : A) {
			sbBuilder.append(item);
		}
		long a = Long.parseLong(sbBuilder.toString()) + (long) K;
		String sb = "" + a;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < sb.length(); i++) {
			list.add(sb.charAt(i) - 48);
		}
		return list;
	}

	public static void main(String[] args) {
		LeetCode0989 demo = new LeetCode0989();

		int[] A = { 1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3 };
		int K = 516;
		demo.addToArrayForm(A, K);
	}
}
