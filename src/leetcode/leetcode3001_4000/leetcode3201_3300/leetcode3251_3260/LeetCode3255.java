package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3251_3260;

public class LeetCode3255 {

    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) return nums;
        int[] flag = new int[nums.length - 1];
        for (int i = 0; i < flag.length; i++) {
            if (nums[i + 1] >= nums[i] + 1) {
                flag[i] = 1;
            } else {
                flag[i] = 0;
            }
        }
        int[] res = new int[nums.length - k + 1];
        int max = 0;
        for (int i = 0; i < k - 2; i++) {
            max += flag[i];
        }
        for (int i = 0; i < res.length; i++) {
            max += flag[i + k - 2];
            if (max == k - 1) {
                res[i] = nums[i + k - 1];
            } else {
                res[i] = -1;
            }
            max = max - flag[i];
        }
        return res;
    }
}
