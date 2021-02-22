package leetcode.leetcode0001_1000.leetcode701_800.leetcode0761_0770;

import java.util.Arrays;

public class LeetCode0766 {
	public boolean isToeplitzMatrix1(int[][] matrix) {
		int m = matrix.length - 1;
		int n = matrix[0].length - 1;
		int i = 0;
		int[] temp = new int[m + n + 1];
		int[] temps = new int[m + 1];
		while (m > -1) {
			temp[i] = matrix[m][0];
			m--;
			i++;
		}
		m = 1;
		while (m <= n) {
			temp[i] = matrix[0][m];
			m++;
			i++;
		}
		for (int j = 0; j < matrix.length; j++) {
			temps = Arrays.copyOfRange(temp, j, j + n + 1);
			if (!check(temps, matrix[matrix.length - j - 1])) {
				return false;
			}
		}
		return true;
	}

	public boolean check(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public boolean isToeplitzMatrix(int[][] matrix) {
		for (int i = 0; i <= matrix.length - 2; i++) {
			for (int j = 0; j <= matrix[i].length - 2; j++) {
				if (matrix[i][j] != matrix[i + 1][j + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		LeetCode0766 demo = new LeetCode0766();
		int[][] matrix = 
//			{ { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		 { { 1, 2 }, { 2, 2 } };
		demo.isToeplitzMatrix(matrix);

	}
}
