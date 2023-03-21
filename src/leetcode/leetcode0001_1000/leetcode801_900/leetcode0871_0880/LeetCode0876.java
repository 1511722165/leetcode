package leetcode.leetcode0001_1000.leetcode801_900.leetcode0871_0880;

public class LeetCode0876 {


    public ListNode middleNode(ListNode head) {
        ListNode res=head;
        int i=0;
        while(head.next!=null){
            i++;
            head=head.next;
            if(i==2) {
                res = res.next;
                i = 0;
            }
        }
    return res;
    }


      public class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
