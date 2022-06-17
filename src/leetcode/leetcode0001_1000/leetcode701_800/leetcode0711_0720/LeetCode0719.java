package leetcode.leetcode0001_1000.leetcode701_800.leetcode0711_0720;

public class LeetCode0719 {

    public int smallestDistancePair(int[] nums, int k) {
        int K=nums.length*(nums.length-1)/2-k;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int res=Math.abs(nums[i]-nums[j]);
            }
        }

        return 0;
    }
}
