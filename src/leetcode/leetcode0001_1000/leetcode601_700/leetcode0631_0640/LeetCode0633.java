package leetcode.leetcode0001_1000.leetcode601_700.leetcode0631_0640;

public class LeetCode0633 {

    public boolean judgeSquareSum1(int c) {
        long cl = c;
        long p = (int) Math.sqrt(cl / 2);
        if (p * p * 2 == cl) {
            return true;
        }
        long q = (int) Math.sqrt(cl);
        if (q * q == cl) {
            return true;
        }
        for (long a = 1; a <= p + 1; a++) {
            long t = (int) Math.sqrt(cl - a * a);
            for (long b = t; b >= t && b < a + q + 2; b++) {
                if (a * a + b * b == cl) {
                    return true;
                } else if (a * a + b * b > cl) {
                    break;
                }
            }
        }
        return false;
    }

    public boolean judgeSquareSum(int c) {
        //确定右边界
        int max=(int)Math.sqrt(c);
        int left=0,right=max;
        while(left<=right){
            //越界 2^31 - 1
            long target=(long)left*left+right*right;
            if(target>c){
                right--;
            }else if(target<c){
                left++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        LeetCode0633 demo = new LeetCode0633();
//        System.out.println(demo.judgeSquareSum(2147473645));
        Thread t=new Thread();
        t.start();
        t.start();

    }
}
