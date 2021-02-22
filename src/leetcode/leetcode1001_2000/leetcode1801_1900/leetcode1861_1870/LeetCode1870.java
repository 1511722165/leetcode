package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1861_1870;

import java.util.Arrays;

public class LeetCode1870 {
	public int[] constructArr(int[] a) {
		int[] b = new int[a.length];
		int ji = 1;
		for (int item : a) {
			ji *= item;
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0){
				b[i]=ji;
			}else{
				b[i] = ji / a[i];
			}
		}
		return b;
	}
}
