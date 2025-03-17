package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3101_3110;

import java.util.Map;

public class LeetCode3110 {

    public int scoreOfString(String s) {
        int ans=0;
        for (int i = 1; i < s.length(); i++) {
            ans+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return ans;
    }

}
