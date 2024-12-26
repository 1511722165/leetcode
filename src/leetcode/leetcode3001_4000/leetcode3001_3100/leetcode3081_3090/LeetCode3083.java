package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3081_3090;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3083 {


    public boolean isSubstringPresent(String s) {
        int n = s.length();
        // 对第二维可以用位运算进行优化
        int[] marks = new int[26];
        for (int i = 1; i < n; ++i) {
            int cur = s.charAt(i) - 'a';
            int pre = s.charAt(i - 1) - 'a';

            marks[cur] |= 1 << pre;
            if ((marks[pre] >> cur & 1) == 1) {
                return true;
            }
        }
        return false;


        // 使用二维数组标记
        // boolean[][] marks = new boolean[26][26];
        // for (int i = 1; i < n; ++i) {
        //     int cur = s.charAt(i) - 'a';
        //     int pre = s.charAt(i - 1) - 'a';
        //     marks[cur][pre] = true;
        //     if (cur == pre || marks[pre][cur]) {
        //         return true;
        //     }
        // }
        // return false;
    }

    public static void main(String[] args) {
        LeetCode3083 leetCode3083 = new LeetCode3083();
        leetCode3083.isSubstringPresent("abcba");
    }
}
