package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1011_1020;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1018 {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        int m = nums.length;
        List<Boolean> list = new ArrayList<>(m);
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            i = i << 1;
            i += nums[j];
            list.add(i % 5 == 0);
            i %= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode1018 demo = new LeetCode1018();
        demo.prefixesDivBy5(new int[]{0, 1, 1});
    }

}
