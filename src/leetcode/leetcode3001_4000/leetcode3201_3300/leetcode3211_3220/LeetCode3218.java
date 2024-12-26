package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3211_3220;

import java.util.Arrays;

public class LeetCode3218 {

    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int result = 0;
        int i=m-2, j=n-2;
        int h=1,v=1;
        while(i>=0 || j>=0) {
            if(j<0) {
                result += horizontalCut[i] * v;
                h++;
                i--;
            }
            //每次选择开销较大的方式切割（开销越大越早切越好）
            else if(i>=0 && horizontalCut[i] > verticalCut[j]) {
                result += horizontalCut[i] * v;
                h++;
                i--;
            }else {
                result += verticalCut[j] * h;
                v++;
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode3218 demo=new LeetCode3218();
        demo.minimumCost(3,2,new int[]{1,3},new int[]{5});
    }
}
