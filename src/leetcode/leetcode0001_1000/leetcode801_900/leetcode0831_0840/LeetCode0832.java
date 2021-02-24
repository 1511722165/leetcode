package leetcode.leetcode0001_1000.leetcode801_900.leetcode0831_0840;

import java.util.Arrays;

public class LeetCode0832 {
	public int[][] flipAndInvertImage(int[][] A) {
		int n=A[0].length;
		int[] temp=new int[n];
		for (int i = 0; i < A.length; i++) {
			temp=Arrays.copyOf(A[i], n);
			for (int j = 0; j < n; j++) {
				A[i][j]= (temp[n-j-1]-1)*-1;
			}
		}
		return A;
	}
}