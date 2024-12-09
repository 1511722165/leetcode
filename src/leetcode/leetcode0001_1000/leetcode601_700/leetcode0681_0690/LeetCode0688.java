package leetcode.leetcode0001_1000.leetcode601_700.leetcode0681_0690;

public class LeetCode0688 {
    public double knightProbability(int n, int k, int row, int column) {
        Double[][][] map = new Double[n][n][k + 1];
        double res= process(row, column, n, k, map);
        return res;
    }

    public double process(int r, int c, int n, int k, Double[][][] map) {
        if (r < 0 || r >= n || c < 0 || c >= n) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
        if (map[r][c][k] != null) {
            return map[r][c][k];
        }

        double res = 0;
        res += process(r + 2, c + 1, n, k - 1, map);
        res += process(r + 2, c - 1, n, k - 1, map);
        res += process(r - 2, c + 1, n, k - 1, map);
        res += process(r - 2, c - 1, n, k - 1, map);
        res += process(r + 1, c + 2, n, k - 1, map);
        res += process(r - 1, c + 2, n, k - 1, map);
        res += process(r + 1, c - 2, n, k - 1, map);
        res += process(r - 1, c - 2, n, k - 1, map);
        map[r][c][k] = res / 8.0;
        return res / 8.0;
    }
//    public double knightProbability(int n, int k, int row, int column) {
//        if (k == 0)
//            return 1;
//        if (n <= 2) return 0;
//        double count = 2 << (3 * k - 1);
//        int[][] dp = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                int index = 0;
//                if (i - 2 >= 0 && j + 1 < n) {
//                    index++;
//                }
//                if (i - 2 >= 0 && j - 1 >= 0) {
//                    index++;
//                }
//                if (i + 2 < n && j + 1 < n) {
//                    index++;
//                }
//                if (i + 2 < n && j - 1 >= 0) {
//                    index++;
//                }
//                if (i - 1 >= 0 && j + 2 < n) {
//                    index++;
//                }
//                if (i - 1 >= 0 && j - 2 >= 0) {
//                    index++;
//                }
//                if (i + 1 < n && j + 2 < n) {
//                    index++;
//                }
//                if (i + 1 < n && j - 2 >= 0) {
//                    index++;
//                }
//                dp[i][j] = index;
//            }
//        }
//
//        Long res =dfs(dp, k, row, column, n,1);
//        return res / count;
//    }
//
//    private long dfs(int[][] dp, int k, int row, int column, int n,long count) {
//        int res=0;
//        if (k == 1)
//            return count*dp[row][column];
//        k--;
//        if (row - 2 >= 0 && column + 1 < n) {
//
//            res+=dfs(dp, k, row - 2, column + 1, n,count);
//        }
//        if (row - 2 >= 0 && column - 1 >= 0) {
//            res+=dfs(dp, k, row - 2, column - 1, n,count);
//        }
//        if (row + 2 < n && column + 1 < n) {
//            res+=dfs(dp, k, row + 2, column + 1, n,count);
//        }
//        if (row + 2 < n && column - 1 >= 0) {
//            res+=dfs(dp, k, row + 2, column - 1, n,count);
//        }
//        if (row - 1 >= 0 && column + 2 < n) {
//            res+=dfs(dp, k, row - 1, column + 2, n,count);
//        }
//        if (row - 1 >= 0 && column - 2 >= 0) {
//            res+=dfs(dp, k, row - 1, column - 2, n,count);
//        }
//        if (row + 1 < n && column + 2 < n) {
//            res+=dfs(dp, k, row + 1, column + 2, n,count);
//        }
//        if (row + 1 < n && column - 2 >= 0) {
//            res+=dfs(dp, k, row + 1, column - 2, n,count);
//        }
//        return res;
//    }


    public static void main(String[] args) {
        LeetCode0688 demo = new LeetCode0688();
        demo.knightProbability(3, 2, 0, 0);
//        demo.knightProbability(8, 30, 6, 4);
    }
}
