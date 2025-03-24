package leetcode.leetcode2001_3000.leetcode2601_2700.leetcode2611_2620;

public class LeetCode2614 {

    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int res=0;
        for (int i=0;i<n;i++){
            if(nums[i][i]>res&&isTrue(nums[i][i])){
                //判断是否是质数
                res=nums[i][i];
            }
            if(nums[i][n-i-1]>res&&isTrue(nums[i][n-i-1])){
                //判断是否是质数
               res=nums[i][n-i-1];
            }
        }


        return res;
    }


    private boolean isTrue(int num){
        if (num == 2) {
            return true;
        }
        if (num == 1 || num % 2 == 0) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
