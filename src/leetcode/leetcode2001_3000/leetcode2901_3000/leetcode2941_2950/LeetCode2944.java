package leetcode.leetcode2001_3000.leetcode2901_3000.leetcode2941_2950;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode2944 {


        public int minimumCoins(int[] prices) {
            int n = prices.length;
            int[] f = new int[n + 1];
            for (int i = n; i >= 1; i--) {
                int r = (i << 1) + 1, res = 0;
                if (r <= n) {
                    res = Integer.MAX_VALUE;
                    for (int j = i + 1; j <= r; j++) {
                        res = Math.min(res, f[j]);
                    }
                }
                f[i] = res + prices[i - 1];
            }
            return f[1];
        }

    public static void main(String[] args) {
        LeetCode2944 demo=new LeetCode2944();
        demo.minimumCoins(new int[]{1,10,1,1});
    }
    }


