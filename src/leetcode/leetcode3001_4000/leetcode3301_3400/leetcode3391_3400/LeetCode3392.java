package leetcode.leetcode3001_4000.leetcode3301_3400.leetcode3391_3400;

public class LeetCode3392 {

    public int countSubarrays(int[] nums) {
        int ans=0;
        for (int i=0;i<nums.length-2;i++){
            if(nums[i+1]%2==0&&(nums[i]+nums[i+2])==nums[i+1]/2){
                ++ans;
            }
        }
        return ans;
    }
}
