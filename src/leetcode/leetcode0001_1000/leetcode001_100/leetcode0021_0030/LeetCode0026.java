package leetcode.leetcode0001_1000.leetcode001_100.leetcode0021_0030;

import java.util.Arrays;

public class LeetCode0026 {

    public int removeDuplicates(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=10001;
                flag++;
            }
        }
        Arrays.sort(nums);
        return nums.length-flag;
    }
}
