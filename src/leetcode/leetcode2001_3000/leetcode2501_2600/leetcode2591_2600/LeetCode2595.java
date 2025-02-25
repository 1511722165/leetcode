package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2591_2600;

public class LeetCode2595 {
    public int[] evenOddBit(int n) {
        int even=0,odd=0;
        boolean flag=true;
        while (n>0){
            if(n%2==1){
                if(flag){
                    even++;
                }else {
                    odd++;
                }
            }
            flag=!flag;
            n=n>>1;
        }
        return new int[]{even,odd};
    }

    public static void main(String[] args) {
        LeetCode2595 demo=new LeetCode2595();
        demo.evenOddBit(2);
    }

}
