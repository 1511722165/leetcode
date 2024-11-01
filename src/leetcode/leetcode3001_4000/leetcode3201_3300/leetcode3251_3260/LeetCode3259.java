package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3251_3260;

import java.util.Arrays;

public class LeetCode3259 {

    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        long preA = 0L;
        long preB = 0L;
        long curA = energyDrinkA[0];
        long curB = energyDrinkB[0];

        for (int i = 1; i < energyDrinkA.length; i++) {
            long tmpA = curA;
            long tmpB = curB;
            curA = Math.max(curA, preB) + energyDrinkA[i];
            curB = Math.max(curB, preA) + energyDrinkB[i];
            preA = tmpA;
            preB = tmpB;
        }

        return Math.max(curA, curB);
    }
}
