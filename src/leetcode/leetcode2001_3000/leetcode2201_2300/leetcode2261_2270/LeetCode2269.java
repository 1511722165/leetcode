package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2261_2270;

import java.util.HashMap;

public class LeetCode2269 {

    public int divisorSubstrings(int num, int k) {
        String nums=Integer.toString(num);
        int len=nums.length();
        int left=0;
        int res=0;
        while (left+k<=len){
            String temp=nums.substring(left,left+k);
            int i=Integer.parseInt(temp);
            if(i>0&&num%i==0){
                ++res;
            }
            left++;
        }
        return res;
    }
}
