package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3091_3100;

import java.util.Arrays;

public class LeetCode3095 {


    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = i; j < nums.length; j++) {
                value |= nums[j];
                if (value >= k) {
                    ans = ans > (j - i + 1) ? (j - i + 1) : ans;
                    break;
                }
            }
        }
        return ans != Integer.MAX_VALUE ? ans : -1;
    }


    public static void main(String[] args) {
        LeetCode3095 demo = new LeetCode3095();
        demo.minimumSubarrayLength(new int[]{2, 1, 8}, 10);
    }
}
