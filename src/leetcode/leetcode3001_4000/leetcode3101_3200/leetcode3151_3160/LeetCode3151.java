package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3151_3160;

public class LeetCode3151 {

    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2==nums[i+1]%2){
                return false;
            }
        }
        return true;
    }
}
