package leetcode.lcr;

public class LCR142 {



    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            ListNode listNode = new ListNode();
            listNode.val = l2.val;
            listNode.next = trainningPlan(l1, l2.next);
            return listNode;
        } else {
            ListNode listNode = new ListNode();
            listNode.val = l1.val;
            listNode.next = trainningPlan(l1.next, l2);
            return listNode;
        }
    }


}
