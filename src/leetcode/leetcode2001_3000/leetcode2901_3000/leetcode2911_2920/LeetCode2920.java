package leetcode.leetcode2001_3000.leetcode2901_3000.leetcode2911_2920;

import java.util.Arrays;

public class LeetCode2920 {

    public int maximumPoints(int[][] edges, int[] coins, int k) {
        int len=coins.length;
        //全走第一种
        int sum= Arrays.stream(coins).sum()-k*len;



            return 0;
    }
}
