package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2231_2240;

public class LeetCode2239 {

    public int findClosestNumber(int[] nums) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for (int i:nums){
            if(i>=0){
                max=Math.min(max,i);
            }else {
                min=Math.max(min,i);
            }
        }
        return max+min>0?min:max;
    }
}
