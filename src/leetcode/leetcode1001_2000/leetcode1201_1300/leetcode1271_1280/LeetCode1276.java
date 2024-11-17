package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1271_1280;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1276 {

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> list = new ArrayList<>();
        if (tomatoSlices == 0 && cheeseSlices == 0) {
            list.add(0);
            list.add(0);
            return list;
        } else if (tomatoSlices % 2 == 1 || tomatoSlices > cheeseSlices * 4 || tomatoSlices < cheeseSlices * 2) {
            return list;
        } else if ((tomatoSlices - 2 * cheeseSlices) % 2 == 0) {
            list.add((tomatoSlices - 2 * cheeseSlices) / 2);
            list.add(cheeseSlices - (tomatoSlices - 2 * cheeseSlices) / 2);
            return list;
        } else {
            return list;
        }
    }

    public static void main(String[] args) {
        LeetCode1276 leetCode1276 = new LeetCode1276();
        leetCode1276.numOfBurgers(16, 7);
    }
}
