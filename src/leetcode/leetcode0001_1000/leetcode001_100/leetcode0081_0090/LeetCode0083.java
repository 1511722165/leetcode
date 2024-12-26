package leetcode.leetcode0001_1000.leetcode001_100.leetcode0081_0090;

public class LeetCode0083 {


    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode listNode = new ListNode(head.val);
        listNode.next=dfs(head.next,head.val);
        return listNode;
    }

    private ListNode dfs(ListNode head,int val) {
        if(head==null){
            return null;
        }
        if (head.val==val){
            return dfs(head.next,val);
        }else {
            ListNode listNode = new ListNode(head.val);
            listNode.next=dfs(head.next,head.val);
            return listNode;
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
