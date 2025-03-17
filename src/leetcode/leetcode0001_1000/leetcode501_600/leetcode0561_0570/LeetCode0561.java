package leetcode.leetcode0001_1000.leetcode501_600.leetcode0561_0570;

import java.util.Arrays;

public class LeetCode0561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for (int i=0;i<nums.length;){
            res+=nums[i];
            i+=2;
        }
        return res;
    }
}
