package leetcode.leetcode0001_1000.leetcode101_200.leetcode0111_0120;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0119 {
	public List<Integer> getRow(int rowIndex) {
		rowIndex = rowIndex + 1;
		List<List<Integer>> lists = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list2.add(1);
		list2.add(1);
		if (rowIndex == 1) {
			lists.add(list1);
			return list1;
		} else if (rowIndex == 2) {
			lists.add(list1);
			lists.add(list2);
			return list2;
		}
		lists.add(list1);
		lists.add(list2);
		for (int i = 2; i < rowIndex; i++) {
			lists.add(addlist(lists.get(i - 1).size(), lists.get(i - 1)));
		}
		return lists.get(rowIndex - 1);

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
}
