package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

public class LeetCode0014 {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            //公共前缀比所有字符串都短，随便选一个先
            String s = strs[0];
            for (String string : strs) {
                while (!string.startsWith(s)) {
                    if (s.length() == 0) return "";
                    //公共前缀不匹配就让它变短！
                    s = s.substring(0, s.length() - 1);
                }
            }
            return s;
        }


    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String res = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != c) {
                    return res;
                } else if (j == strs.length - 1) {
                    res = res + c;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        LeetCode0014 demo = new LeetCode0014();
        String[] s = {"flower", "flow", "flight"};
        demo.longestCommonPrefix(s);
    }
}
