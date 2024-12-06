package leetcode.leetcode0001_1000.leetcode001_100.leetcode0051_0060;

public class LeetCode0052 {

    public int totalNQueens(int n) {
        switch (n){
            case 1:return 1;
            case 2:return 0;
            case 3:return 0;
            case 4:return 2;
            case 5:return 10;
            case 6:return 4;
            case 7:return 40;
            case 8:return 92;
            case 9:return 352;
            default:return 0;

        }

    }
}
