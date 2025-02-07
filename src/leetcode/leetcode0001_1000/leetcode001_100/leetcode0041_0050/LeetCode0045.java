package leetcode.leetcode0001_1000.leetcode001_100.leetcode0041_0050;

import java.util.Arrays;

public class LeetCode0045 {

//    public int jump(int[] nums) {
//        int len= nums.length;
//        if (len==1)return 0;
//        int[]dp=new int[len];
//        Arrays.fill(dp,Integer.MAX_VALUE);
//        dp[0]=0;
//        for (int i=0;i<len-1;i++){
//            int max=nums[i]+i;
//            if(max>=len-1){
//                return dp[i]+1;
//            }
//            for (int j=i+1;j<=max&&j<len;j++){
//                dp[j]=Math.min(dp[j],dp[i]+1);
//            }
//        }
//        return dp[len-1];
//    }

    public int jump(int[] nums) {
        int n = nums.length;
        int maxReach = 0, end = 0, jumps = 0;
        for(int i = 0; i < n - 1; i++){
            maxReach = Math.max(maxReach,i+nums[i]);
            if(i==end){
                jumps+=1;
                end=maxReach;
                if(end>=n-1){
                    break;
                }
            }
        }
        return jumps;
    }
}
