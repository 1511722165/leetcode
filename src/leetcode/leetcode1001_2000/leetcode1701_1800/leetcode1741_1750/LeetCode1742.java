package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1741_1750;

public class LeetCode1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] dp=new int[46];
        int max=0;
        while (lowLimit<=highLimit){
            int num=lowLimit;
            int count=0;
            while (num>0){
                count+=num%10;
                num/=10;
            }
            lowLimit++;
            dp[count]++;
            max=Math.max(dp[count],max);
        }
        return max;
    }
}
