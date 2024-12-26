package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3261_3270;

public class LeetCode3264 {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    i = j;
                }
            }
            nums[i] *= multiplier;
            k--;
        }
        return nums;
    }

}
