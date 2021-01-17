package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1231_1240;

public class LeetCode1232 {
	public boolean checkStraightLine(int[][] coordinates) {
		double temp;
		if (coordinates[1][0] - coordinates[0][0] != 0) {
			double k = (coordinates[1][1] - coordinates[0][1]) * 1.0000 / (coordinates[1][0] - coordinates[0][0]);
			for (int i = 2; i < coordinates.length; i++) {
				temp = (coordinates[i][1] - coordinates[0][1]) * 1.0000 / (coordinates[i][0] - coordinates[0][0]);
				if (k != temp) {
					return false;
				}
			}
		} else {
			for (int i = 2; i < coordinates.length; i++) {
				if (coordinates[i][0] != coordinates[0][0]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		LeetCode1232 demo = new LeetCode1232();
		int[][] coordinates = { { 2, 1 }, { 4, 2 }, { 6, 3 } };
		demo.checkStraightLine(coordinates);
	}
}
