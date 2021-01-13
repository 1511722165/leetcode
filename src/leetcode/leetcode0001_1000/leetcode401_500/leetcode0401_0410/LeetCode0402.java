package leetcode.leetcode0001_1000.leetcode401_500.leetcode0401_0410;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0402 {
	public List<String> readBinaryWatch(int num) {
		if (num > 8)
			return new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		int[][] hours = { { 1, 2, 4, 8 }, { 3, 5, 6, 9, 10 }, { 7, 11 } };
		int[][] mins = { { 1, 2, 4, 8, 16, 32 }, { 3, 5, 6, 9, 10 }, { 7, 11 } };
		return list;
	}
}
