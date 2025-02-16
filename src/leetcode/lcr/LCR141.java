package leetcode.lcr;

public class LCR141 {

    public ListNode trainningPlan(ListNode head) {
        ListNode res=null;
        while (head!=null){
            ListNode node=new ListNode();
            node.val=head.val;
            node.next=res;
            res=node;
            head=head.next;
        }
        return res;
    }

}
