package leetcode.leetcode0001_1000.leetcode001_100.leetcode0041_0050;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0046 {

//    public List<List<Integer>> permute(int[] nums) {
//        int len = nums.length;
//        List<List<Integer>> list = new ArrayList<>(getSize(len));
//      //  for ()
//
//    }

    private int getSize(int len) {
        int size = 1;
        for (int i = len; i > 1; i--) {
            size *= i;
        }
        return size;
    }
}
