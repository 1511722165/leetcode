package leetcode.leetcode0001_1000.leetcode701_800.leetcode0741_0750;

import java.util.Arrays;

public class LeetCode0743 {

    // 从节点到其他所有节点最小时长的最大值
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] len = new int[n+1][n+1];
        for (int i = 1; i < len.length; i++) {
            for (int j = 1; j < len[i].length; j++) {
                len[i][j] = i == j ? 0 : 0x3f3f3f3f;
            }
        }
        for (int i = 0; i < times.length; i++) {
            len[times[i][0]][times[i][1]] = times[i][2];
        }
        // 源k到其他节点的时长
        int[] w = new int[n+1];
        Arrays.fill(w, 0x3f3f3f3f);
        w[k] = 0; // k到k为0
        boolean[] via = new boolean[n+1]; // 是否确定到某节点的最小时长
        for (int i = 1; i <= n; i++) {
            int t = -1;
            for (int j = 1; j <= n; j++) {
                if (!via[j] && (t == -1 || w[j] < w[t])) t = j;
            }
            via[t] = true;
            for (int j = 1; j <= n; j++) {
                w[j] = Math.min(w[j], w[t] + len[t][j]);
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, w[i]);
        }
        return res >= 0x3f3f3f3f ? -1 : res;
    }

    public static void main(String[] args) {
        LeetCode0743 demo=new LeetCode0743();
        demo.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}},4,2);
    }
}
