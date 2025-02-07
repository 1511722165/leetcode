package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2211_2220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode2218 {



//    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
//        int size=piles.size();
//        //总数
//        int sum=0;
//        //加了多少次
//        int index=0;
//        int[][] cnt=new int[size][k];
//        for (int i=0;i<size;i++){
//            for (int j=0;j<k&&j<piles.get(i).size();j++){
//                cnt[i][j]= piles.get(i).get(j);
//                sum+=cnt[i][j];
//                index++;
//            }
//        }
//
//        PriorityQueue<Help2218> priorityQueue=new PriorityQueue<Help2218>((a,b)->{return a.val>=b.val?1:-1;});
//        for (int i=0;i<size;i++){
//            for (int j=k-1;j>=0;j--){
//                if(cnt[i][j]!=0){
//                 priorityQueue.add(new Help2218(cnt[i][j],i,j));
//                 break;
//                }
//            }
//        }
//
//        while (index>k){
//            Help2218 help2218=priorityQueue.poll();
//            sum-=help2218.val;
//            index--;
//            if(help2218.j>0){
//                priorityQueue.add(new Help2218(cnt[help2218.i][help2218.j-1],help2218.i,help2218.j-1));
//            }
//
//        }
//        return sum;
//    }


    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[] dp = new int[k+1];
        dp[0] = 1;
        int len = piles.size();
        // 预处理
        int[][] ans = new int[len][];
        for (int i = 0; i < piles.size(); i++) {
            List<Integer> list = piles.get(i);
            ans[i] = new int[list.size()];
            int m = 0;
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = m + list.get(j);
                m = ans[i][j];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = k; j >= 0; j--) {
                for (int l = 0; l < ans[i].length && j-l-1 >= 0; l++) {
                    if (dp[j-l-1] <= 0) continue;
                    dp[j] = Math.max(dp[j], dp[j-l-1] + ans[i][l]);
                }
            }
        }
        return dp[k] - 1;
    }


    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(37,88);
        List<Integer> list2=Arrays.asList(51,64,65,20,95,30,26);
        List<Integer> list3=Arrays.asList(9,62,20);
        List<Integer> list4=Arrays.asList(44);
        List<List<Integer>> list=new ArrayList<>();
        list.add(list1);list.add(list2);list.add(list3);list.add(list4);
        LeetCode2218 demo=new LeetCode2218();
        demo.maxValueOfCoins(list,9);
    }
}

class Help2218{
    int val;
    int i;
    int j;

    public Help2218(int val, int i, int j) {
        this.val = val;
        this.i = i;
        this.j = j;
    }
}