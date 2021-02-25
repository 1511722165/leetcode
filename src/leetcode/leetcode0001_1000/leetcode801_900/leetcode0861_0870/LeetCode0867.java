package leetcode.leetcode0001_1000.leetcode801_900.leetcode0861_0870;

public class LeetCode0867 {
	public int[][] transpose(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return new int[0][0];
		}
		int[][] res = new int[matrix[0].length][matrix.length];
		// for (int i = 0; i < matrix[0].length; i++) {
		// for (int j = 0; j < matrix.length; j++) {
		// res[i][j] = matrix[j][i];
		// }
		// }
		int i = 0;
		while (i < matrix[0].length) {
			int j = 0;
			while (j < matrix.length) {
				res[i][j] = matrix[j][i];
				j++;
			}
			i++;
		}
		return res;
	}
}
