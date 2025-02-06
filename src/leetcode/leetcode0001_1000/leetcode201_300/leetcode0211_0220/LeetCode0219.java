package leetcode.leetcode0001_1000.leetcode201_300.leetcode0211_0220;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0219 {

//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
//                if (nums[i] == nums[j]) return true;
//            }
//        }
//        return false;
//    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> posMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(posMap.containsKey(nums[i])){
                int dis = Math.abs(i - posMap.get(nums[i]));
                if(dis <= k){
                    return true;
                }
            }
            posMap.put(nums[i], i);
        }
        return false;
    }
}
