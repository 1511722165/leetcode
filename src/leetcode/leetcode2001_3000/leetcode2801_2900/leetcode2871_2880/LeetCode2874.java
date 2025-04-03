package leetcode.leetcode2001_3000.leetcode2801_2900.leetcode2871_2880;

public class LeetCode2874 {

    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0l;
        int[]dp=new int[n];

        dp[n-2]=nums[n-1];
        for (int i=n-2;i>0;i--){
            dp[i]=Math.max(dp[i+1],nums[i+1]);
        }
        int left=nums[0];
        for(int i=1;i<n-1;i++){
            left=Math.max(left,nums[i-1]);
            ans=Math.max(ans,(left- nums[i]) * 1l * dp[i]);
        }
        return ans;
    }

}
