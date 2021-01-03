package leetcode.leetcode0001_1000.leetcode501_600.leetcode0571_0580;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0575 {

	public int distributeCandies(int[] candyType) {
		Set<Integer> set = new HashSet();
		for (int item : candyType) {
			set.add(item);
		}
		if (set.size() > candyType.length / 2) {
			return candyType.length / 2;
		}
		return set.size();

	}

}
