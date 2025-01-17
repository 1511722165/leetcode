package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3091_3100;

public class LeetCode3096 {

    public int minimumLevels(int[] possible) {
        int Alice = possible[0] == 0 ? -1 : 1;
        int Bob = 0;
        for (int i = 1; i < possible.length; i++) {
            if (possible[i] == 0) {
                Bob--;
            } else {
                Bob++;
            }
        }
        int index = 1;
        while (index < possible.length - 1 && Alice <= Bob) {
            if (possible[index] == 1) {
                Alice++;
                Bob--;
            } else {
                Alice--;
                Bob++;
            }
            index++;
        }
        if (Alice > Bob) return index;
        return -1;
    }
}
