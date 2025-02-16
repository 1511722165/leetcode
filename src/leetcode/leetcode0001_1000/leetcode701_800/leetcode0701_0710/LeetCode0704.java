package leetcode.leetcode0001_1000.leetcode701_800.leetcode0701_0710;

public class LeetCode0704 {

    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        if(target>nums[right]||target<nums[left])return -1;
        while (left<=right){
            if(target==nums[left])return left;
            if(target==nums[right])return right;
            int mid=(left+right+1)/2;
            if(target==nums[mid])return mid;
            if(nums[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode0704 demo =new LeetCode0704();
        demo.search(new int[]{-1,0,4},0);
    }
}
