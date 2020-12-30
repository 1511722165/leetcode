package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1041_1050;

import java.util.Arrays;

public class LeetCode1046 {

//	public int lastStoneWeight(int[] stones) {
//		int res = 0;
//		Map<Integer, Integer> map = new HashMap<>();
//		int max = stones[0];
//		for (int i = 0; i < stones.length; i++) {
//			max = Math.max(max, stones[i]);
//			if (map.containsKey(stones[i])) {
//				map.put(stones[i], map.get(stones[i]) + 1);
//			} else {
//				map.put(stones[i], 1);
//			}
//		}
//		for (int i = max; i >= 1;) {
//
//			if (map.containsKey(i) && map.get(i) >= 1) {
//
//				if (res == 0) {
//					if (map.get(i) >= 2) {
//						res = 0;
//						map.put(i, map.get(i) - 2);
//					} else {
//						res = i;
//						map.put(i, 0);
//						i--;
//					}
//				} else {
//					if (res - i >= i) {
//						res = res - i;
//						map.put(i, map.get(i) - 1);
//					} else {
//
//						if (map.containsKey(res - i)) {
//							map.put(res - i, map.get(res - i) + 1);
//							map.put(i, map.get(i) - 1);
//							res = 0;
//						} else {
//							map.put(res - i, 1);
//							map.put(i, map.get(i) - 1);
//							res = 0;
//
//						}
//					}
//
//				}
//
//			} else {
//				i--;
//			}
//
//		}
//		return res;
//
//	}
	
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 2) {
            return Math.abs(stones[0] - stones[1]);
        }
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        if (stones[stones.length - 3] == 0) {
            return stones[stones.length - 1] - stones[stones.length - 2];
        }
        stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
        stones[stones.length - 2] = 0;
        return lastStoneWeight(stones);
    }

	public static void main(String[] args) {
		LeetCode1046 demo = new LeetCode1046();
		int[] stones = { 3, 1 };
		demo.lastStoneWeight(stones);
	}

}
