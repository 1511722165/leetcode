package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1491_1500;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1496 {
	// public boolean isPathCrossing(String path) {
	// int x = 0;
	// int y = 0;
	// Map<String, String> map = new HashMap<String, String>();
	// map.put(x + " " + y, "");
	// for (int i = 0; i < path.length(); i++) {
	// switch (path.charAt(i)) {
	// case 'N':
	// y++;
	// break;
	// case 'S':
	// y--;
	// break;
	// case 'E':
	// x++;
	// break;
	// case 'W':
	// x--;
	// break;
	// default:
	// }
	// if (map.containsKey(x + " " + y)) {
	// return true;
	// } else {
	// map.put(x + " " + y, "");
	// }
	// }
	// return false;
	// }
	//
	public boolean isPathCrossing(String path) {
		if (path.contains("NS") || path.contains("SN") || path.contains("EW") || path.contains("WE"))
			return true;
		char[] pat = path.toCharArray();
		int N = 0;
		int S = 0;
		int E = 0;
		int W = 0;
		for (int i = 0; i < pat.length; i++) {
			switch (pat[i]) {
			case 'N':
				N++;
				break;
			case 'S':
				S++;
				break;
			case 'E':
				E++;
				break;
			case 'W':
				W++;
				break;
			}
			if (N == S && E == W)
				return true;
		}
		return false;
	}
}
