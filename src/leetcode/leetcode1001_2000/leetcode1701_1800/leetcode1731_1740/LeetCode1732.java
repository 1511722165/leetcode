package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1731_1740;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class LeetCode1732 {
	public int breakfastNumber(int[] staple, int[] drinks, int x) {
		int res = 0;
		Arrays.sort(staple);
		Arrays.sort(drinks);
		for (int i = 0; i < staple.length; i++) {
			if (staple[i] < x) {
				res += getIndex(0, drinks.length - 1, drinks, x - staple[i]);
			}

		}

		return res;
	}

	public int getIndex(int start, int last, int[] nums, int target) {
		if (nums[(start + last) / 2] > target) {

		}

		return 0;
	}

	public static void main(String[] args) {
		// List<String> list = new ArrayList<>();
		// for (int i = 0; i <= 5; i++) {
		// list.add(i + "");
		// }
		//
		// List<String> list2 = new ArrayList<>();
		// for (int i = 0; i <= 5; i++) {
		// list2.add(i + "");
		// }
		//
		// List<String> list3 = new ArrayList<>();
		// for (int i = 0; i <= 5; i++) {
		// list3.add(i + "");
		// }
		//
		// long d1 = System.currentTimeMillis();
		// list2.addAll(list);
		// long d2 = System.currentTimeMillis();
		// System.out.println(d2 - d1);
		// long d3 = System.currentTimeMillis();
		// Stream.of(list3, list);
		// long d4 = System.currentTimeMillis();
		// System.out.println(d4 - d3);
		// System.out.println(Stream.of(list3, list));
	}
}
