package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

public class LeetCode0003 {

//	public int lengthOfLongestSubstring(String s) {
////		char[] c = s.toCharArray();
//		int length=128;
//		Map<Character, Integer> map2 = new HashMap<>(length);
//		length=s.length();
//		int old = 0;
//		int i = 0;
//		int flag = 0;
//		int re = 0;
//		for (int n = 0; n < length; n++) {
//			if (map2.containsKey(s.charAt(n))) {
//				old = map2.get(s.charAt(n));
//				for (int k = flag; k <= old; k++) {
//					map2.remove(s.charAt(k));
//					flag++;
//					i--;
//				}
//				map2.put(s.charAt(n), n);
//				i++;
//				re = re > i ? re : i;
//			} else {
//				map2.put(s.charAt(n), n);
//				i++;
//				re = re > i ? re : i;
//			}
//
//		}
//		return re;
//	}
	
	
	
	public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
	

	public static void main(String[] args) {
		LeetCode0003 demo = new LeetCode0003();
		demo.lengthOfLongestSubstring("umvejcuuk");
	}

}
