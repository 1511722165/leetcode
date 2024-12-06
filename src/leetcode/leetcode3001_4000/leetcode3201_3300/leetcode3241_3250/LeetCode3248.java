package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3241_3250;

import java.util.List;

public class LeetCode3248 {

    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = 0;
        for (String command : commands) {
            switch (command) {
                case "DOWN":
                    ans += n;
                    break;
                case "UP":
                    ans -= n;
                    break;
                case "RIGHT":
                    ++ans;
                    break;
                case "LEFT":
                    --ans;
                    break;
                default:
                    break;
            }
        }
        return ans;
    }
}
