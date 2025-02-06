package leetcode.leetcode0001_1000.leetcode501_600.leetcode0541_0550;

public class LeetCode0541 {

    public String reverseStr(String s, int k) {
        int len = s.length();
        int n = len / (2 * k);
        int m = len % (2 * k);
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int mid = k;
        int end = 2 * k;
        while (n > 0) {
            StringBuilder stringBuilder = new StringBuilder(s.substring(start, mid));
            sb.append(stringBuilder.reverse());
            sb.append(s.substring(mid, end));
            n--;
            start = end;
            mid += 2 * k;
            end += 2 * k;
        }
        if (m < k && m > 0) {
            StringBuilder stringBuilder = new StringBuilder(s.substring(start));
            sb.append(stringBuilder.reverse());

        } else if (m >= k) {
            StringBuilder stringBuilder = new StringBuilder(s.substring(start, mid));
            sb.append(stringBuilder.reverse());
            sb.append(s.substring(mid));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        LeetCode0541 demo = new LeetCode0541();
        System.out.println(demo.reverseStr("abcdefg", 8));

//        System.out.println(demo.reverseStr("abcdefg",2));
//        System.out.println(demo.reverseStr("abcd",2));
//        System.out.println(demo.reverseStr("a",2));
    }
}
