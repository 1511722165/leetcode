package leetcode.leetcode0001_1000.leetcode601_700.leetcode0661_0670;

public class LeetCode0661 {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 1;
                int sum = img[i][j];
                if (i + 1 < m) {
                    cnt++;
                    sum += img[i + 1][j];
                    if (j + 1 < n) {
                        cnt++;
                        sum += img[i + 1][j + 1];
                    }
                    if (j - 1 >= 0) {
                        cnt++;
                        sum += img[i + 1][j - 1];
                    }

                }
                if (i - 1 >= 0) {
                    cnt++;
                    sum += img[i - 1][j];
                    if (j + 1 < n) {
                        cnt++;
                        sum += img[i - 1][j + 1];
                    }
                    if (j - 1 >= 0) {
                        cnt++;
                        sum += img[i - 1][j - 1];
                    }

                }

                if (j + 1 < n) {
                    cnt++;
                    sum += img[i][j + 1];
                }
                if (j - 1 >= 0) {
                    cnt++;
                    sum += img[i][j - 1];
                }
                res[i][j] = Math.floorDiv(sum, cnt);
            }
        }
        return res;
    }
}
