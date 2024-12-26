package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1841_1850;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class LeetCode1847 {

    public int[] closestRoom1(int[][] rooms, int[][] queries) {

        int[] res = new int[queries.length];
        int[] size = new int[rooms.length + 1];
        int max = 0;
        for (int[] room : rooms) {
            max = Math.max(max, room[1]);
            size[room[0]] = room[1];
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][1] > max) {
                res[i] = -1;
            } else {
                //找到最近一个满足size条件的
                int j = 0;
                boolean flag = true;
                int index = queries[i][0] > size.length ? size.length - 1 : queries[i][0];
                while (flag) {
                    if (index + j < size.length && size[index + j] >= queries[i][1]) {
                        res[i] = index + j;
                        flag = false;
                    }
                    if (index - j > 0 && size[index - j] >= queries[i][1]) {
                        res[i] = index - j;
                        flag = false;
                    }

                    j++;
                }
            }
        }
        return res;
    }

    public static Integer MAX = 10_000_000;
    public int[] closestRoom(int[][] rooms, int[][] queries) {
        // 房间按面积从大到小排序
        Arrays.sort(rooms, (x, y) -> y[1] - x[1]);
        int n = queries.length;
        Integer[] index = new Integer[n];
        Arrays.setAll(index, i -> i);
        // 将查询按面积从大到小排序
        Arrays.sort(index, (a, b) -> queries[b][1] - queries[a][1]);
        int[] res = new int[n];
        Arrays.fill(res, -1);
        int roomIdx = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : index) {
            int preferred = queries[i][0];
            int minSize = queries[i][1];
            // 把面积大于等于minSize的房间加入set
            while (roomIdx < rooms.length && rooms[roomIdx][1] >= minSize) {
                set.add(rooms[roomIdx][0]);
                roomIdx++;
            }
            // 跟preferred最接近的应该是[a, preferred, b]
            Integer a = set.floor(preferred);
            int abs = Integer.MAX_VALUE;
            if (a != null) {
                res[i] = a;
                abs = preferred - a;
            }
            Integer b = set.ceiling(preferred);
            if (b != null && b - preferred < abs) {
                res[i] = b;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode1847 demo = new LeetCode1847();
        demo.closestRoom(new int[][]{{2, 2}, {1, 2}, {3, 2}},
                new int[][]{{3, 1}, {3, 3}, {5, 2}});
    }
}
