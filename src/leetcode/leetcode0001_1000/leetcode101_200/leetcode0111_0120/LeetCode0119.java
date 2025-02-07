package leetcode.leetcode0001_1000.leetcode101_200.leetcode0111_0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0119 {
//	public List<Integer> getRow(int rowIndex) {
//		rowIndex = rowIndex + 1;
//		List<List<Integer>> lists = new ArrayList<>();
//		List<Integer> list1 = new ArrayList<>();
//		List<Integer> list2 = new ArrayList<>();
//		list1.add(1);
//		list2.add(1);
//		list2.add(1);
//		if (rowIndex == 1) {
//			lists.add(list1);
//			return list1;
//		} else if (rowIndex == 2) {
//			lists.add(list1);
//			lists.add(list2);
//			return list2;
//		}
//		lists.add(list1);
//		lists.add(list2);
//		for (int i = 2; i < rowIndex; i++) {
//			lists.add(addlist(lists.get(i - 1).size(), lists.get(i - 1)));
//		}
//		return lists.get(rowIndex - 1);
//
//	}
//
//	public List<Integer> addlist(int size, List<Integer> list) {
//		List<Integer> lists = new ArrayList<>();
//		lists.add(1);
//		for (int i = 0; i < size - 1; i++) {
//			lists.add(list.get(i) + list.get(i + 1));
//		}
//		lists.add(1);
//		return lists;
//
//	}

	private static int dp[][]=new int[33][33];

	public List<Integer> getRow(int rowIndex) {
		initDp();
		List<Integer> list=new ArrayList<>(rowIndex+1);
		for (int i=0;i<rowIndex;i++){
			list.add(dp[rowIndex-1][i]);
		}
		return list;
	}

	public static void initDp(){
		if(dp[0][0]==1){
			return;
		}
		dp[0][0]=1;
		dp[1][0]=1;
		dp[1][1]=1;
		for (int i=2;i<33;i++){
			dp[i][0]=1;
			dp[i][i]=1;
			for (int j=1;j<i;j++){
				dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
			}
		}

	}

	public static void main(String[] args) {
		LeetCode0119 demo=new LeetCode0119();
		System.out.println(demo.getRow(3));
	}
}
