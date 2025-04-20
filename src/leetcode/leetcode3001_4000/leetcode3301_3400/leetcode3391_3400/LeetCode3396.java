package leetcode.leetcode3001_4000.leetcode3301_3400.leetcode3391_3400;

public class LeetCode3396 {

    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int[] dp = new int[101];

        int ans = n / 3;
        int init = n % 3;
        if (init == 1) {
            ++dp[nums[n - 1]];
        } else if (init == 2) {
            if (nums[n - 1] == nums[n - 2]) {
                return ans + 1;
            } else {
                ++dp[nums[n - 1]];
                ++dp[nums[n - 2]];
            }
        }


            while (ans > 0) {
                ++dp[nums[3 * ans - 1]];
                ++dp[nums[3 * ans - 2]];
                ++dp[nums[3 * ans - 3]];
                if (dp[nums[3 * ans - 1]] > 1 || dp[nums[3 * ans - 2]] > 1 || dp[nums[3 * ans - 3]] > 1) {
                    return ans;
                }
                --ans;
            }
            return ans;
        }
    }
