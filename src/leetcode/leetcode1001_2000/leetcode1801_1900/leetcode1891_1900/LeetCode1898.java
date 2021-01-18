package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1891_1900;

import java.util.Arrays;

public class LeetCode1898 {
	public int smallestDifference(int[] a, int[] b) {
		Arrays.sort(a);
		long min1 = Math.abs((long) (a[0] - b[0]));
		long min2 = Math.abs((long) (a[1] - b[0]));
		for (int j = 0; j < b.length; j++) {
			min1 = Math.min(min1, Math.abs((long) (a[0] - b[j])));
			min2 = Math.min(min1, Math.abs((long) (a[1] - b[j])));
		}
		if(min2<min1){}
		for (int i = 0; i < a.length; i++) {
			
		}
		return (int) min1;
	}
}
