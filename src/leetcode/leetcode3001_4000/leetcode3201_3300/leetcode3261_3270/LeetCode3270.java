package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3261_3270;

public class LeetCode3270 {


    public int generateKey(int num1, int num2, int num3) {
        int i = 0;
        int index, res = 0;
        while (i < 4) {
            index = Math.min(num1 % 10, num2 % 10);
            index = Math.min(index, num3 % 10);
            res += index * Math.pow(10, i);
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode3270 leetCode3270 = new LeetCode3270();
        System.out.println(leetCode3270.generateKey(987, 879, 798));
    }
}
