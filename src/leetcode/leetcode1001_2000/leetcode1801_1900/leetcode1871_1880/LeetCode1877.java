package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1871_1880;

import java.util.Arrays;

public class LeetCode1877 {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=1,j=nums.length-1;
        int max=nums[0]+nums[j];
        j--;
        while(i<j){
            max=Math.max(max,nums[i]+nums[j]);
            i++;j--;
        }
        return max;
    }
}
