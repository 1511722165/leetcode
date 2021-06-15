package leetcode.leetcode0001_1000.leetcode201_300.leetcode0271_0280;

public class LeetCode0278 {

    public int firstBadVersion(int n) {
        if(isBadVersion(1)){
            return 1;
        }
        if(n > 1 && !isBadVersion(n - 1)){
            return n;
        }

        long left = 2, right = n - 1, mid = -1;
        while(left <= right){
            mid = (left + right) >> 1;
            if(isBadVersion((int)mid)){
                // if(!isBadVersion((int)mid - 1)){
                //     return (int) mid;
                // }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int)left;
    }



    public boolean isBadVersion(int version){
        return true;
    }
}
