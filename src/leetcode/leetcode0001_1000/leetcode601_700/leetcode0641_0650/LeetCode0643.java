package leetcode.leetcode0001_1000.leetcode601_700.leetcode0641_0650;

public class LeetCode0643 {

    public double findMaxAverage(int[] nums, int k) {

        int count = 0;
        for (int i = 0; i < k; i++) {
            count += nums[i];
        }
        int max=count;
        for (int i = 1; i + k - 1 < nums.length; i++) {
            count=count - nums[i - 1] + nums[i + k - 1];
            max = Math.max(max, count);
        }
        return 1.0 * max / k;
    }

    public static void main(String[] args) {
        LeetCode0643 demo = new LeetCode0643();
//        demo.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        demo.findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1);
    }
}
