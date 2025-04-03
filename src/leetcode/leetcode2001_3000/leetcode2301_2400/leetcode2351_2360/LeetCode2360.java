package leetcode.leetcode2001_3000.leetcode2301_2400.leetcode2351_2360;

import java.util.*;

public class LeetCode2360 {

    public int longestCycle1(int[] edges) {
        int res = -1;
        int n = edges.length;

        Set<Integer> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                Map<Integer, Integer> map = new HashMap(n-set.size());
                int count = 0;
                int next =i;
                while (!set.contains(next) && next != -1) {
                    set.add(next);
                    map.put(next, ++count);
                    next = edges[next];
                }
                if (next != -1&&map.containsKey(next)) {
                    res = Math.max(res, count - map.get(next) + 1);
                }
            }
        }
        return res;
    }


    public int longestCycle(int[] edges) {
        int n = edges.length;
        int ans = -1;
        int curTime = 1; // 当前时间
        int[] visTime = new int[n]; // 首次访问 x 的时间
        for (int i = 0; i < n; i++) {
            int x = i;
            int startTime = curTime; // 本轮循环的开始时间
            while (x != -1 && visTime[x] == 0) { // 没有访问过 x
                visTime[x] = curTime++; // 记录访问 x 的时间
                x = edges[x]; // 访问下一个节点
            }
            if (x != -1 && visTime[x] >= startTime) { // x 在本轮循环中访问了两次，说明 x 在环上
                ans = Math.max(ans, curTime - visTime[x]); // 前后两次访问 x 的时间差，即为环长
            }
        }
        return ans; // 如果没有找到环，返回的是 ans 的初始值 -1
    }


    public static void main(String[] args) {
        LeetCode2360 demo=new LeetCode2360();
//        demo.longestCycle(new int[]{3,3,4,2,3});
        demo.longestCycle(new int[]{-1,4,-1,2,0,4,5});
    }
}
