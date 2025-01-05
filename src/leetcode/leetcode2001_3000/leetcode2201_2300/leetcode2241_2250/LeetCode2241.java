package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2241_2250;

public class LeetCode2241 {
}

class ATM {
    int[] deposit;
    static int[] money = {20, 50, 100, 200, 500};

    public ATM() {
        deposit = new int[5];
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            deposit[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] res = new int[5];
        int index = 4;
        while (index >= 0) {
            int count = amount / money[index];
            if (count <= deposit[index]) {
                res[index] = count;
            } else {
                res[index] = deposit[index];
            }
            amount = amount - res[index] * money[index];
            index--;
        }
        if (amount > 0) return new int[]{-1};

        for (int i = 0; i < 5; i++) {
            deposit[i] = deposit[i] - res[i];
        }
        return res;

    }
}