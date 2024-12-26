package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3281_3290;

import java.util.ArrayList;
import java.util.List;

public class LeetCode3285 {

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> res=new ArrayList<Integer>(height.length-1);
        for(int i=1;i<height.length;i++){
            if(threshold>height[i-1]){
                res.add(i);
            }

        }
        return res;
    }
}
