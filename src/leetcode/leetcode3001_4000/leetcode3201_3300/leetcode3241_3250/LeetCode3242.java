package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3241_3250;

public class LeetCode3242 {
}

class NeighborSum {
    int[][] ans;

    public NeighborSum(int[][] grid) {
        int len = grid.length;
        ans = new int[len * len][2];
        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {
                //求和
                int sumA = 0;
                int sumB = 0;
                //上下左右
                if (i >= 1) {
                    sumA += grid[i - 1][j];
                }
                if (i <= len - 2) {
                    sumA += grid[i + 1][j];
                }

                if (j >= 1) {
                    sumA += grid[i][j - 1];
                }
                if (j <= len - 2) {
                    sumA += grid[i][j + 1];
                }
                //斜对角
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sumB += grid[i - 1][j - 1];
                }
                if (i - 1 >= 0 && j + 1 <= len - 1) {
                    sumB += grid[i - 1][j + 1];
                }
                if (i + 1 <= len - 1 && j - 1 >= 0) {
                    sumB += grid[i + 1][j - 1];
                }
                if (i + 1 <= len - 1 && j + 1 <= len - 1) {
                    sumB += grid[i + 1][j + 1];
                }
                ans[grid[i][j]][0] = sumB;
                ans[grid[i][j]][1] = sumA;

            }

        }
    }

    public int adjacentSum(int value) {
        return ans[value][1];
    }

    public int diagonalSum(int value) {
        return ans[value][0];
    }
}
