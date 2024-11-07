package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3251_3260;

import leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3221_3230.LeetCode3226;

import java.util.Arrays;

public class LeetCode3254 {

    public int[] resultsArray1(int[] nums, int k) {
        if (k == 1) return nums;
        int[] flag = new int[nums.length - 1];
        for (int i = 0; i < flag.length; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                flag[i] = 1;
            } else {
                flag[i] = 0;
            }
        }
        int[] res = new int[nums.length - k + 1];
        int max = 0;
        for (int i = 0; i < k - 2; i++) {
            max += flag[i];
        }
        for (int i = 0; i < res.length; i++) {
            max += flag[i + k - 2];
            if (max == k - 1) {
                res[i] = nums[i + k - 1];
            } else {
                res[i] = -1;
            }
            max = max - flag[i];
        }
        return res;
    }


    public int[] resultsArray(int[] nums, int k) {
        int [] ans=new int[nums.length-k+1];
        int []cnt=new int[2];
        for(int i=1;i<k;i++){
            cnt[(nums[i]==nums[i-1]+1)?1:0]++;
        }
        ans[0]=cnt[1]==k-1?nums[k-1]:-1;
        for(int i=k;i<nums.length;i++){
            cnt[(nums[i]==nums[i-1]+1)?1:0]++;
            cnt[(nums[i-k+1]==nums[i-k]+1)?1:0]--;
            ans[i-k+1]=cnt[1]==k-1?nums[i]:-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode3254 demo = new LeetCode3254();
        demo.resultsArray(new int[]{3, 2, 3, 2, 3, 2}, 2);
    }
}
