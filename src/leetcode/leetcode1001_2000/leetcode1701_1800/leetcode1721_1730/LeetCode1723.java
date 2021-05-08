package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1721_1730;

import java.util.Arrays;

public class LeetCode1723 {
    public int minimumTimeRequired(int[] jobs, int k) {
        int sum=Arrays.stream(jobs).sum();
        int length=jobs.length;
        if(k==1){
        return sum;
        }
        Arrays.sort(job);
        int avg=sum/k;
        if(avg<=jobs[length-1]){
            return jobs[length-1];
        }
        (){}

        return 0;
    }

}
