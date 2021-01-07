package leetcode.leetcode1001_2000.leetcode1401_1500.leetcode1441_1450;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1447 {
	// public List<String> simplifiedFractions(int n) {
	// if (n == 1)
	// return new ArrayList<String>();
	// Map<Double, String> map = new HashMap<Double, String>();
	// List<String> list = new ArrayList<String>();
	// for (int i = 2; i <= n; i++) {
	// list.add("1/" + i);
	// for (int j = 2; j < i; j++) {
	// if (i % j != 0) {
	// if (!map.containsKey(1.0 * i / j)) {
	// list.add(j + "/" + i);
	// map.put(1.0 * i / j, "");
	// }
	// }
	// }
	//
	// }
	// return list;
	// }

	public static List<String> simplifiedFractions(int n) {
		List<String> res = new ArrayList<>();
		boolean[][] flag = new boolean[n + 1][n + 1]; // 行是分母，列是分子
		for (int i = 1; i <= n; i++) { // 初始化为true
			Arrays.fill(flag[i], true);
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (flag[i][j]) {
					int count = 2;
					while (count * i <= n) { // 分子分母按照自身递增，递增得到的,说明能化简，置为false
						if (flag[count * i][count * j])
							flag[count * i][count * j] = false;
						count++;
					}

					StringBuffer sb = new StringBuffer();
					sb.append(j).append("/").append(i);
					res.add(sb.toString());
				}
			}
		}
		return res;
	}
}
