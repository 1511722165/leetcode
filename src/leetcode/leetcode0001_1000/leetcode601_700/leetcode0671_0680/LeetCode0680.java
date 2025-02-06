package leetcode.leetcode0001_1000.leetcode601_700.leetcode0671_0680;

public class LeetCode0680 {
    public boolean validPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if (dfs(s, left + 1, right)) {
                    return true;
                } else if (dfs(s, left, right - 1)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }


    private boolean dfs(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode0680 demo = new LeetCode0680();
//        demo.validPalindrome("abc");
        demo.validPalindrome("cupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupucu");
    }

}
