package leetcode.leetcode0001_1000.leetcode101_200.leetcode0111_0120;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0118 {
	// public List<List<Integer>> generate(int numRows) {
	// List<List<Integer>> list = new ArrayList<>();
	// for (int i = 1; i <= numRows; i++) {
	// list.add(addlist(i, list));
	// }
	// return list;
	// }
	//
	// public List<Integer> addlist(int row, List<List<Integer>> lists) {
	// List<Integer> list = new ArrayList<>();
	// if (row == 1) {
	// list.add(1);
	// return list;
	// } else if (row == 2) {
	// list.add(1);
	// list.add(1);
	// return list;
	// } else {
	// list.add(1);
	// for (int i = 0; i < lists.get(row - 2).size() - 1; i++) {
	// list.add(lists.get(row - 2).get(i) + lists.get(row - 2).get(i + 1));
	// }
	// list.add(1);
	//
	// }
	// return list;
	//
	// }

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lists = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list2.add(1);
		list2.add(1);
		if (numRows == 0) {
			return lists;
		}

		else if (numRows == 1) {
			lists.add(list1);
			return lists;
		} else if (numRows == 2) {
			lists.add(list1);
			lists.add(list2);
			return lists;
		}
		lists.add(list1);
		lists.add(list2);
		for (int i = 2; i < numRows; i++) {
			lists.add(addlist(lists.get(i - 1).size(), lists.get(i - 1)));
		}
		return lists;

	}

	public List<Integer> addlist(int size, List<Integer> list) {
		List<Integer> lists = new ArrayList<>();
		lists.add(1);
		for (int i = 0; i < size - 1; i++) {
			lists.add(list.get(i) + list.get(i + 1));
		}
		lists.add(1);
		return lists;

	}

	
	
//	    public List<List<Integer>> generate(int numRows) {
//	        List<List<Integer>> triangle = new ArrayList(numRows);
//	        if(numRows == 0) {
//	            return triangle;
//	        }
//	        triangle.add(new ArrayList(1));
//	        triangle.get(0).add(1);
//	        for(int i = 1; i < numRows; ++i) {
//	            triangle.add(new ArrayList(i + 1));
//	            List<Integer> preLevel = triangle.get(i - 1);
//	            List<Integer> currLevel = triangle.get(i);
//	            currLevel.add(1);
//	            int j = 1, mid = i / 2;
//	            while(j <= mid) {
//	                currLevel.add(preLevel.get(j - 1) + preLevel.get(j));
//	                ++j;
//	            }
//	            while(j <= i) {
//	                currLevel.add(currLevel.get(i - j));
//	                ++j;
//	            }        
//	        }
//	        return triangle;
//	    }
	public static void main(String[] args) {
		LeetCode0118 demo = new LeetCode0118();
		demo.generate(0);
	}
}
