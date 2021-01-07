package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1441_1450;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1447 {
	public List<String> simplifiedFractions(int n) {
		if (n == 1)
			return new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		for (int i = 2; i <= n; i++) {
			list.add("1/" + i);
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					list.add(j + "/" + i);
				}
			}

		}
		return list;
	}
}
