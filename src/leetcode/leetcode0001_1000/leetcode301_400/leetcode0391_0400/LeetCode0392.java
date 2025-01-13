package leetcode.leetcode0001_1000.leetcode301_400.leetcode0391_0400;

public class LeetCode0392 {

    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index == t.length()) return false;
            char c = s.charAt(i);
            for (int j = index; j < t.length();) {
                if (c == t.charAt(j)) {
                    j++;
                    index = j;
                    break;
                }
                j++;
                if (j == t.length()) return false;
            }
        }
        return true;
    }
}
