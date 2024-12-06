package leetcode.leetcode0001_1000.leetcode001_100.leetcode0051_0060;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0051 {

    int n;
    char[][] chessboard;
    boolean[] row, col, dia1, dia2;
    List<List<String>> ans;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        chessboard = new char[n][n];
        // row = new boolean[n];
        col = new boolean[n];
        dia1 = new boolean[n + n - 1];
        dia2 = new boolean[n + n - 1];
        ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) Arrays.fill(chessboard[i], '.');
        dfs(0);
        return ans;
    }

    void dfs(int x) {
        if (x >= n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                list.add(new String(chessboard[i]));
            }
            ans.add(list);
            return;
        }
        for (int j = 0; j < n; ++j) {
            if (col[j]) continue;
            int idxD1 = j - x + n - 1;
            int idxD2 = x + j;
            if (dia1[idxD1]) continue;
            if (dia2[idxD2]) continue;
            chessboard[x][j] = 'Q';
            // row[i] = true;
            col[j] = true;
            dia1[idxD1] = true;
            dia2[idxD2] = true;

            dfs(x + 1);

            chessboard[x][j] = '.';
            // row[i] = false;
            col[j] = false;
            dia1[idxD1] = false;
            dia2[idxD2] = false;
        }
    }

}
