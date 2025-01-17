package leetcode.leetcode0001_1000.leetcode401_500.leetcode0451_0460;

public class LeetCode0459 {

//    public boolean repeatedSubstringPattern(String s) {
//        int len = s.length();
//        for (int i = 1; i <= len / 2; i++) {
//            int count = len % i;
//            if (count == 0) {
//                String sa = s.substring(0, i);
//                String[] sar = s.split(sa);
//                if (sar.length == 0) return true;
//            }
//        }
//        return false;
//    }


    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                int left = 0;
                int right = i;
                String str = s.substring(left, right);
                while (right <= len) {
                    if (str.equals(s.substring(left, right))) {
                        if (right == len) {
                            return true;
                        }
                        left += i;
                        right += i;
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode0459 demo = new LeetCode0459();
        demo.repeatedSubstringPattern("abab");
    }
}
