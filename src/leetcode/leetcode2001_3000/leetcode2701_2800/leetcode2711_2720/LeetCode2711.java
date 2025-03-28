package leetcode.leetcode2001_3000.leetcode2701_2800.leetcode2711_2720;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode2711 {

    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] answer = new int[m][n];
        int[][] left = new int[m][n];
        int[][] right = new int[m][n];
        int i = m - 1, j = 0;
        //初始化左上角
        while (j < n) {
            Set<Integer> set = new HashSet<>();
            set.add(grid[i][j]);
            int x = i + 1, y = j + 1;
            while (x < m && y < n) {
                left[x][y] = set.size();
                set.add(grid[x][y]);
                ++x;
                ++y;
            }
            if (i == 0) {
                ++j;
            } else {
                --i;
            }
        }

        //初始化右下角
        i = m - 1;
        j = 0;
        while (i > 0) {
            Set<Integer> set = new HashSet<>();
            set.add(grid[i][j]);
            int x = i - 1, y = j - 1;
            while (x >= 0 && y >= 0) {
                right[x][y] = set.size();
                set.add(grid[x][y]);
                --x;
                --y;
            }
            if (j == n - 1) {
                --i;
            } else {
                ++j;
            }
        }

        for (int a = 0; a < m; a++) {
            for (int b = 0; b < n; b++) {
                answer[a][b] = Math.abs(left[a][b]-right[a][b]);

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        LeetCode2711 demo=new LeetCode2711();
//        demo.differenceOfDistinctValues(new int[][]{{1,2,3},{3,1,5},{3,2,1}});


        demo.differenceOfDistinctValues(new int[][]{{6,28,37,34,12,30,43,35,6},{21,47,38,14,31,49,11,14,49},{6,12,35,17,17,2,45,27,43},{34,41,30,28,45,24,50,20,4}});
    }

}
