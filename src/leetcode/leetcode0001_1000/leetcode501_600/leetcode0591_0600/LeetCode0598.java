package leetcode.leetcode0001_1000.leetcode501_600.leetcode0591_0600;

public class LeetCode0598 {

    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        int r = ops[0][0];
        int c = ops[0][1];
        for (int[] op : ops) {
            r = Math.min(r, op[0]);
            c = Math.min(c, op[1]);
        }
        return r * c;
    }
}
