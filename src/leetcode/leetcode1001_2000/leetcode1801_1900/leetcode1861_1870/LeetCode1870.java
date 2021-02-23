package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1861_1870;

import java.util.Arrays;

public class LeetCode1870 {
	public int[] constructArr1(int[] a) {
		int[] b = new int[a.length];
		int ji = 1;
		int count = 0;
		for (int item : a) {
			if (item != 0) {
				ji *= item;
			} else {
				count++;
			}
		}
		if (count == 1) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 0) {
					b[i] = ji;
				}
			}
		} else if (count > 1) {
			return b;
		} else {

			for (int i = 0; i < a.length; i++) {
				if (a[i] == 0) {
					b[i] = ji;
				} else {
					b[i] = ji / a[i];
				}
			}
		}
		return b;
	}

	public int[] constructArr(int[] a) {
		int n = a.length;
		int[] B = new int[n];
		for (int i = 0, product = 1; i < n; product *= a[i], i++) /* ¥”◊ÛÕ˘”“¿€≥À */
			B[i] = product;
		for (int i = n - 1, product = 1; i >= 0; product *= a[i], i--) /* ¥””“Õ˘◊Û¿€≥À */
			B[i] *= product;
		return B;
	}

	public static void main(String[] args) {
		LeetCode1870 demo = new LeetCode1870();
		int[] a = { 1, 2, 3, 4, 5 };
		demo.constructArr(a);
	}
}
