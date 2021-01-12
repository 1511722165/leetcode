package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1201_1210;

import java.util.List;

public class LeetCode1202 {

	public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

		char[] cs = s.toCharArray();
		char c;
		for (int i = 0; i < pairs.size(); i++) {
			if (cs[pairs.get(i).get(0)] < cs[pairs.get(i).get(1)]) {
				c = cs[pairs.get(i).get(0)];
				cs[pairs.get(i).get(0)] = cs[pairs.get(i).get(1)];
				cs[pairs.get(i).get(1)] = c;
			}
		}
		StringBuilder sbBuilder = new StringBuilder();
		for (char item : cs) {
			sbBuilder.append(item);
		}
		return sbBuilder.toString();
	}

}
