package leetcode.leetcode0001_1000.leetcode101_200.leetcode0111_0120;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0118 {
	 public List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> list= new ArrayList<>();
		 for(int i=1;i<=numRows;i++){
			 list.add(addlist(i));
		 }
		 
		 
		 return list;
	    }
	 
	 
	 public List<Integer> addlist(int row){
		 List<Integer> list =new ArrayList<>();
		 return list;
		 
		 
	 }
}
