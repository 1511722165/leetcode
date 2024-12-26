package leetcode.leetcode1001_2000.leetcode1301_1400.leetcode1331_1340;

import leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3261_3270.LeetCode3266;

import java.util.*;

public class LeetCode1338 {


    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int temp = 0;
        if (arr[0] == arr[len - 1]) return 1;
        int count = 1;
        Nodes nodes = null;
        for (int i = 1; i < len; i++) {
            if (arr[i] == arr[temp]) {
                count++;
                if (i == len - 1) {
                    if (2 * count >= len) {
                        return 1;
                    }
                    nodes = this.getNodes(nodes, count);
                }
            } else if (arr[i] != arr[temp]) {
                if (2 * count >= len) {
                    return 1;
                }
                nodes = this.getNodes(nodes, count);
                temp = i;
                count = 1;
            }
        }
        count = 0;
        temp = 0;
        while (nodes != null) {
            count += nodes.value;
            nodes = nodes.next;
            temp++;
            if (count * 2 >= len) {
                return temp;
            }
        }
        return temp;
    }

    private Nodes getNodes(Nodes nodes, int values) {
        if (nodes == null) {
            return new Nodes(values);
        } else {
            if (values >= nodes.value) {
                return new Nodes(values, nodes);
            } else if (nodes.next != null) {
                nodes.next = this.getNodes(nodes.next, values);
                return nodes;
            } else {
                nodes.next = new Nodes(values);
                return nodes;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode1338 demo = new LeetCode1338();
        System.out.println(demo.minSetSize(new int[]{2, 51, 46, 100, 58, 10, 48, 85, 53, 68, 40, 3, 22, 69, 76, 9, 16, 19, 48, 16, 3, 62, 61, 80, 26, 98, 40, 69, 46, 97, 37, 55, 40, 16, 92, 7, 98, 70, 5, 72, 44, 15, 40, 13, 84, 70, 10, 11, 49, 27, 92, 62, 22, 98, 55, 11, 27, 28, 5, 34, 58, 15, 52, 62, 30, 53, 9, 96, 59, 72, 48, 65, 24, 40, 67, 32, 4, 49, 66, 82, 96, 78, 26, 77, 32, 50, 9, 59, 15, 61, 18, 15, 51, 13}));
    }
}


class Nodes {
    Nodes next;
    int value;

    public Nodes() {
    }

    public Nodes(int value) {
        this.value = value;
    }

    public Nodes(int value, Nodes next) {
        this.value = value;
        this.next = next;
    }
}