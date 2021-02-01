package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1791_1800;

public class LeetCode1794 {
	public int[] spiralOrder(int[][] matrix) {
		int x = 0, y = 0, index = 0;
		int min = 0, max = matrix.length - 1;
		int[] res = new int[max * max];
		while (index < (matrix.length - 1) * (matrix.length - 1)) {
			if (x == min && y == min) {
				for (int i = min; i <= max; i++) {
					res[index] = matrix[min][i];
					index++;
				}
				y = max;
			} else if (x == min && y == max) {
				for (int i = min; i <= max; i++) {
					res[index] = matrix[i][max];
					index++;
				}
				max--;
				x = max;
				y = max;
			} else if (x == max && y == max) {
				for (int i = max; i >= min; i--) {
					res[index] = matrix[max][i];
					index++;
				}
				y = min;
			} else if (x == max && y == min) {
				for (int i = max; i > min; i--) {
					res[index] = matrix[i][min];
					index++;
				}
				min++;
				x = min;
				y = min;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		LeetCode1794 demo = new LeetCode1794();
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		demo.spiralOrder(matrix);
	}
}
