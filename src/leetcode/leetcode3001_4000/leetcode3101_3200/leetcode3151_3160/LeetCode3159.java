package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3151_3160;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode3159 {


    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] res=new int[queries.length];
        Arrays.fill(res,-1);
        List<Integer> list =new ArrayList();
        for (int i=0;i<nums.length;i++){
            if (nums[i]==x){
                list.add(i);
            }
        }
        for (int i=0;i<queries.length;i++){
            if (queries[i]<=list.size()){
                res[i]=list.get(queries[i]-1);
            }

        }

        return res;
    }
}
