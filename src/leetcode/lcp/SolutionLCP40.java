package leetcode.lcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionLCP40 {
    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int res=0;
     for(int i=0;i<cards.length;i++){
         int max=cards[i];
         if(cards[i]%2==0){
             //剩下里面找出cnt-1个最大的偶数和


         }else{
             //剩下里面找出cnt-1个最大的奇数和

         }

     }
return res;
    }

}
