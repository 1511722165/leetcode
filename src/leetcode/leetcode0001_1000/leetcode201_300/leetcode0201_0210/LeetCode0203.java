package leetcode.leetcode0001_1000.leetcode201_300.leetcode0201_0210;

public class LeetCode0203 {

    public ListNode removeElements(ListNode head, int val) {
        head = dfs(head, val);
        return head;
    }


    private ListNode dfs(ListNode head, int val) {

        if (head != null) {
            if (head.val == val) {
                return dfs(head.next, val);
            } else {
                head.next = dfs(head.next, val);
                return head;
            }
        } else {

            return head;
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