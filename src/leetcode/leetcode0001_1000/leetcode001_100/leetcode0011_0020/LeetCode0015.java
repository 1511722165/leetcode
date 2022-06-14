package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

import java.util.*;

public class LeetCode0015 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if (nums == null || nums.length <= 2)return res;
        Arrays.sort(nums);
        int zeroS=-1;
        int zeroE=nums.length;
        int left=0;int right= nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                zeroS=i;
                break;
            }
        }

        while (left<right){
            if(nums[left]>0||nums[right]<0){
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode0015 LeetCode0015=new LeetCode0015();
        int[] demo= {-1,0,1,2,-1,-4};
        LeetCode0015.threeSum(demo);
    }
}
