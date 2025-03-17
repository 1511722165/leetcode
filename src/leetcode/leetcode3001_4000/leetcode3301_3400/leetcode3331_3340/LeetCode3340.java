package leetcode.leetcode3001_4000.leetcode3301_3400.leetcode3331_3340;

public class LeetCode3340 {

//    public boolean isBalanced(String num) {
//        char[] cs=num.toCharArray();
//        int qi=0,ou=0;
//        for (int i=0;i< cs.length;){
//            ou+=(cs[i]-'0');
//            i+=2;
//        }
//        for (int i=1;i< cs.length;){
//            qi+=(cs[i]-'0');
//            i+=2;
//        }
//        if(ou==qi)return true;
//        return false;
//    }

    boolean isBalanced(String num) {
        int s = 0;
        char[] digits = num.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            int c = digits[i] - '0';
            s += i % 2 > 0 ? c : -c;
        }
        return s == 0;
    }
}
