package leetcode.leetcode2001_3000.leetcode2601_2700.leetcode2601_2610;

public class LeetCode2609 {

    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        if (s.length() == 0 || s.indexOf("1") < 0 || s.indexOf("0") < 0) {
            return res;
        }
        int count = 0;
        Boolean flag = false;
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                if (flag) {
                    flag = false;
                }
                if (count > 0) {
                    max++;
                    count--;
                } else {
                    max = 0;
                    count = 0;
                }
                res = Math.max(res, 2*max);

            } else if (chars[i] == '0') {
                if (!flag) {
                    flag = true;
                    count = 0;
                    max=0;
                }
                count++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        LeetCode2609 demo =new LeetCode2609();
        demo.findTheLongestBalancedSubstring("01000111");
    }
}
