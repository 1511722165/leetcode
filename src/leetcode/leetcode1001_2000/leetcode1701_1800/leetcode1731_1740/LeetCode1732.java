package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1731_1740;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class LeetCode1732 {
	public int breakfastNumber(int[] staple, int[] drinks, int x) {
		int res = 0;
		for (int i = 0; i < staple.length; i++) {
			if (staple[i] < x) {
				for (int j = 0; j < drinks.length; j++) {
					if (staple[i] + drinks[j] <= x) {
						res++;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i <= 1000000; i++) {
			list.add(i + "");
		}

		List<String> list2 = new ArrayList<>();
		for (int i = 0; i <= 1000000; i++) {
			list2.add(i + "");
		}

		long d1 = System.currentTimeMillis();
		list2.addAll(list);
		long d2 = System.currentTimeMillis();
		System.out.println(d2 - d1);
		long d3 = System.currentTimeMillis();
		Stream.of(list, list2);
		long d4 = System.currentTimeMillis();
		System.out.println(d4 - d3);
	}
}
