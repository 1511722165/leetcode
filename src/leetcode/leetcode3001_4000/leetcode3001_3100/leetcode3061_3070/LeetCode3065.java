package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3061_3070;

import java.util.Arrays;

public class LeetCode3065 {

    public int minOperations(int[] nums, int k) {
        int res = 0;
        for (int i : nums) {
            if (i < k) res++;
        }
        return res;
    }


}
