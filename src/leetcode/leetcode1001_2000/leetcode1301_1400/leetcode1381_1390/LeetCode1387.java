package leetcode.leetcode1001_2000.leetcode1301_1400.leetcode1381_1390;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode1387 {

    public static void main(String[] args) {
        LeetCode1387 demo = new LeetCode1387();
        System.out.println(demo.getKth(118, 974, 826));
//        System.out.println(demo.getKth(7,11,4));
//
//        System.out.println(demo.getKth(12,15,2));
    }


    public static HashMap<Integer, Integer> map = new HashMap<>(1000);

    public int getKth(int lo, int hi, int k) {
        map.put(1, 0);
        PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> a.value == b.value ? a.index - b.index : a.value - b.value);
        for (int i = lo; i <= hi; i++) {
            queue.offer(new Node(dfs(i), i));
        }
        while (k > 1) {
            queue.poll();
            k--;
        }
        return queue.poll().index;

    }


    private int dfs(Integer i) {
        if (map.containsKey(i)) {
            return map.get(i);
        }
        int count;
        if (i % 2 == 0) {
            count = dfs(i / 2);
            map.put(i / 2, count);
        } else {
            count = dfs(3 * i + 1);
            map.put(3 * i + 1, count);
        }
        map.put(i, count + 1);
        return count + 1;
    }
}

class Node {
    int value;
    int index;

    public Node(Integer value, Integer index) {
        this.value = value;
        this.index = index;
    }
}