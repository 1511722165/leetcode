package leetcode.leetcode0001_1000.leetcode801_900.leetcode0841_0850;

public class LeetCode0844 {

    public boolean backspaceCompare(String s, String t) {
        int sl = s.length(), tl = t.length();
        StringBuilder sb1 = new StringBuilder();
        int count = 0;
        for (int i = sl - 1; i >= 0; i--) {
            if (s.charAt(i) != '#' && count == 0) {
                sb1.append(s.charAt(i));
            } else if (s.charAt(i) == '#') {
                count++;
            } else if (count > 0 && s.charAt(i) != '#') {
                count--;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        count = 0;
        for (int i = tl - 1; i >= 0; i--) {
            if (t.charAt(i) != '#' && count == 0) {
                sb2.append(t.charAt(i));
            } else if (t.charAt(i) == '#') {
                count++;
            } else if (count > 0 && t.charAt(i) != '#') {
                count--;
            }
        }
        if (sb1.toString().equals(sb2.toString())) return true;
        return false;
    }
}
