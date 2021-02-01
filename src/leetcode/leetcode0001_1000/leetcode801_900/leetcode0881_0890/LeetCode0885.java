package leetcode.leetcode0001_1000.leetcode801_900.leetcode0881_0890;

public class LeetCode0885 {
	public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
		int[][] res = new int[R * C][2];
		int index = 1;
		int flag = 0;
		int count = 1;
		// res[r0][c0] = 1;
		res[0][0] = r0;
		res[0][1] = c0;
		while (index < R * C) {

			if (flag == 0) {
				for (int i = 1; i <= count; i++) {
					if (c0 + i >= 0 && c0 + i < C && r0 >= 0 && r0 < R) {
						// res[r0][c0 + i] = index;
						res[index][0] = r0;
						res[index][1] = c0 + i;
						index++;
					}
				}
				c0 = c0 + count;
				flag = 1;
			} else if (flag == 1) {
				for (int i = 1; i <= count; i++) {
					if (r0 + i >= 0 && r0 + i < R && c0 >= 0 && c0 < C) {
						// res[r0 + i][c0] = index;
						res[index][0] = r0 + i;
						res[index][1] = c0;
						index++;
					}
				}
				flag = 2;
				r0 = r0 + count;
				count++;
			} else if (flag == 2) {
				for (int i = 1; i <= count; i++) {
					if (c0 - i >= 0 && c0 - i < C && r0 >= 0 && r0 < R) {
						// res[r0][c0 - i] = index;
						res[index][0] = r0;
						res[index][1] = c0 - i;
						index++;
					}
				}
				flag = 3;
				c0 = c0 - count;
			} else if (flag == 3) {
				for (int i = 1; i <= count; i++) {
					if (r0 - i >= 0 && r0 - i < R && c0 >= 0 && c0 < C) {
						// res[r0 - i][c0] = index;
						res[index][0] = r0 - i;
						res[index][1] = c0;
						index++;
					}
				}
				flag = 0;
				r0 = r0 - count;
				count++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		LeetCode0885 demo = new LeetCode0885();
		demo.spiralMatrixIII(1, 4, 0, 0);
	}
}
