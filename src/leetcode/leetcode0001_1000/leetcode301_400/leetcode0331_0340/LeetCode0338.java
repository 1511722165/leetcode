package leetcode.leetcode0001_1000.leetcode301_400.leetcode0331_0340;

public class LeetCode0338 {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + ((i & 1)==1?1:0);
        }
        return res;
    }

}
