package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1431_1440;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1431 {

//	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//		int[] candiesext = Arrays.copyOf(candies, candies.length);
//		Arrays.sort(candiesext);
//		List<Boolean> list = new ArrayList<>();
//		int max = candiesext[candies.length - 1];
//
//		for (int i : candies) {
//			int maxnum = i + extraCandies;
//			list.add(i + extraCandies >= max);
//		}
//
//		return list;
//	}
//	
	
	
	
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null) {
            return new ArrayList<>();
        }
        List<Boolean> resList = new ArrayList<>();
        int max = 0;
        for (int value : candies) {
            max = Math.max(value, max);
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                resList.add(Boolean.TRUE);
            } else {
                resList.add(Boolean.FALSE);
            }
        }
        return resList;
    }

}
