package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1791_1800;

public class LeetCode1799 {
	public int[] spiralOrder(int[][] matrix) {
		int index = 0;
		if (matrix.length == 0) {
			return new int[0];
		}
		int xMin = 0, xMax = matrix.length;
		int yMin = 0, yMax = matrix[0].length;
		int flag = 0;
		int[] res = new int[Math.multiplyExact(xMax, yMax)];
		xMax--;
		yMax--;
		while (index < (matrix.length) * (matrix[0].length)) {
			if (flag == 0) {
				for (int i = yMin; i <= yMax; i++) {
					res[index] = matrix[xMin][i];
					index++;
				}
				flag = 1;
			} else if (flag == 1) {
				for (int i = xMin + 1; i <= xMax; i++) {
					res[index] = matrix[i][yMax];
					index++;
				}
				flag = 2;
			} else if (flag == 2) {
				for (int i = yMax - 1; i >= yMin; i--) {
					res[index] = matrix[xMax][i];
					index++;
				}
				flag = 3;
			} else if (flag == 3) {
				for (int i = xMax - 1; i > xMin; i--) {
					res[index] = matrix[i][yMin];
					index++;
				}
				flag = 0;
				xMin++;
				yMin++;
				xMax--;
				yMax--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		LeetCode1799 demo = new LeetCode1799();
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		demo.spiralOrder(matrix);
	}
}
