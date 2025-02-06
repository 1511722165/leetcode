package leetcode.leetcode2001_3000.leetcode2901_3000.leetcode2951_2960;

import java.util.HashMap;

public class LeetCode2958 {

    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap();
        for (int i:nums){
                map.put(i, map.getOrDefault(i,0)+1);
        }
        int max=0;
        int index=0;
        for (int i:nums){
            if(map.get(i)<=k){
                index++;
            }else {
                max=Math.max(index,max);
                index=0;
            }
        }
        return max;
    }
}
