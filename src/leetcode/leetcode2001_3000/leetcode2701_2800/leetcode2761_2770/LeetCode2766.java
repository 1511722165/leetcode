package leetcode.leetcode2001_3000.leetcode2701_2800.leetcode2761_2770;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode2766 {

    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> set =new HashSet<>(nums.length);
        for(Integer i:nums){
            set.add(i);
        }
        for(int i=0;i<moveFrom.length;i++){
            set.remove(moveFrom[i]);
            set.add(moveTo[i]);
        }
        set.stream().sorted();
        return new ArrayList<Integer>(set).stream().sorted().collect(Collectors.toList());
    }

}
