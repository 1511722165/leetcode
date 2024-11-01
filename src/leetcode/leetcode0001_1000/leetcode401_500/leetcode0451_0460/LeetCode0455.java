package leetcode.leetcode0001_1000.leetcode401_500.leetcode0451_0460;

import java.util.Arrays;

public class LeetCode0455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a = 0, b = 0, res = 0;
        while (a < g.length && b < s.length) {
            if (g[a] <= s[b]) {
                res++;
                a++;
                b++;
            } else {
                b++;
            }
        }
        return res;
    }
}
