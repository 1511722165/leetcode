package leetcode.leetcode0010_0001;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0002 {

	public class ListNode {
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
	
	
	
	
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		if(l1==null||l2==null){
//			return null;
//		}
//		List<Integer> list1 = new ArrayList<>();
//		List<Integer> list2 = new ArrayList<>();
//		List<Integer> list3 = new ArrayList<>();
//		list1=returns(l1, list1);
//		list2=returns(l2, list2);
//		ListNode l= new ListNode();
//		int i=list1.size()<=list2.size()?list1.size():list2.size();
//		list3.add(list1.get(0)+list2.get(0));
//		for(int a=1;a<i;a++){
//			int c=list1.get(a)+list2.get(a);
//			if(list3.get(a-1)>9){
//				list3.set(a-1, list3.get(a-1)-10);
//				list3.add(c+1);
//			}else{
//				list3.add(c);
//			}
//		}
//		if(list1.size()>i){
//			for(int i1=i;i1<list1.size();i1++){
//				int c=list1.get(i1);
//				if(list3.get(i1-1)>9){
//					list3.set(i1-1, list3.get(i1-1)-10);
//					list3.add(c+1);
//				}else{
//					list3.add(c);
//				}
//			}
//		}else{
//			for(int i1=i;i1<list2.size();i1++){
//				int c=list2.get(i1);
//				if(list3.get(i1-1)>9){
//					list3.set(i1-1, list3.get(i1-1)-10);
//					list3.add(c+1);
//				}else{
//					list3.add(c);
//				}
//			}
//		}
//		if(list3.get(list3.size()-1)>9){
//			list3.set(list3.size()-1, list3.get(list3.size()-1)-10);
//			list3.add(1);
//		}
//		return returnListNode(l,list3,0);
//	}
//	
//	public List<Integer> returns(ListNode l1,List<Integer> l){
//		if(l1.next!=null){
//			l.add(Integer.valueOf(l1.val));
//			returns(l1.next,l);
//			return l;
//		}
//		l.add(Integer.valueOf(l1.val));
//		return l;
//	}
//	
//	
//	public ListNode returnListNode(ListNode l,List<Integer> list,int size){
//		if(size<list.size()-1){
//			l.val=list.get(size);
//			ListNode ln=new ListNode();
//			l.next=returnListNode(ln, list, size+1);
//			return l;
//		}
//		l.val=list.get(size);
//		return l;
//	}
//	
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l = new ListNode();
		int i = 0;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				i = l2.val;
				if (i > 9) {
					l.val = i - 10;
					if (l2.next != null) {
						l2.next.val = l2.next.val + 1;
						l.next = addTwoNumbers(null, l2.next);
						return l;
					} else {
						l.next = new ListNode();
						l.next.val = 1;
						return l;
					}
				} else {
					l.val = i;
					if (l2.next != null) {
						l.next = addTwoNumbers(null, l2.next);
						return l;
					}
					return l;
				}
			} else if (l2 == null) {
				i = l1.val;
				if (i > 9) {
					l.val = i - 10;
					if (l1.next != null) {
						l1.next.val = l1.next.val + 1;
						l.next = addTwoNumbers(l1.next, null);
						return l;
					} else {
						l.next = new ListNode();
						l.next.val = 1;
						return l;
					}
				} else {
					l.val = i;
					if (l1.next != null) {
						l.val = i;
						l.next = addTwoNumbers(null, l1.next);
						return l;
					}
					return l;
				}

			} else {
				i = l1.val + l2.val;
				if (i > 9) {
					if (l1.next == null && l2.next == null) {
						l.val = i - 10;
						l.next = new ListNode();
						l.next.val = 1;
						return l;
					} else if (l2.next == null) {
						l.val = i - 10;
						l1.next.val = l1.next.val + 1;
						l.next = addTwoNumbers(l1.next, null);
						return l;
					} else if (l1.next == null){
						l.val = i - 10;
						l2.next.val = l2.next.val + 1;
						l.next = addTwoNumbers(null,l2.next);
						return l;
					}else{
						l.val = i - 10;
						l1.next.val = l1.next.val + 1;
						l.next = addTwoNumbers(l1.next,l2.next);
						return l;
						
					}
				} else {
					i = l1.val + l2.val;
					if (l1.next == null && l2.next == null) {
						l.val = i;
						return l;
					} else if (l1.next == null) {
						l.val = i;
						l.next = addTwoNumbers(null, l2.next);
						return l;
					} else if (l2.next == null) {
						l.val = i;
						l.next = addTwoNumbers(l1.next, null);
						return l;

					} else {
						l.val = i;
						l.next = addTwoNumbers(l1.next, l2.next);
						return l;
					}
				}
			}

		}
		return l;

	}
 
	
	
	
	
	
	
	
	
}
