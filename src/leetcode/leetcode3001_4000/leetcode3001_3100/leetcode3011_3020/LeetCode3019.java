package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3011_3020;

public class LeetCode3019 {


    public int countKeyChanges(String s) {

        char[] cs = s.toLowerCase().toCharArray();
        int count = 0;
        int c = cs[0] - 'a';
        for (int i = 1; i < cs.length; i++) {
            if (c != cs[i] - 'a') {
                count++;
                c = cs[i] - 'a';
            }
        }
        return count;
    }
}
