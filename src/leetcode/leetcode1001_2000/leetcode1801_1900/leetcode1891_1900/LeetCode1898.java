package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1891_1900;

import java.util.Arrays;

public class LeetCode1898 {
	public int smallestDifference(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		long min1  = Long.MAX_VALUE;;
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			int j = flag;
			while (j < b.length) {
				if (a[i] == b[j]) {
					return 0;
				} else if (a[i] > b[j]) {
					min1 = Math.min(min1, Math.abs((long) (a[i] - b[j])));
					flag++;
					j++;
				} else if (a[i] < b[j]) {
					min1 = Math.min(min1, Math.abs((long) (a[i] - b[j])));
					flag = Math.max(0, j - 1);
					j = b.length;
				}
			}
		}
		return (int) min1;
	}

	
	
	
//	public int smallestDifference(int[] a, int[] b) {
//		Arrays.sort(a);
//		Arrays.sort(b);
//		long min1  = Long.MAX_VALUE;;
//		int flag = 0;
//		for (int i = 0; i < b.length; i++) {
//			int j = flag;
//			while (j < a.length) {
//				if (b[i] == a[j]) {
//					return 0;
//				} else if (b[i] > a[j]) {
//					min1 = Math.min(min1, Math.abs((long) (b[i] - a[j])));
//					flag++;
//					j++;
//				} else if (b[i] < a[j]) {
//					min1 = Math.min(min1, Math.abs((long) (b[i] - a[j])));
//					flag = Math.max(0, j - 1);
//					j = a.length;
//				}
//			}
//		}
//		return (int) min1;
//	}
//	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		LeetCode1898 demo = new LeetCode1898();
		int[] a = { -2147483648, 1 };
		int[] b = { 2147483647, 0 };
		demo.smallestDifference(a, b);
	}
}
