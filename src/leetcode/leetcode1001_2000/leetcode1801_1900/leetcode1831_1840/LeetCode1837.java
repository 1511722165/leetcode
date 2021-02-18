package leetcode.leetcode1001_2000.leetcode1801_1900.leetcode1831_1840;

public class LeetCode1837 {
	 public int lengthOfLongestSubstring(String s) {
		 // ��¼�ַ���һ�γ��ֵ�λ��
		        int[] last = new int[128];
		        for(int i = 0; i < 128; i++) {
		            last[i] = -1;
		        }
		        int n = s.length();

		        int res = 0;
		        int start = 0; // ���ڿ�ʼλ��
		        for(int i = 0; i < n; i++) {
		            int index = s.charAt(i);
		            start = Math.max(start, last[index] + 1);
		            res   = Math.max(res, i - start + 1);
		            last[index] = i;
		        }

		        return res;
		    }
}
