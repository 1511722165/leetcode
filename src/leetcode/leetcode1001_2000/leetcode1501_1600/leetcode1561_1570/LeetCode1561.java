package leetcode.leetcode1001_2000.leetcode1501_1600.leetcode1561_1570;

import java.util.Arrays;

public class LeetCode1561 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res=0,left=piles.length/3,right=piles.length-1;
        while (left<right){
            res+=piles[right-1];
            right-=2;
        }
        return res;
    }
}
