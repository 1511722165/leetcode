package leetcode.leetcode1001_2000.leetcode1601_1700.leetcode1601_1610;

public class LeetCode1605 {

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int[][] matrix = new int[rows][cols];
        int row = 0, col = 0;
        while (row < rows && col < cols) {
            int min = Math.min(rowSum[row], colSum[col]);
            matrix[row][col] = min;
            rowSum[row] -= min;
            colSum[col] -= min;
            while (rowSum[row] == 0 && ++row < rows) {}
            while (colSum[col] == 0 && ++col < cols) {}
        }
        return matrix;
    }
}
