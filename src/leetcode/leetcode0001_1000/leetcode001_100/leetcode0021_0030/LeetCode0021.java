package leetcode.leetcode0001_1000.leetcode001_100.leetcode0021_0030;

public class LeetCode0021 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return  dfs(list1,list2);
    }

    private ListNode dfs(ListNode list1, ListNode list2){
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode listNode=new ListNode();
        if(list1.val<=list2.val){
            listNode.val=list1.val;
            if(list1.next==null){
                listNode.next=list2;
            }else {
                listNode.next=dfs(list1.next,list2);
            }
        }else {
            listNode.val=list2.val;
            if(list2.next==null){
                listNode.next=list1;
                list2=null;
            }else {
                listNode.next=dfs(list1,list2.next);
            }
        }
        return listNode;
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
