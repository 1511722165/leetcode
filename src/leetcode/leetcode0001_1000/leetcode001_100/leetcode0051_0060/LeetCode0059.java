package leetcode.leetcode0001_1000.leetcode001_100.leetcode0051_0060;

public class LeetCode0059 {
	public int[][] generateMatrix(int n) {
		int[][] res = new int[n][n];
		int xMin = 0, xMax = n - 1;
		int yMin = 0, yMax = n - 1;
		int flag = 0;
		int index = 1;
		while (index <= Math.pow(n, 2)) {
			if (flag == 0) {
				for (int i = yMin; i <= yMax; i++) {
					res[xMin][i] = index;
					index++;
				}
				flag = 1;
			} else if (flag == 1) {
				for (int i = xMin + 1; i <= xMax; i++) {
					res[i][yMax] = index;
					index++;
				}
				flag = 2;
			} else if (flag == 2) {
				for (int i = yMax - 1; i >= yMin; i--) {
					res[xMax][i] = index;
					index++;
				}
				flag = 3;
			} else if (flag == 3) {
				for (int i = xMax - 1; i > xMin; i--) {
					res[i][yMin] = index;
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
}
