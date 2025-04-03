package leetcode.leetcode2001_3000.leetcode2801_2900.leetcode2871_2880;

public class LeetCode2873 {

    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0l;
        int left = 0;

        while (left < n - 2) {
            int mid = left + 1;
            while (mid < n - 1) {
                int right = mid + 1;
                while (right < n) {
                    ans = Math.max(ans, (nums[left] - nums[mid]) * 1l * nums[right]);
                    ++right;
                }
                ++mid;
            }
            ++left;
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode2873 demo = new LeetCode2873();
        System.out.println(demo.maximumTripletValue(new int[]{1000000, 1, 1000000}));
    }
}
