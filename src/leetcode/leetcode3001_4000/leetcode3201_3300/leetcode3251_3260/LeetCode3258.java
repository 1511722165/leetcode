package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3251_3260;

public class LeetCode3258 {

    public int countKConstraintSubstrings(String s, int k) {
        int len = s.length();
        char[] str = s.toCharArray();
        int[] cnt = new int[2];
        int left = 0;
        int right = 0;
        int invalid = 0;

        while (right < len) {
            cnt[str[right] - '0']++;

            while (cnt[0] > k && cnt[1] > k) {
                // 以str[left] - str[right]为前缀所有子字符串无效
                invalid = invalid + (len - right);
                cnt[str[left++] - '0']--;
            }

            right++;
        }

        return (1 + len) * len / 2 - invalid;
    }
}
