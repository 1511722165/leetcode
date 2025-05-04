package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1291_1300;

public class LeetCode1295 {

    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if ((num >= 10 && num < 100) || (num >= 1000 && num < 10000) || num == 100000) {
                ++ans;
            }
        }
        return ans;
    }
}
