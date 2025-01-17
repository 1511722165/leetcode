package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3091_3100;

public class LeetCode3097 {

    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) {
                return 1;
            }
            int value = nums[i];
            boolean flag = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (flag && nums[i] == nums[j]) {
                    i = j;
                } else {
                    flag = false;
                }
                value |= nums[j];
                if (value >= k) {
                    ans = ans > (j - i + 1) ? (j - i + 1) : ans;
                    break;
                } else if (value < k && j == nums.length - 1) {
                    return ans != Integer.MAX_VALUE ? ans : -1;
                }
            }
        }
        return ans != Integer.MAX_VALUE ? ans : -1;
    }
}
