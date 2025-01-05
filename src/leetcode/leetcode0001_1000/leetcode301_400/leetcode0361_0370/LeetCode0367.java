package leetcode.leetcode0001_1000.leetcode301_400.leetcode0361_0370;

public class LeetCode0367 {


//    public boolean isPerfectSquare(int num) {
//        double err = 1e-15;
//        double t = num;
//        while (Math.abs(t - num / t) > err * t) {
//            t = (num / t + t) / 2.0;
//        }
//        int result = (int) t;
//        return result * result == num;
//    }


    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int left = 1;
        int right = num / 2;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (mid > num / mid) {
                right = mid - 1;
            } else if (mid < num / mid) {
                left = mid + 1;
            } else {
                if (mid * mid == num)
                    return true;
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCode0367 demo=new LeetCode0367();
        demo.isPerfectSquare(83);
    }
}
