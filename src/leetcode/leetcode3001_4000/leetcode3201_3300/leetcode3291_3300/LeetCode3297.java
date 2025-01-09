package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3291_3300;

public class LeetCode3297 {

    static char A = 'a';

    public long validSubstringCount(String word1, String word2) {
        int[] ans2 = new int[26];
        boolean[] ans1 = new boolean[26];
        int m = word1.length(), n = word2.length();
        //总共多少个不同字母
        int count = 0;
        //word2里字母计数
        for (int i = 0; i < n; i++) {
            if (ans2[word2.charAt(i) - A] == 0) {
                count++;
            }
            ans1[word2.charAt(i) - A] = true;
            ans2[word2.charAt(i) - A]++;
        }
        long res = 0l;
        int right = m, left = 0;
        //最低要求 从0开始
        for (int i = 0; i < m; i++) {
            ans2[word1.charAt(i) - A]--;
            if (ans2[word1.charAt(i) - A] == 0) {
                count--;
            }
            if (count == 0) {
                right = i;
                res += m - i;
                break;
            }
        }
        //如果字母根本不够直接返回0个
        if (count > 0) {
            return 0l;
        }
        left = 1;
        while (right < m && left <= m - n) {
            //减去前一个
            char c = word1.charAt(left - 1);
            ans2[c - A]++;
            if (ans1[c - A] && ans2[c - A] <= 0) {
                //剩余子集都符合要求
                res += m - right;
                left++;
            } else if (!ans1[c - A]) {
                res += m - right;
                left++;
            } else {
                //找到下一个index-1相同的字母
                right++;
                left++;
                boolean flag = false;
                while (right < m) {
                    if (word1.charAt(right) == c) {
                        ans2[word1.charAt(right) - A]--;
                        flag = true;
                        break;
                    } else {
                        ans2[word1.charAt(right) - A]--;
                        right++;
                    }
                }
                if (flag) {
                    res += m - right;
                } else {
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode3297 demo = new LeetCode3297();
        System.out.println(demo.validSubstringCount("bcca", "abc"));
        System.out.println(demo.validSubstringCount("abcabc", "abc"));
        System.out.println(demo.validSubstringCount("abcabc", "aaabc"));
        System.out.println(demo.validSubstringCount("dcbdcdccb", "cdd"));
        System.out.println(demo.validSubstringCount("dccdceee", "cec"));
    }
}
