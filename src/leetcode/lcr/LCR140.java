package leetcode.lcr;

public class LCR140 {


    public ListNode trainingPlan(ListNode head, int cnt) {
        int size = getSize(head);
        while (size > cnt) {
            head = head.next;
            size--;
        }
        return head;
    }

    private int getSize(ListNode node) {
        if (node == null) return 0;
        if (node.next != null) {
            return 1 + getSize(node.next);
        } else {
            return 1;
        }

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
