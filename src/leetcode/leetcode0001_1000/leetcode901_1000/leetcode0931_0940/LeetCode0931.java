package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0931_0940;

import java.util.Arrays;

public class LeetCode0931 {

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = matrix[i][j];
                int min = matrix[i - 1][j];
                if (j == 0) {
                    min = Math.min(min, matrix[i - 1][j + 1]);
                } else if (j == n - 1) {
                    min = Math.min(min, matrix[i - 1][j - 1]);
                } else {
                    min = Math.min(min, matrix[i - 1][j + 1]);
                    min = Math.min(min, matrix[i - 1][j - 1]);
                }
                matrix[i][j] = key + min;
            }
        }
        int min = matrix[m - 1][0];
        for (int j = 1; j < n; j++) {
            min = Math.min(min, matrix[m - 1][j]);
        }
        return min;
    }
}
