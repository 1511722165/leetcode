package leetcode.leetcode0001_1000.leetcode801_900.leetcode0851_0860;


import java.util.PriorityQueue;
import java.util.TreeSet;

class ExamRoom {
    int n;
    TreeSet<Integer> seats;
    PriorityQueue<int[]> pq;

    public ExamRoom(int n) {
        this.n = n;
        this.seats = new TreeSet<Integer>();
        this.pq = new PriorityQueue<int[]>((a, b) -> {
            int d1 = a[1] - a[0], d2 = b[1] - b[0];
            return d1 / 2 < d2 / 2 || (d1 / 2 == d2 / 2 && a[0] > b[0]) ? 1 : -1;
        });
    }

    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0);
            return 0;
        }
        int left = seats.first(), right = n - 1 - seats.last();
        while (seats.size() >= 2) {
            int[] p = pq.peek();
            if (seats.contains(p[0]) && seats.contains(p[1]) && seats.higher(p[0]) == p[1]) { // 不属于延迟删除的区间
                int d = p[1] - p[0];
                if (d / 2 < right || d / 2 <= left) { // 最左或最右的座位更优
                    break;
                }
                pq.poll();
                pq.offer(new int[]{p[0], p[0] + d / 2});
                pq.offer(new int[]{p[0] + d / 2, p[1]});
                seats.add(p[0] + d / 2);
                return p[0] + d / 2;
            }
            pq.poll(); // leave 函数中延迟删除的区间在此时删除
        }
        if (right > left) { // 最右的位置更优
            pq.offer(new int[]{seats.last(), n - 1});
            seats.add(n - 1);
            return n - 1;
        } else {
            pq.offer(new int[]{0, seats.first()});
            seats.add(0);
            return 0;
        }
    }

    public void leave(int p) {
        if (p != seats.first() && p != seats.last()) {
            int prev = seats.lower(p), next = seats.higher(p);
            pq.offer(new int[]{prev, next});
        }
        seats.remove(p);
    }
}
//
//public class ExamRoom {
//
//    public static Node node;
//    int max;
//
//    public ExamRoom(int n) {
//        max = n - 1;
//    }
//
//    public int seat() {
//        if (node == null) {
//            node = new Node(0);
//            return 0;
//        }
//        Node add = new Node();
//        int len = 0, index = 0;
//        if (node.index != 0) {
//            add.index = 0;
//            len = Math.max(len, node.index);
//        }
//        add = getNode(node, max, len, add);
//        node=addNode(node, add);
//        return add.index;
//    }
//
//
//    private Node getNode(Node node, int max, int len, Node add) {
//        if (node.next != null) {
//            int l = node.next.index - node.index - 1;
//            if (l % 2 == 0) {
//                int mid = l / 2 + node.index;
//                if (mid - node.index > len) {
//                    len = mid - node.index;
//                    add.index = mid;
//                }
//            } else {
//                int mid = (l + 1) / 2 + node.index;
//                if (mid - node.index > len) {
//                    len = mid - node.index;
//                    add.index = mid;
//                }
//            }
//
//            add=this.getNode(node.next,max,len,add);
//        } else {
//            if (node.index != max) {
//                if (max - node.index > len) {
//                    add = new Node(max);
//                }
//            }
//        }
//        return add;
//    }
//
//
//    private Node addNode(Node node, Node add) {
//        if (node.index > add.index) {
//            add.next = node;
//            return add;
//        } else if (node.next == null) {
//            node.next = add;
//            return node;
//        } else {
//            node.next = addNode(node.next, add);
//
//            return node;
//        }
//
//    }
//
//    public void leave(int p) {
//        node = dfs(node, p);
//    }
//
//    private Node dfs(Node node, int p) {
//        if (node.index == p) {
//            return node.next;
//        } else {
//            node.next = dfs(node.next, p);
//            return node;
//        }
//    }
//}
//
//class Node {
//
//    Node next;
//    int index;
//
//    public Node(int index) {
//        this.index = index;
//    }
//
//    public Node() {
//    }
//}