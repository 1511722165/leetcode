package leetcode.leetcode0001_1000.leetcode001_100.leetcode0081_0090;

import java.util.Arrays;

public class LeetCode0080 {

    public int removeDuplicates(int[] nums) {
    int flag=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+2]){
                nums[i]=10001;
                flag++;
            }
        }
        Arrays.sort(nums);
        return nums.length-flag;
    }

}
