package leetcode.leetcode0001_1000.leetcode101_200.leetcode0171_0180;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode0179 {
    Node[] nodes = new Node[10];

    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            Node node = new Node(num);
            int index = (node.num.charAt(0) + 2) % 10;
            //
            this.addNode(node, index);
        }
        for (int i = 9; i >= 0; i--) {
            Node node = nodes[i];
            while (node != null) {
                sb.append(node.num);
                node = node.next;
            }
        }
        //判断一下全0
        String res = sb.toString();
        if (res.charAt(0) == '0') return "0";
        return sb.toString();
    }

    private void addNode(Node node, int index) {
        if (nodes[index] == null) {
            nodes[index] = node;
        } else {
            Node head = nodes[index];
            nodes[index] = this.sort(head, node);
        }
    }

    private Node sort(Node head, Node node) {
        if (head == null) {
            return node;
        }
        if (node.compareTo(head) > 0) {
            node.next = head;
            return node;
        } else {
            head.next = this.sort(head.next, node);
            return head;
        }
    }

    public static void main(String[] args) {
        LeetCode0179 demo = new LeetCode0179();
//        demo.largestNumber(new int[]{3,30,34,5,9});
        demo.largestNumber(new int[]{432, 43243});
//        demo.largestNumber(new int[]{111311, 1113});
    }

}

class Node implements Comparable<Node> {
    String num;

    Node next;

    public Node(int num) {
        this.num = Integer.toString(num);
    }

    @Override
    public int compareTo(Node head) {
        if (num.equals(head.num)) {
            return 1;
        }
        //自定义比较规则：对于两个数字 a 和 b，比较 a + b 和 b + a 的字典序（即字符串拼接后的结果）, 如果 a + b 大于 b + a，则 a 应该排在 b 前面，否则 b 应该排在 a 前面
        String sb1 = num + head.num;
        String sb2 = head.num + num;
        if (sb1.compareTo(sb2) > 0)
            return 1;
        return -1;
    }
}
