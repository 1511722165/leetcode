package leetcode.leetcode1001_2000.leetcode1301_1400.leetcode1321_1330;

public class LeetCode1328 {

    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if (len == 1) return "";
        char[] cs = palindrome.toCharArray();
        int mid = len / 2;
        int index = -1;
        int i = 0;
        while (index == -1 && i < mid) {
            if (cs[i] != 'a') {
                index = i;
            }
            i++;
        }

        if (index == -1) {
            cs[len - 1] = 'b';
            return new String(cs);
        } else {
            cs[index] = 'a';
            return new String(cs);
        }
    }
}
