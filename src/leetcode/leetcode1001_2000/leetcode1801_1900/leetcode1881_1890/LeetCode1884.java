package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1881_1890;

public class LeetCode1884 {

    public int twoEggDrop(int n) {
        int res = 0, index = 1;
        while (n > 0) {
            n -= index;
            index++;
            res++;
        }
        return res;
    }

}
