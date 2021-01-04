package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0961_0970;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode0970 {
	// public List<Integer> powerfulIntegers(int x, int y, int bound) {
	// int temp = 0;
	// if(bound<2){
	// new ArrayList<>();
	// }
	// Set set = new HashSet<>();
	// for (int j = 0; j < 20; j++) {
	// temp = (int) Math.pow(x, j);
	// if (temp <= bound - 1) {
	// for (int i = 0; i < 20; i++) {
	// if ((int) Math.pow(y, i) + temp <= bound) {
	// set.add((int) Math.pow(y, i) + temp);
	// } else {
	// break;
	// }
	// }
	//
	// } else {
	// break;
	// }
	//
	// }
	// return new ArrayList<>(set);
	// }

	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		Set<Integer> set = new HashSet<>();
		for (int a = 1; a < bound; a *= x) {
			for (int b = 1; a + b <= bound; b *= y) {
				set.add(a + b);
				if (y == 1)
					break;
			}
			if (x == 1)
				break;
		}
		return new ArrayList<>(set);
	}
}
