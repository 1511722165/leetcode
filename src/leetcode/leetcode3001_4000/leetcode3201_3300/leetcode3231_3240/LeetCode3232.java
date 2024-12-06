package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3231_3240;

public class LeetCode3232 {

    public boolean canAliceWin(int[] nums) {
        int sum1=0,sum2=0;
        for (int num:nums){
            if (num<10){
                sum1+=num;
            }else {
                sum2+=num;
            }
        }
        if(sum1!=sum2)return true;return false;
    }
}
