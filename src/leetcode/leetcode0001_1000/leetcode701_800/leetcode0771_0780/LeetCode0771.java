package leetcode.leetcode0001_1000.leetcode701_800.leetcode0771_0780;

public class LeetCode0771 {
	public int numJewelsInStones(String jewels, String stones) {
		int[] tc = new int[58];
		char[] sc = stones.toCharArray();
		char[] jc = jewels.toCharArray();
		for (int i = 0; i < sc.length; i++) {
			tc[sc[i] - 65] = tc[sc[i] - 65] + 1;
		}
		int res = 0;
		for (int j = 0; j < jc.length; j++) {
			res += tc[jc[j] - 65];
		}
		return res;
	}

	public static void main(String[] args) {
		LeetCode0771 demo = new LeetCode0771();
		demo.numJewelsInStones("aA", "aAAbbbb");
	}
}
