package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1701_1710;

public class LeetCode1706 {


    public int[] findBall(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int j = 0;
            int next = i;
            res[i] = 1;
            while (j < m) {
                //右
                if (grid[j][next] == 1) {
                    //判断 是否边界
                    if (next == n - 1) {
                        res[i] = -1;
                        break;
                    } else if (grid[j][next + 1] == -1) {
                        res[i] = -1;
                        break;
                    } else {
                        if(j==m-1){
                            res[i] = next+1;
                            break;
                        }
                        next += 1;
                        j++;
                    }
                } else {
                    //左
                    //判断 是否边界
                    if (next == 0) {
                        res[i] = -1;
                        break;
                    } else if (grid[j][next - 1] == 1) {
                        res[i] = -1;
                        break;
                    } else {
                        if(j==m-1){
                            res[i] = next-1;
                            break;
                        }
                        next -= 1;
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
