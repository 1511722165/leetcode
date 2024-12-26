package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2541_2550;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode2545 {

    public int[][] sortTheStudents1(int[][] score, int k) {
        int m=score.length,n=score[0].length;
        int[][] sort=new int[m][2];

        for (int i=0;i<m;i++){
            sort[i][0]=score[i][k];
            sort[i][1]=i;
        }
        for (int i=0;i<m;i++){
            for (int j=i+1;j<m;j++){
                    if(sort[i][0]<sort[j][0]){
                        int temp=sort[j][0];
                        sort[j][0]=sort[i][0];
                        sort[i][0]=temp;
                        temp=sort[j][1];
                        sort[j][1]=sort[i][1];
                        sort[i][1]=temp;
                    }

            }
        }
        int [][] res=new int[m][n];
        for (int i=0;i<m;i++){
            res[i]=score[sort[i][1]];
        }
        return res;
    }

    public int[][] sortTheStudents(int[][] score, int k) {
        quickSort(score, 0, score.length-1, k);
        return score;
    }

    public void quickSort(int[][] score, int l, int r, int k){
        if(l < r){
            int key = partition(score, l, r, k);
            quickSort(score, l, key-1, k);
            quickSort(score, key+1, r, k);
        }
    }

    public int partition(int[][] score, int l, int r, int k){
        int[] base = score[l];
        while(l < r){
            while(l<r && score[r][k]<=base[k]) r--;
            score[l] = score[r];
            while(l<r && score[l][k]>=base[k]) l++;
            score[r] = score[l];
        }
        score[l] = base;
        return l;
    }
}
