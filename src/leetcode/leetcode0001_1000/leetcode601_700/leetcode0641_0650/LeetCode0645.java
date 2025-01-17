package leetcode.leetcode0001_1000.leetcode601_700.leetcode0641_0650;

import java.util.Arrays;

public class LeetCode0645 {

    public int[] findErrorNums1(int[] nums) {
        int length=nums.length;
        int count= Arrays.stream(nums).sum();
        int sum=(1+length)*length/2;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return new int[]{nums[i],sum-count+nums[i]};
            }

        }
        return null;
    }

    public int[] findErrorNums(int[] nums) {
        // 找到重复的数，以及缺失的数
        int n = nums.length;
        int[] cnts = new int[n+1];

        for(int num: nums){
            cnts[num] ++;
        }

        int[] ans = new int[2];
        for (int i = 1; i <= n; i++) {
            if(cnts[i] == 2) ans[0] = i;
            else if(cnts[i] == 0) ans[1] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode0645 demo=new LeetCode0645();
//        demo.findErrorNums(new int[]{1,1});
        demo.findErrorNums(new int[]{1,5,3,2,2,7,6,4,8,9});
    }
}
