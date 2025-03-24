package leetcode.leetcode0001_1000.leetcode701_800.leetcode0701_0710;

public class LeetCode0707 {

    int size;
    Node node;


    public LeetCode0707() {
        size = 0;
        node = null;
    }

    public int get(int index) {
        if (index >= size) return -1;
        Node head = node;
        int count = 0;
        while (count < index) {
            ++count;
            head = head.next;
        }
        return head.val;
    }

    public void addAtHead(int val) {
        node = new Node(val, node);
        ++size;
    }

    public void addAtTail(int val) {
        node = this.delete(size, 0, node, true, val);
        ++size;
    }

    public void addAtIndex(int index, int val) {
        if (index <= size) {
            int count = 0;
            node = this.delete(index, count, node, true, val);
            ++size;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < size) {
            int count = 0;
            node = this.delete(index, count, node, false, 0);
            --size;
        }
    }

    private Node delete(int index, int count, Node node, boolean flag, int val) {

        if (flag) {
            if (count == index) {
                Node newNode = new Node(val);
                newNode.next = node;
                return newNode;
            } else {
                node.next = this.delete(index, ++count, node.next, flag, val);
                return node;
            }

        } else {
            if (count == index) {
                return node.next;
            } else {
                node.next = this.delete(index, ++count, node.next, flag, val);
                return node;
            }
        }

    }

    public static void main(String[] args) {
        LeetCode0707 demo = new LeetCode0707();
        demo.addAtHead(1);
        demo.addAtTail(3);
        demo.addAtIndex(1, 2);    // 链表变为 1->2->3
        demo.get(1);              // 返回 2
        demo.deleteAtIndex(1);    // 现在，链表变为 1->3
        demo.get(1);              // 返回 3
    }
}

class Node {
    int val;
    Node next;


    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}