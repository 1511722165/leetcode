package leetcode.leetcode0010_0001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution01_10 {
	
	
	
	
	
	public class ListNode {
		int val;
		ListNode next;

		public ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}

	/**
	 * #1 两数之和
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		Map<Integer, Integer> map = new HashMap<>(length);
		for (int i = 0; i < length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				return new int[] { map.get(diff), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1==null||l2==null){
			return null;
		}
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		list1=returns(l1, list1);
		list2=returns(l2, list2);
		ListNode l= new ListNode();
		int i=list1.size()<=list2.size()?list1.size():list2.size();
		list3.add(list1.get(0)+list2.get(0));
		for(int a=1;a<i;a++){
			int c=list1.get(a)+list2.get(a);
			if(list3.get(a-1)>9){
				list3.set(a-1, list3.get(a-1)-10);
				list3.add(c+1);
			}else{
				list3.add(c);
			}
		}
		if(list1.size()>i){
			for(int i1=i;i1<list1.size();i1++){
				int c=list1.get(i1);
				if(list3.get(i1-1)>9){
					list3.set(i1-1, list3.get(i1-1)-10);
					list3.add(c+1);
				}else{
					list3.add(c);
				}
			}
		}else{
			for(int i1=i;i1<list2.size();i1++){
				int c=list2.get(i1);
				if(list3.get(i1-1)>9){
					list3.set(i1-1, list3.get(i1-1)-10);
					list3.add(c+1);
				}else{
					list3.add(c);
				}
			}
		}
		if(list3.get(list3.size()-1)>9){
			list3.set(list3.size()-1, list3.get(list3.size()-1)-10);
			list3.add(1);
		}
		return returnListNode(l,list3,0);
	}
	
	public List<Integer> returns(ListNode l1,List<Integer> l){
		if(l1.next!=null){
			l.add(Integer.valueOf(l1.val));
			returns(l1.next,l);
			return l;
		}
		l.add(Integer.valueOf(l1.val));
		return l;
	}
	
	
	public ListNode returnListNode(ListNode l,List<Integer> list,int size){
		if(size<list.size()-1){
			l.val=list.get(size);
			ListNode ln=new ListNode();
			l.next=returnListNode(ln, list, size+1);
			return l;
		}
		l.val=list.get(size);
		return l;
	}
	
	public ListNode reNode1(){
		ListNode l1 = new ListNode();
		ListNode l2 =  new ListNode();
		ListNode l3 =  new ListNode();
		ListNode l4 =  new ListNode();
		ListNode l5 =  new ListNode();
		ListNode l6 =  new ListNode();
		ListNode l7 =  new ListNode();
		l1.val=2;
		l2.val=4;
		l3.val=9;
//		l4.val=9;
//		l5.val=9;
//		l6.val=9;
//		l7.val=9;
//		l6.next=l7;
//		l5.next=l6;
//		l4.next=l5;
//		l3.next=l4;
		l2.next=l3;
		l1.next=l2;
		return l1;
		
	}
	public ListNode reNode2(){
		ListNode l1 = new ListNode();
		ListNode l2 =  new ListNode();
		ListNode l3 =  new ListNode();
		ListNode l4 =  new ListNode();
//		l1.val=9;
//		l2.val=9;
//		l3.val=9;
//		l4.val=9;
		l1.val=5;
		l2.val=6;
		l3.val=4;
		l4.val=9;
		l3.next=l4;
		l2.next=l3;
		l1.next=l2;
		return l1;
		
		
	}
	

	public static void main(String[] args) {
		Solution01_10 demo = new Solution01_10();
//		int[] nums = { 2, 7, 11, 15 };
//		int target = 9;
//		demo.twoSum(nums, target);
		ListNode l1 = demo.reNode1();
		ListNode l2 = demo.reNode2();
		ListNode lr=demo.addTwoNumbers(l1,l2);
		System.out.println(lr.toString());
	}
		
	

}
