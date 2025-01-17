package leetcode.leetcode0001_1000.leetcode601_700.leetcode0601_0610;

public class LeetCode0605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if (len == 1) {
            if (flowerbed[0] == 1) {
                if (n > 0) return false;
            }
            if (flowerbed[0] == 0) {
                if (n > 1) return false;
            }
            return true;
        } else if (len == 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                if (n > 1) return false;
            }
            if (n > 0) return false;
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            //没中花
            if (flowerbed[i] == 0) {
                //只用判断1 =0
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }

                } else if (i == flowerbed.length - 1) {
                    //判断 i-1 =0
                    if (flowerbed[i - 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }
                } else {
                    //i-1 i+1  =0
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        n--;
                        flowerbed[i] = 1;
                    }
                }


            }
            if (n <= 0) {
                return true;
            }

        }
        return false;
    }
}
