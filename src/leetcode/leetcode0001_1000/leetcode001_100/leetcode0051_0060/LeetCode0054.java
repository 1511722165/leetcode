package leetcode.leetcode0001_1000.leetcode001_100.leetcode0051_0060;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0054 {
	public List<Integer> spiralOrder(int[][] matrix) {
		int index = 0;
		if (matrix.length == 0) {
			return new ArrayList<Integer>();
		}
		int xMin = 0, xMax = matrix.length - 1;
		int yMin = 0, yMax = matrix[0].length - 1;
		int flag = 0;
		List<Integer> res = new ArrayList<Integer>();
		while (index < (matrix.length) * (matrix[0].length)) {
			if (flag == 0) {
				for (int i = yMin; i <= yMax; i++) {
					res.add(matrix[xMin][i]);
					index++;
				}
				flag = 1;
			} else if (flag == 1) {
				for (int i = xMin + 1; i <= xMax; i++) {
					res.add(matrix[i][yMax]);
					index++;
				}
				flag = 2;
			} else if (flag == 2) {
				for (int i = yMax - 1; i >= yMin; i--) {
					res.add(matrix[xMax][i]);
					index++;
				}
				flag = 3;
			} else if (flag == 3) {
				for (int i = xMax - 1; i > xMin; i--) {
					res.add(matrix[i][yMin]);
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
		LeetCode0054 demo = new LeetCode0054();
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		demo.spiralOrder(matrix);
	}
}
